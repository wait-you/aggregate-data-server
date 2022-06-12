package cn.wenhe9.aggregatedataserver.controller;

import cn.wenhe9.aggregatedataserver.domian.weather.WeatherResponse;
import cn.wenhe9.aggregatedataserver.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DuJinliang
 * 2022/6/12
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Resource
    private WeatherService weatherService;

    @GetMapping("/query")
    public WeatherResponse getWeatherInfo(
            @RequestParam("key") String key,
            @RequestParam("city") String city
    ){
        return weatherService.queryWeatherInfo(key, city);
    }
}
