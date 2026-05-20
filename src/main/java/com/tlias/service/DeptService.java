package com.tlias.service;

import com.tlias.common.Result;
import com.tlias.model.dto.Deptdto;
import com.tlias.model.po.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getDept();
    void deleteById(Integer id);

    void addDept(Deptdto dept);
}
