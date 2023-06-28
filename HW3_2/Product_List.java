package org.example.lesson3.HW3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product_List {
    private  String productName;
    private String country;
    private Double weight;
    private Integer price;
    private Integer grade;
}
