package com.tlias.mapper;

import com.tlias.model.po.Emp;
import com.tlias.model.vo.EmpVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select count(*) from tb_emp")
    Integer selectCount();
    @Select("select e.*,d.name dept_name from tb_emp e " +
            "left join tb_dept d " +
            "on e.dept_id=d.id order by e.update_time desc " +
            "limit #{pagestart},#{pageSize}")
    List<EmpVo> selectallEmp(String name, Integer gender, LocalDate begin,
                             LocalDate end, @Param("pagestart") Integer pagestart, @Param("pageSize") Integer pageSize);
}
