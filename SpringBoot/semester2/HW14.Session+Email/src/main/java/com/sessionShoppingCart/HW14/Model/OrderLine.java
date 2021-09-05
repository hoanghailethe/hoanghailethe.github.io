package com.sessionShoppingCart.HW14.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class OrderLine implements Serializable {
    private Product product;
    private int count;
    public void increaseByOne(){
        count++;
    }

    public void decreaseByOne() {
        count--;
    }
}
