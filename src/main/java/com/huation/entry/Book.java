package com.huation.entry;

import lombok.Data;

@Data
public class Book {
    /**
     * 图书ID
     */
    private Integer bookId;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 馆藏数量
     */
    private Integer number;
}
