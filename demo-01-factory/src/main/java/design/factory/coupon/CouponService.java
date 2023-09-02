package design.factory.coupon;

/**
 * @author：HeHongyi
 * @date: 2023/9/2
 * @description: 优惠卷服务
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
