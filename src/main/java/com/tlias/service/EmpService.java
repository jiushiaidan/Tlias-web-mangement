package com.tlias.service;

import com.tlias.common.PageEmpQuey;
import com.tlias.common.PageResult;

import java.time.LocalDate;

public interface EmpService {
    PageResult getPageEmp(PageEmpQuey pageEmpQuey);
}
