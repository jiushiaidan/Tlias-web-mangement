package com.tlias.mapper;

import com.tlias.common.PageEmpQuey;
import com.tlias.model.po.Emp;
import com.tlias.model.vo.EmpVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    List<EmpVo> selectallEmp(PageEmpQuey pageEmpQuey);
}
