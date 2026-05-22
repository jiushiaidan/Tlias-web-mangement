package com.tlias.service;

import com.tlias.common.PageResult;

import java.time.LocalDate;

public interface EmpService {
    PageResult getPageEmp(java.lang.String name, java.lang.Integer gender, LocalDate begin, LocalDate end, java.lang.Integer page, java.lang.Integer pageSize);
}
