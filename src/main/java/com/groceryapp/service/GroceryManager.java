package com.groceryapp.service;

import java.util.ArrayList;
import java.util.List;


import com.groceryapp.model.GroceryItem;
import com.groceryapp.validation.ValidationUtils;

public class GroceryManager {
    
    private List<GroceryItem> items;
    private ValidationUtils utils;

    public GroceryManager() {
      
        utils = new ValidationUtils();
        items = new ArrayList<>();
    }

    public List<GroceryItem> addItem(GroceryItem item) {
        

        if (this.utils.isValidName(item.getName()) && this.utils.isValidQuantity(item.getQuantity())) {
            
            items.add(item);
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Invalid input. Item not added.");
        }
        return this.items;
    }

    public List<GroceryItem> removeItem(GroceryItem item) {
        
        if (this.utils.isValidName(item.getName())) {
            items.removeIf(item_r -> item_r.getName().equalsIgnoreCase(item.getName()));
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Invalid name. No item removed.");
        }
        return this.items;
    }
}