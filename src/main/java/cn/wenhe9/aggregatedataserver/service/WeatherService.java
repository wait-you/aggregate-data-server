package cn.wenhe9.aggregatedataserver.service;

import cn.wenhe9.aggregatedataserver.domian.weather.WeatherResponse;

/**
 * @author DuJinliang
 * 2022/6/12
 */
public interface WeatherService {
    /**
     * 根据城市名称查询天气信息
     */
    WeatherResponse queryWeatherInfo(String key, String city);
}
