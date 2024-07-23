package design.factory.demo2.coupon;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:39
 * @Description: 优惠卷接口
 */
public class CouponService {
  public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
    System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
    return new CouponResult("0000", "发放成功");
  }
}
