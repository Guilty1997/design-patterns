package design.abstractFactory.redis.impl;

import design.abstractFactory.redis.CacheService;
import design.abstractFactory.redis.utils.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author：HeHongyi
 * @date: 2023/9/3
 * @description:
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }
    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }
    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }
    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
