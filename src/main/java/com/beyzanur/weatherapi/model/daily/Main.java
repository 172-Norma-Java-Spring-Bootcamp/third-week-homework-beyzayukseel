package com.beyzanur.weatherapi.model.daily;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
}
