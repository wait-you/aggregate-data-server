package cn.wenhe9.aggregatedataserver.service.impl;

import cn.wenhe9.aggregatedataserver.constant.Common;
import cn.wenhe9.aggregatedataserver.domian.city.CityResponse;
import cn.wenhe9.aggregatedataserver.domian.constellation.ConstellationResponse;
import cn.wenhe9.aggregatedataserver.service.ConstellationService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DuJinliang
 * 2022/6/12
 */
@Service
public class ConstellationServiceImpl implements ConstellationService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public ConstellationResponse queryConstellationInfo(String key, String keyword) {
        return restTemplate.getForObject(Common.CONS_BASE_URL + "query?key=" + key + "&keyword=" + keyword, ConstellationResponse.class);
    }
}
