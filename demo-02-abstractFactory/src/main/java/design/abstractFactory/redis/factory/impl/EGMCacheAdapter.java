package design.abstractFactory.redis.factory.impl;

import design.abstractFactory.redis.factory.ICacheAdapter;
import design.abstractFactory.redis.master.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author：HeHongyi
 * @date: 2023/9/3
 * @description:
 */
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
