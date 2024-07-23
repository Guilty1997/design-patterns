package design.factory.demo1.transport.impl;

import design.factory.demo1.transport.Transport;

/**
 * @Author: hehongyi
 * @Date: 2024/7/19 16:31
 * @Description: 盒子运输
 */
public class Truck implements Transport {

  String code = "盒子";

  @Override
  public void deliver() {
    System.out.println("盒子运输");
  }
}
