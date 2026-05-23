package com.tlias.controller;

import com.tlias.common.PageEmpQuey;
import com.tlias.common.PageResult;
import com.tlias.common.Result;
import com.tlias.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController // @Controller + @ResponseBody(全返回json格式)
@RequiredArgsConstructor
@RequestMapping("/emps")
public class EmpController {
    private final EmpService empService;
    @GetMapping
    public Result getPageEmp(PageEmpQuey pageEmpQuey){
        PageResult pageEmp = empService.getPageEmp(pageEmpQuey);
        return Result.success(pageEmp);
    }
}
