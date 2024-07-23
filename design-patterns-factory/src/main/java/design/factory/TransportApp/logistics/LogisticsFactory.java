package design.factory.TransportApp.logistics;

import design.factory.TransportApp.transport.Transport;

/**
 * @Author: hehongyi
 * @Date: 2024/7/19 16:33
 * @Description: 产品接口
 */
public interface LogisticsFactory {


  void planDelivery();

  Transport createTransport();

}
