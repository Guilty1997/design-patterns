package design.factory.demo2.card;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:39
 * @Description: 爱奇艺卡发放接口
 */
public class IQiYiCardService {
  public void grantToken(String bindMobileNumber, String cardId) {
    System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
  }
}
