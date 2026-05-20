package com.tlias.model.po;
import lombok.*;
import java.time.LocalDateTime;
@Data  // getter setter toString
@AllArgsConstructor  // 全参构造方法
@NoArgsConstructor  // 无参构造方法
// 封装部门信息
public class Dept {
    // 部门id
    private Integer id;
    // 部门名称
    private String name;
    // 部门创建时间
    private LocalDateTime createTime;
    // 部门更新时间
    private LocalDateTime updateTime;
}
