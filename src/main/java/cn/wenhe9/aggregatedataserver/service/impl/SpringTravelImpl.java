package cn.wenhe9.aggregatedataserver.service.impl;

import cn.wenhe9.aggregatedataserver.constant.Common;
import cn.wenhe9.aggregatedataserver.domian.city.CityResponse;
import cn.wenhe9.aggregatedataserver.domian.policy.PolicyResponse;
import cn.wenhe9.aggregatedataserver.service.SpringTravelService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DuJinliang
 * 2022/6/12
 */
@Service
public class SpringTravelImpl implements SpringTravelService {


    @Resource
    private RestTemplate restTemplate;

    @Override
    @Cacheable(cacheNames = "citys", cacheManager = "redisCacheManager")
    public CityResponse queryCitys(String key) {
        return restTemplate.getForObject(Common.SPRING_BASE_URL + "citys?key=" + key, CityResponse.class);
    }

    @Override
    @Cacheable(cacheNames = "policy", cacheManager = "redisCacheManager")
    public PolicyResponse queryPolicy(String key, Integer from, Integer to) {
        return restTemplate.getForObject(Common.SPRING_BASE_URL + "query?from=" + from + "&to=" + to + "&key=" + key, PolicyResponse.class);
    }
}
