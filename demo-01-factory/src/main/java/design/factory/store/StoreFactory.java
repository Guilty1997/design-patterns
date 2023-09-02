package design.factory.store;

import design.factory.store.impl.CardCommodityService;
import design.factory.store.impl.CouponCommodityService;
import design.factory.store.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：HeHongyi
 * @date: 2023/9/2
 * @description: 工厂方法
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
