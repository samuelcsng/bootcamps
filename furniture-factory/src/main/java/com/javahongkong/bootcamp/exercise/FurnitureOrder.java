package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        // return null;
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        // return -1.0f;
        float totalOrderCost = this.ordersOfFurnitures //
                .entrySet().stream() //
                .map(e -> getTypeCost(e.getKey())) //
                .reduce(0.0f, (x, y) -> x + y) //
        ;
        return totalOrderCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        // return -1;
        int typeCount = this.ordersOfFurnitures //
                .entrySet().stream() //
                .filter(entry -> entry.getKey().equals(type)) //
                .map(entry -> entry.getValue()) //
                .reduce(0, (x, y) -> x + y) //
        ;
        return typeCount;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        // return -1.0f;
        return type.cost() * getTypeCount(type);
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        // return -1;
        int totalOrderQuantity = this.ordersOfFurnitures //
                .entrySet().stream() //
                .map(e -> getTypeCount(e.getKey())) //
                .reduce(0, (x, y) -> x + y) //
        ;
        return totalOrderQuantity;
    }
}
