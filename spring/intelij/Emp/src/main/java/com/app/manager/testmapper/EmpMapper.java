package com.app.manager.testmapper;

import com.app.manager.testdomain.EmpDTO;
import com.app.manager.testdomain.EmpSearchOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

   List<EmpDTO> selectAll();

   EmpDTO selectByempno(int empno);

   List<EmpDTO> searchOption(EmpSearchOption empSearchOption);

   int insertEmp(EmpDTO empDTO);

   int updateEmp(EmpDTO empDTO);

   int deleteByempno(int empno);

}
