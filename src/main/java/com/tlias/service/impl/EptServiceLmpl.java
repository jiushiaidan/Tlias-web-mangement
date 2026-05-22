package com.tlias.service.impl;

import com.tlias.common.PageResult;
import com.tlias.mapper.EmpMapper;
import com.tlias.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EptServiceLmpl implements EmpService {
    private final EmpMapper EmpMapper;
    @Override
    public PageResult getPageEmp(String name, Integer gender, LocalDate begin, LocalDate end, Integer page, Integer pageSize) {
        PageResult pageEmp = new PageResult();
        pageEmp.setTotal(EmpMapper.selectCount());
        Integer pageStart = (page-1)*pageSize;
        pageEmp.setRows(EmpMapper.selectallEmp(name, gender, begin, end, pageStart, pageSize));
        return pageEmp;
    }
}
