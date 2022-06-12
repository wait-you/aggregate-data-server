package cn.wenhe9.aggregatedataserver.controller;

import cn.wenhe9.aggregatedataserver.constant.Common;
import cn.wenhe9.aggregatedataserver.domian.constellation.ConstellationResponse;
import cn.wenhe9.aggregatedataserver.service.ConstellationService;
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
@RequestMapping("/constellation")
public class ConstellationController {

    @Resource
    private ConstellationService constellationService;

    @GetMapping("/list")
    public String[] getConstellationList(){
        return Common.CONSTELLATION_LIST;
    }

    @GetMapping("/query")
    public ConstellationResponse queryConstellationInfo(
            @RequestParam("key") String key,
            @RequestParam("keyword") String keyword
    ){
        return constellationService.queryConstellationInfo(key, keyword);
    }
}
