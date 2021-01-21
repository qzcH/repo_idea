package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/17 18:52
 * @description
 */
public interface PromotionAdService {

    /*
        分页查询广告信息
     */
    public PageInfo findAllPromotionAdByPage(PromotionAdVO promotionAdVO);

    /*
        广告动态上下线
     */
    public void updatePromotionAdStatus(int id, int status);
}
