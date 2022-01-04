package org.com.util;

import redis.clients.jedis.Jedis;

public final class JedisUtils {

    public static void Jedis() {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.select(1);
        try {
            //jedis.setex(token, 12 * 60 * 60, token);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static void main(String[] args) {
        Jedis jedis = JedisConnection();
        jedis.lpush("1008", "黄启钦");
        System.out.println(jedis.lrange("1008", 0, 10));
    }

    public static Jedis JedisConnection() {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.select(2);
        return jedis;
    }

    public static void JedisClose(Jedis jedis) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
