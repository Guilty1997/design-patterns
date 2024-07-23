package design.factory.demo1.logistics.impl;

import design.factory.demo1.logistics.LogisticsFactory;
import design.factory.demo1.transport.Transport;
import design.factory.demo1.transport.impl.Truck;

/**
 * @Author: hehongyi
 * @Date: 2024/7/19 16:39
 * @Description: 路上运输
 */
public class RoadLogistics implements LogisticsFactory {
  @Override
  public void planDelivery() {
    System.out.println("计划路上运输");
  }

  @Override
  public Transport createTransport() {
    return new Truck();
  }
}
