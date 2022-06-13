package cn.wenhe9.aggregatedataserver.service.impl;

import cn.wenhe9.aggregatedataserver.constant.Common;
import cn.wenhe9.aggregatedataserver.domian.city.CityResponse;
import cn.wenhe9.aggregatedataserver.domian.weather.WeatherResponse;
import cn.wenhe9.aggregatedataserver.service.WeatherService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DuJinliang
 * 2022/6/12
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    @Cacheable(cacheNames = "weather", cacheManager = "redisCacheManager")
    public WeatherResponse queryWeatherInfo(String key, String city) {
        return restTemplate.getForObject(Common.WEATHER_BASE_URL + "query?city=" + city +"&key=" + key, WeatherResponse.class);

    }
}
