package com.tlias.common;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageQueryParm {
    private Integer page = 1;
    private Integer pageSize = 10;

}
