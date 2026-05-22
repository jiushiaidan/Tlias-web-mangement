package com.tlias.common;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {
    private Integer total;
    private List<T> rows;
}
