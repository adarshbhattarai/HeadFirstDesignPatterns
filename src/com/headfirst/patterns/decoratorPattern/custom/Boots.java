package com.adarsh.decorator;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class Boots extends FieldDecorator {

    FieldDecorator fieldDecorator;
    Boots(FieldDecorator fieldDecorator){
        this.fieldDecorator = fieldDecorator;
    }
    @Override
    int getPrice() {
        return fieldDecorator.getPrice() + 8;
    }

    @Override
    String getInformation() {
        return fieldDecorator.getInformation() + ", Used Boots";
    }
}
