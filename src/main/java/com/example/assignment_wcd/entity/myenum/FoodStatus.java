package com.example.assignment_wcd.entity.myenum;

public enum FoodStatus {
    ACTIVE(1),
    STOPSELLING(0),
    DELETED(-1);
    private int value;


    FoodStatus(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static FoodStatus of(int value){
        for (FoodStatus productStatus : FoodStatus.values()){
            if (productStatus.getValue() == value){
                return productStatus;
            }
        }
        return FoodStatus.ACTIVE;
    }
}
