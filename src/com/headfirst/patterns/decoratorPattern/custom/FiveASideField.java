package com.adarsh.decorator;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class FiveASideField extends FootballField{

    @Override
    int getPrice() {
        return 10;
    }

    @Override
    String getInformation() {
        return "Playing a Futsal";
    }
}

