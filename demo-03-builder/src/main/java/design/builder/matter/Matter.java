package design.builder.matter;

import java.math.BigDecimal;

/**
 * @author：HeHongyi
 * @date: 2023/9/5
 * @description: 装修物料
 */
public interface Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();
}
