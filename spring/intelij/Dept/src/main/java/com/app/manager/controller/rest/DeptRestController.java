package com.app.manager.controller.rest;

import com.app.manager.domain.DeptDTO;
import com.app.manager.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api/v1/depts")
public class DeptRestController {

    @Autowired
    private DeptListService deptListService;

    @Autowired
    private DeptReadService deptReadService;

    @Autowired
    private DeptRegService deptRegService;

    @Autowired
    private DeptEditService deptEditService;

    @Autowired
    private DeptDeleteService deptDeleteService;


    // get -> 전체 리스트
    @GetMapping
    public List<DeptDTO> getDeptList() {

        return deptListService.getList();
    }


    // get/{no} -> 부서 하나의 정보
    @GetMapping("/{no}")    // /api/v1/depts/10
    public DeptDTO getDept(
                            @PathVariable("no") int deptno
    ) {

        log.info("deptno >>>>>>>>>>>>>>" + deptno);

        return deptReadService.getDept(deptno);
    }


    // post -> Json 형식의 데이터를 받아서 입력 처리
    @PostMapping    // JSOnN 데이터를 받아서 처리
    public ResponseEntity<String> regDept(@RequestBody DeptDTO deptDTO) {


        log.info("deptDTO >>>>>>>>>" + deptDTO);

        deptRegService.insertDept(deptDTO);

        // Header 정의
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("some-header", "some-value");

        // ResponseEntity<String> -> 응답 데이터를 제네릭으로 정의
        // 객체 -> 응답 데이터, http header, http status code
//        return new ResponseEntity<>("insert OK", HttpStatus.OK);
        return new ResponseEntity<>("insert OK", httpHeaders, HttpStatus.OK);
    }


    // put/{no} -> 하나의 부서정보를 수정, 모든 데이터를 수정
    @PutMapping("/{no}")
    public HttpEntity<String> editDept(
                                        @PathVariable("no") int deptno,
                                        @RequestBody DeptDTO deptDTO
    ) {

        log.info("deptno>>>>>>>" + deptno);
        log.info(deptDTO);

        // Header 정의
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("some-header", "some-value");

        deptEditService.editDept(deptDTO);

        return new HttpEntity<String>("update", httpHeaders);
    }


    // delete/{no} -> 부서정보 하나를 삭제
    @DeleteMapping("/{no}")
    public ResponseEntity<String> deleteDept(@PathVariable("no") int deptno) {

        log.info("delete >>>>>" + deptno);

        deptDeleteService.deleteDept(deptno);

        return new ResponseEntity<String>("delete", HttpStatus.OK);
    }

}
