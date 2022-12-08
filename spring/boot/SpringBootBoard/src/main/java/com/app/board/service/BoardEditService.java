package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardEditRequest;
import com.app.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

@Service
@Log4j2
public class BoardEditService {

    @Autowired
    private BoardMapper boardMapper;


    public int edit(BoardEditRequest boardEditRequest) throws SQLException {

        MultipartFile file = boardEditRequest.getFormFile();

        File saveDir = null;
        String newFileName = null;

        if (file != null && file.isEmpty()) {

            // 새로운 파일을 저장
            String absolutePath = new File("").getAbsolutePath();
            log.info("Path >>>>>>>>>>>>>>>>> " + absolutePath);

            String path = "photo";
            saveDir = new File(absolutePath, path);

            // 폴더가 존재하지 않으면 생성
            if (!saveDir.exists()) {

                saveDir.mkdirs();
                log.info("photo dir 생성 >>>>>>");
            }

            String uuid = UUID.randomUUID().toString();
            // 새로운 파일의 이름을 생성
            newFileName = uuid + file.getOriginalFilename();
            // 새로운 저장 파일의 경로
            File newFile = new File(saveDir, newFileName);

            try {
                // 파일 저장
                file.transferTo(newFile);
                log.info("newFileName >>>" + newFileName);
            } catch (IOException e) {

                throw new RuntimeException(e);
            }

        }

        BoardDTO boardDTO = boardEditRequest.toboardDTO();

        if (newFileName != null) {

            boardDTO.setPhoto(newFileName);
        }

        log.info("boardDTO >>>> " + boardDTO);

        int result = 0;

        try {

            // DB UPDATE
            result = boardMapper.update(boardDTO);

            // 새로운 파일이 저장되고 이전 파일이 존재한다면 ! -> 이전 파일을 삭제
            String oidFileName = boardEditRequest.getOldFile();

            if (newFileName != null && oidFileName != null && !oidFileName.trim().isEmpty()) {

                File delOldFile = new File(oidFileName);

                if (delOldFile.exists()) {

                    delOldFile.delete();
                }
            }

        } catch (SQLException e) {

            log.info("SQLException ...");

            if (newFileName != null) {

                File delFile = new File(saveDir, newFileName);

                if (delFile.exists()) {

                    // 파일 삭제
                    delFile.delete();
                }
            }
        }
            return result;
    }

}
