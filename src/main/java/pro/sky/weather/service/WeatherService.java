package pro.sky.weather.service;

import pro.sky.weather.model.Weather;

public interface WeatherService {
    Weather getWeather(String city);
}
