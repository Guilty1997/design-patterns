package design.factory.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author：HeHongyi
 * @date: 2023/9/2
 * @description: 实体奖品模拟
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
