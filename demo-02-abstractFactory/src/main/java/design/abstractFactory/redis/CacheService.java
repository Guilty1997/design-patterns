package design.abstractFactory.redis;

import java.util.concurrent.TimeUnit;

/**
 * @author：HeHongyi
 * @date: 2023/9/3
 * @description: 缓存接口
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
