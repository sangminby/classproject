package com.app.manager.testmapper;

import com.app.manager.testdomain.EmpDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmpMyBatisMapper {

   @Select("select * from emp")
   List<EmpDTO> selectAll();

   @Select("select * from emp where empno=#{empno}")
   EmpDTO selectByempno(int empno);

   @Insert("insert into emp values (#{empno}, #{ename}, #{job}, #{mgr}, #{hiredate}, #{sal}, #{comm}, #{deptno})")
   int insertEmp(EmpDTO empDTO);

   @Update("update emp set ename=#{ename}, job=#{job}, mgr=#{mgr}, hiredate=#{hiredate}, sal=#{sal}, comm=#{comm}, deptno=#{deptno} where empno=#{empno}")
   int updateEmp(EmpDTO empDTO);

   @Delete("delete from emp where empno=#{empno}")
   int deleteByempno(int empno);

}
