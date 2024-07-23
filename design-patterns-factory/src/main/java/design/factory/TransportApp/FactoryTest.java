package design.factory.TransportApp;

import design.factory.TransportApp.logistics.LogisticsFactory;
import design.factory.TransportApp.logistics.impl.RoadLogistics;
import design.factory.TransportApp.logistics.impl.SeaLogistics;
import design.factory.TransportApp.transport.Transport;

/**
 * @Author: hehongyi
 * @Date: 2024/7/19 16:50
 * @Description: 测试
 */
public class FactoryTest {
  public static void main(String[] args) {
    LogisticsFactory roadLogistics = new RoadLogistics();
    Transport roadTransport = roadLogistics.createTransport();
    roadTransport.deliver();
    roadLogistics.planDelivery();

    LogisticsFactory seaLogistics = new SeaLogistics();
    Transport seaTransport = seaLogistics.createTransport();
    seaTransport.deliver();
    seaLogistics.planDelivery();
  }

}
