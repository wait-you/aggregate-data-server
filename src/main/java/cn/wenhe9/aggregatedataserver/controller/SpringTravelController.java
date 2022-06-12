package cn.wenhe9.aggregatedataserver.controller;

import cn.wenhe9.aggregatedataserver.domian.city.CityResponse;
import cn.wenhe9.aggregatedataserver.domian.policy.PolicyResponse;
import cn.wenhe9.aggregatedataserver.service.SpringTravelService;
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
@RequestMapping("/spring_travel")
public class SpringTravelController {
    @Resource
    private SpringTravelService springTravelService;

    /**
     * 查询所有城市信息
     */
    @GetMapping("/citys")
    public CityResponse getCityList(@RequestParam("key") String key){
        return springTravelService.queryCitys(key);
    }

    /**
     * 查询两地防疫政策信息
     */
    @GetMapping("/policy")
    public PolicyResponse getPolicy(
            @RequestParam("key") String key,
            @RequestParam("from") Integer from,
            @RequestParam("to") Integer to
    ){
        return springTravelService.queryPolicy(key, from, to);
    }
}
