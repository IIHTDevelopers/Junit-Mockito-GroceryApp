package com.groceryapp.validation;

public class ValidationUtils {

    public boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }

    
}