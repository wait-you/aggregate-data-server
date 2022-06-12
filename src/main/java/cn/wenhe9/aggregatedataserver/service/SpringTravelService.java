package cn.wenhe9.aggregatedataserver.service;

import cn.wenhe9.aggregatedataserver.domian.city.CityResponse;
import cn.wenhe9.aggregatedataserver.domian.policy.PolicyResponse;

/**
 * @author DuJinliang
 * 2022/6/12
 */
public interface SpringTravelService {
    /**
     * 查询所有城市信息
     */
    CityResponse queryCitys(String key);

    /**
     * 查询两地防疫政策信息
     */
    PolicyResponse queryPolicy(String key, Integer from, Integer to);
}
