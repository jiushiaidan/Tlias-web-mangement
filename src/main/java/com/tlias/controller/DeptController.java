package com.tlias.controller;

import cn.hutool.core.bean.BeanUtil;
import com.tlias.common.Result;
import com.tlias.model.dto.Deptdto;
import com.tlias.model.vo.Deptvo;
import com.tlias.service.DeptService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController // @Controller + @ResponseBody(全返回json格式)
@RequiredArgsConstructor
@RequestMapping("/depts")
public class DeptController {
     private final DeptService deptService;
     @GetMapping
      public Result getDept(){
          return Result.success(deptService.getDept());
     }

     @DeleteMapping
      public Result deleteById(Integer id){
         deptService.deleteById(id);
          return Result.success();
     }

     @PostMapping
      public Result addDept(@RequestBody Deptdto dept){
         deptService.addDept(dept);
          return Result.success();
     }
     @GetMapping("/{id}")
      public Result getDeptById(@PathVariable Integer id){
         Deptvo deptvo = BeanUtil.toBean(deptService.getDeptById(id), Deptvo.class);
         return Result.success(deptvo);
     }
     @PutMapping
      public Result updateone(@RequestBody Deptdto dept){
         deptService.updateone(dept);
         return Result.success();
     }
}
