package design.factory.card;

/**
 * @author：HeHongyi
 * @date: 2023/9/2
 * @description: 实体卡服务
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
