package com.app.manager.testservice;

import com.app.manager.testdomain.EmpDTO;
import com.app.manager.testdomain.EmpSearchOption;
import com.app.manager.testmapper.EmpMapper;
import com.app.manager.testmapper.EmpMyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired(required = false)
    private EmpMapper empMapper;


    public List<EmpDTO> selectAll() {

        return empMapper.selectAll();
    }

    public List<EmpDTO> getSearchList(EmpSearchOption empSearchOption) {

        return empMapper.searchOption(empSearchOption);
    }


    public int insertEmp(EmpDTO empDTO) {

        return empMapper.insertEmp(empDTO);
    }

   public EmpDTO selectByempno(int empno) {

        return empMapper.selectByempno(empno);
   }


   public int updateEmp(EmpDTO empDTO) {

        return empMapper.updateEmp(empDTO);
   }


   public int deleteByempno(int empno) {

        return empMapper.deleteByempno(empno);
   }

}
