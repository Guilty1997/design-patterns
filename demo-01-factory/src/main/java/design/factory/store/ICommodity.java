package design.factory.store;

import java.util.Map;

/**
 * @author：HeHongyi
 * @date: 2023/9/2
 * @description: 奖品接口
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
