package com.tl.flasher.enums;

/*
 * ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 源码学院-Monkey老师
 * bat.ke.qq.com
 * Monkey老师QQ：2625273792
 */
public enum CommandTypeEnum {
    hget, hgetAll, expire, expireAt, ttl, //
    decrBy, decr, incrBy, incr, hset, //
    set, get, exists, type, append, //
    substr, hsetnx, hmset, hmget, hincrBy, //
    hexists, hdel, hlen, hkeys, keys, //
    dbSize, del, setex, //
    // list
    rpush, lpush, llen, lrange, //
    lindex, lpop, rpop, ltrim, //
    lrem,
    // set
    sadd, srem, scard, smembers,smember;//

}
