package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/17 16:10
 * @description
 */
public interface PromotionAdMapper {

    /*
        分页查询广告信息
     */
    public List<PromotionAd> findAllPromotionAdByPage();

    /*
        广告动态上下线
     */
    public void updatePromotionAdStatus(PromotionAd promotionAd);

}
