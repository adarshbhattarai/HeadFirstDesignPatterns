package com.adarsh.decorator;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class Ball extends FieldDecorator {

    FootballField footballField;

    Ball(FootballField footballField){
        this.footballField = footballField;
    }
    @Override
    int getPrice() {
        return footballField.getPrice() + 5;
    }

    @Override
    String getInformation() {
        return footballField.getInformation() +", Used Ball";
    }
}
