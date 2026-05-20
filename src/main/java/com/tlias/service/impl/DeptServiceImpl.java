package com.tlias.service.impl;

import com.tlias.mapper.DeptMapper;
import com.tlias.model.dto.Deptdto;
import com.tlias.model.po.Dept;
import com.tlias.model.vo.Deptvo;
import com.tlias.service.DeptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service// 将当前类交给spring管理
@RequiredArgsConstructor
public class DeptServiceImpl implements DeptService {
    private final DeptMapper deptMapper;
    @Override  // 指定当前类为业务类
    public List<Dept> getDept() {
        return deptMapper.selectallDept();
    }
    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void addDept(Deptdto dept) {
        Dept depts = new Dept();
        depts.setName(dept.getName());
        deptMapper.addDept(depts);
    }
    @Override
    public Dept getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }
}
