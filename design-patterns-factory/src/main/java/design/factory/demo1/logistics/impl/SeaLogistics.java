package design.factory.demo1.logistics.impl;

import design.factory.demo1.logistics.LogisticsFactory;
import design.factory.demo1.transport.Transport;
import design.factory.demo1.transport.impl.Ship;

/**
 * @Author: hehongyi
 * @Date: 2024/7/19 16:42
 * @Description: 海上运输
 */
public class SeaLogistics implements LogisticsFactory {
  @Override
  public void planDelivery() {
    System.out.println("计划海上运输");
  }

  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
