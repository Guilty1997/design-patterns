package design.factory.demo2.goods;

import com.alibaba.fastjson.JSON;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:39
 * @Description: 实体奖品模拟
 */
public class GoodsService {
  public Boolean deliverGoods(DeliverReq req) {
    System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
    return true;
  }
}
