package design.factory.demo2.store;

import java.util.Map;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:39
 * @Description: 发奖接口
 */
public interface ICommodity {

  void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
