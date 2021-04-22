package com.redis.conn;

import redis.clients.jedis.Jedis;

/**
 * @author 陈正龙
 * @date 2021/4/1 15:48
 */
public class RedisConn {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println(jedis.ping());
    }
}
