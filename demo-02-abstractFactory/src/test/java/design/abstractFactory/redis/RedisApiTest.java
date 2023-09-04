package design.abstractFactory.redis;

import design.abstractFactory.redis.factory.JDKProxy;
import design.abstractFactory.redis.factory.impl.EGMCacheAdapter;
import design.abstractFactory.redis.factory.impl.IIRCacheAdapter;
import design.abstractFactory.redis.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author：HeHongyi
 * @date: 2023/9/3
 * @description: redis 测试类
 */
public class RedisApiTest {
    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);


    }
}
