package design.factory.TransportApp.logistics.impl;

import design.factory.TransportApp.logistics.LogisticsFactory;
import design.factory.TransportApp.transport.Transport;
import design.factory.TransportApp.transport.impl.Truck;

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
