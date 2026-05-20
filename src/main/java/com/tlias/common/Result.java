package com.tlias.common;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    // 响应码0失败，1成功
    private Integer code;
    // 响应信息
    private String msg;
    // 响应数据
    private T data;
    // 成功响应无数据
    public static <T> Result<T> success(){
        return new Result<>(1,"success",null);
    }
    // 成功响应有数据
    public static <T> Result<T> success(T data){
        return new Result<>(1,"success",data);
    }
    // 失败响应
    public static <T> Result<T> fail(){
        return new Result<>(0,"fail",null);
    }
}
