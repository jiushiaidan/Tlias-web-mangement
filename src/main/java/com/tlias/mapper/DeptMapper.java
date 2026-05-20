package com.tlias.mapper;
import com.tlias.model.dto.Deptdto;
import com.tlias.model.po.Dept;
import com.tlias.model.vo.Deptvo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

@Mapper  // 告诉MyBatis这是一个操作数据库的Mapper
public interface DeptMapper {
    @Select("select * from tb_dept order by update_time desc")
    List<Dept> selectallDept();
    @Delete("delete from tb_dept where id=#{id}")
    void deleteById(Integer id);
    @Update("insert into tb_dept(name) values(#{name})")
    void addDept(Dept dept);
    @Select("select * from tb_dept where id=#{id}")
    Dept getDeptById(Integer id);
}
