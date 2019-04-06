package com.adarsh.decorator;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class StandardField extends FootballField{

    @Override
    int getPrice() {
        return 50;
    }

    @Override
    String getInformation() {
        return "Playing in a soccer field";
    }
}
