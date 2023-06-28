package org.example.lesson3.HW3_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private String bookName;
    private String author;
    private Integer price;
    private Integer year;
    private Integer page;

}
