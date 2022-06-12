package cn.wenhe9.aggregatedataserver.service;

import cn.wenhe9.aggregatedataserver.domian.constellation.ConstellationResponse;

/**
 * @author DuJinliang
 * 2022/6/12
 */
public interface ConstellationService {
    /**
     * 根据关键字查询星座信息
     */
    ConstellationResponse queryConstellationInfo(String key, String keyword);
}
