package com.app.manager.testservice;

import com.app.manager.testdomain.EmpDTO;
import com.app.manager.testmapper.EmpMapper;
import com.app.manager.testmapper.EmpMyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpMybatisService {

    @Autowired(required = false)
    private EmpMyBatisMapper empMyBatisMapper;


    public List<EmpDTO> selectAll() {

        return empMyBatisMapper.selectAll();
    }


    public int insertEmp(EmpDTO empDTO) {

        return empMyBatisMapper.insertEmp(empDTO);
    }

   public EmpDTO selectByempno(int empno) {

        return empMyBatisMapper.selectByempno(empno);
   }


   public int updateEmp(EmpDTO empDTO) {

        return empMyBatisMapper.updateEmp(empDTO);
   }


   public int deleteByempno(int empno) {

        return empMyBatisMapper.deleteByempno(empno);
   }

}
