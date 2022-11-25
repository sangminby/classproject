package com.app.manager.testdomain;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmpDTO {

    @Positive
    private int empno;

    @NotEmpty
    private String ename;

    private String job;
    private int mgr;
    private String hiredate;

    @NotEmpty
    private int sal;

    @NotEmpty
    private int comm;

    private int deptno;

}
