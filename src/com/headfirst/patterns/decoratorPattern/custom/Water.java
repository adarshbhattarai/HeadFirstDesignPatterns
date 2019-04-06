package com.adarsh.decorator;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class Water extends FieldDecorator
{

    FootballField footballField;

    Water(FootballField footballField){
        this.footballField = footballField;
    }

    @Override
    int getPrice() {
        return footballField.getPrice() + 2;
    }

    @Override
    String getInformation() {
        return footballField.getInformation() + ", used water ";
    }
}
