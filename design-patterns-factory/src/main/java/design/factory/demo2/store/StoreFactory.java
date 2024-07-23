package design.factory.demo2.store;

import design.factory.demo2.store.impl.CardCommodityService;
import design.factory.demo2.store.impl.CouponCommodityService;
import design.factory.demo2.store.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:34
 * @Description: 工厂方法
 */
public class StoreFactory {
  private Map<Integer, ICommodity> commodityMap = new HashMap<>();

  //初始化,如果是SpringBoot框架可以通过通过注解注入
  public void init() {
    commodityMap.put(1, new CardCommodityService());
    commodityMap.put(2, new GoodsCommodityService());
    commodityMap.put(3, new CouponCommodityService());
  }


  public ICommodity getCommodityService(Integer commodityType) {
    return commodityMap.get(commodityType);
  }
}
