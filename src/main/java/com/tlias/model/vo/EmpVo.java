package com.tlias.model.vo;

import com.tlias.model.po.Emp;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpVo extends Emp {
    private String deptName;
}
