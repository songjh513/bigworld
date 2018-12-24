package com.wuyi.bigworld.redis;

import com.wuyi.bigworld.common.util.EnvUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class JedisConnectionUtils {
    private static JedisPool pool=null;
    static {
        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(100);
        pool=new JedisPool(jedisPoolConfig, EnvUtils.HOST,6379);
    }
    public static Jedis getJedis(){
        return pool.getResource();
    }


    public static void main(String[] args){
        Jedis  jedis=JedisConnectionUtils.getJedis();

        jedis.set("aa","test");

        String ret = jedis.get("aa");


        System.out.println(ret);

        jedis.close();
    }
}
