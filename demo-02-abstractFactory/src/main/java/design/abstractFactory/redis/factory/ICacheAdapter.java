package design.abstractFactory.redis.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author：HeHongyi
 * @date: 2023/9/3
 * @description:
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
