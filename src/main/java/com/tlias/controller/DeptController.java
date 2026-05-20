package com.tlias.controller;

import com.tlias.common.Result;
import com.tlias.model.dto.Deptdto;
import com.tlias.service.DeptService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // @Controller + @ResponseBody(全返回json格式)
@RequiredArgsConstructor
public class DeptController {
     private final DeptService deptService;
     @GetMapping("/depts")
      public Result getDept(){
          return Result.success(deptService.getDept());
     }

     @DeleteMapping("/depts")
      public Result deleteById(Integer id){
         deptService.deleteById(id);
          return Result.success();
     }

     @PostMapping("/depts")
      public Result addDept(@RequestBody Deptdto dept){
         deptService.addDept(dept);
          return Result.success();
     }
}
