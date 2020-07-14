package com.itany.zshop.common.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


public class RedisUtils {

    private static JedisPool jedisPool = null;

    static {
        jedisPool = (JedisPool) SpringBeanHolder.getBean("jedisPool");
    }


    public static void set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static void set(String key, String value, int expireTIme) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
            jedis.expire(key, expireTIme); //设置过期时间
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static String get(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return null;
    }

    public static void lpush() {

    }
}
