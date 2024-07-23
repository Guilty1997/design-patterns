package design.factory.TransportApp.transport.impl;

import design.factory.TransportApp.transport.Transport;

/**
 * @Author: hehongyi
 * @Date: 2024/7/19 16:32
 * @Description: 运输巷运输
 */
public class Ship implements Transport {

  String code = "集装箱";

  @Override
  public void deliver() {
    System.out.println("集装箱运输");
  }
}
