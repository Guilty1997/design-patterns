package design.factory.demo2.coupon;

/**
 * @Author: hehongyi
 * @Date: 2024/7/23 09:39
 * @Description: 优惠卷结果
 */
public class CouponResult {
    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String info;

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
