package com.headfirst.patterns.decoratorPattern.custom;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class SevenASideField extends FootballField {
    @Override
    int getPrice() {
        return 30;
    }

    @Override
    String getInformation() {
        return "Playing Seven A Side Game";
    }
}
