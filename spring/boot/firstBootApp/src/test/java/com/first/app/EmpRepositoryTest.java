package com.first.app;

import com.first.app.domain.ListItemDTO;
import com.first.app.entity.Dept;
import com.first.app.entity.Emp;
import com.first.app.entity.EmpRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@Log4j2
public class EmpRepositoryTest {

    @Autowired
    private EmpRepository empRepository;


    @Test
    public void empSaveTest() {

        Dept dept = Dept.builder().deptno(30).build();

        Emp emp = empRepository.save(Emp.builder()
                                        .ename("SON")
                                        .job("MANAGER")
                                        .mgr(null)
                                        .hiredate(LocalDate.now())
                                        .sal(4000d)
                                        .comm(null)
                                        /*.deptno(30)*/
                                        .dept(dept)
                                        .build()
        );

        log.info("emp entity insert >>>>>> " + emp);
        log.info("#############################################################################################");

    }


    @Test
    public void empListTest() {

        List<Emp> list = empRepository.findAll();

        for(Emp emp : list) {

            log.info(emp);
        }
        log.info("#############################################################################################");

    }


    @Test
    public void empPagingTest() {

        Pageable pageable = PageRequest.of(0, 5, Sort.by("empno").descending());
        Page<Emp> result = empRepository.findAll(pageable);

        log.info("result >>>>>>> 조회 항목 리스트" + result.getContent());
        log.info("result >>>>>>> 전체 게시물의 개수" + result.getTotalElements());
        log.info("result >>>>>>> 전체 페이지의 개수" + result.getTotalPages());
        log.info("result >>>>>>> 현재 요청 페이지 번호" + result.getNumber());
        log.info("result >>>>>>> 페이지당 표현할 항목의 개수" + result.getSize());
        log.info("result >>>>>>> 현재 페이지에 출력된 항목의 개수" + result.getNumberOfElements());

        log.info("#############################################################################################");

    }


    @Test
    public void empJoinDeptTest() {

        List<Emp> list1 = empRepository.findEmpDept();

        for(Emp emp : list1) {

            log.info(emp);
        }

        log.info("#############################################################################################");

        Page<Emp> page = empRepository.findEmpWithDept(PageRequest.of(3,5));
        for (Emp emp : page.getContent()){

            log.info(emp);
        }

        log.info("#############################################################################################");

    }


    @Test
    public void deptWithCntTest() {

        Page<Object[]> result = empRepository.listWithCnt(PageRequest.of(0,5));

        log.info("result >>>>>>> 조회 항목 리스트" + result.getContent());
        log.info("result >>>>>>> 전체 게시물의 개수" + result.getTotalElements());
        log.info("result >>>>>>> 전체 페이지의 개수" + result.getTotalPages());
        log.info("result >>>>>>> 현재 요청 페이지 번호" + result.getNumber());
        log.info("result >>>>>>> 페이지당 표현할 항목의 개수" + result.getSize());
        log.info("result >>>>>>> 현재 페이지에 출력된 항목의 개수" + result.getNumberOfElements());

        for(Object[] arr : result.getContent()) {

            log.info(Arrays.toString(arr));
        }

        log.info("#############################################################################################");

    }


    @Test
    public void dtoListTest() {

        List<ListItemDTO> list = empRepository.findListItem();
        for(ListItemDTO listItemDTO : list) {

            log.info(listItemDTO);
        }

        log.info("#############################################################################################");

    }

}
