package org.example.lesson3.HW3_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String productName;
    private Integer price;
    private Integer grade;
}
