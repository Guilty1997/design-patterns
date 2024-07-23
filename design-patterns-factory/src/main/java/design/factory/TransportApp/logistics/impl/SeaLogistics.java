package design.factory.TransportApp.logistics.impl;

import design.factory.TransportApp.logistics.LogisticsFactory;
import design.factory.TransportApp.transport.Transport;
import design.factory.TransportApp.transport.impl.Ship;

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
