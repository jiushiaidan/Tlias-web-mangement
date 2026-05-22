package com.tlias.model.po;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    // 员工ID
    private Integer id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;
    // 性别：1 男，2 女
    private Short gender;
    // 手机号
    private String phone;
    // 职位：1 班主任，2 讲师，3 学工主管，4 教研主管，5 咨询师
    private Short job;
    // 薪资
    private Integer salary;
    // 头像
    private String image;
    // 入职时间
    private LocalDate entryDate;
    // 部门ID
    private Integer deptId;
    // 创建时间
    private LocalDateTime createTime;
    // 更新时间
    private LocalDateTime updateTime;
}
