package design.abstractFactory.redis.factory.impl;

import design.abstractFactory.redis.factory.ICacheAdapter;
import design.abstractFactory.redis.master.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author：HeHongyi
 * @date: 2023/9/3
 * @description:
 */
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }

}
