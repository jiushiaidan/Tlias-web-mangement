package com.tlias.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tlias.common.PageEmpQuey;
import com.tlias.common.PageResult;
import com.tlias.mapper.EmpMapper;
import com.tlias.model.vo.EmpVo;
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
    public PageResult getPageEmp(PageEmpQuey pageEmpQuey) {
        if (pageEmpQuey.getBegin() != null && pageEmpQuey.getBegin().toString().isEmpty()) {
            pageEmpQuey.setBegin(null);
        }
        if (pageEmpQuey.getEnd() != null && pageEmpQuey.getEnd().toString().isEmpty()) {
            pageEmpQuey.setEnd(null);
        }
        PageHelper.startPage(pageEmpQuey.getPage(), pageEmpQuey.getPageSize());
        Page<EmpVo> empVos = (Page<EmpVo>) EmpMapper.selectallEmp(pageEmpQuey);
        PageResult pageResult = new PageResult((int) empVos.getTotal(), empVos.getResult());
        return pageResult;
    }
}
