package design.factory.demo2.store.impl;

import com.alibaba.fastjson.JSON;
import design.factory.demo2.coupon.CouponResult;
import design.factory.demo2.coupon.CouponService;
import design.factory.demo2.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:39
 * @Description: 优惠卷服务
 */
public class CouponCommodityService implements ICommodity {
  private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

  private CouponService couponService = new CouponService();

  @Override
  public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
    CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
    logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
    logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
    if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
  }
}
