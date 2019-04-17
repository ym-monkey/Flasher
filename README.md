Flasher分布式缓存框架
---

 Flasher基于Redis Cluster 3.0集群服务器（5.0版本加群获取）开发的一套Java客户端
### 技术交流
QQ群：940577921（备注：11）
<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=1c0d93672d39f851223d8ca833ea764d809c3bd15000acb1052d65d89ceeb3e3">Java互联网技术技术交流 点击进群</a>

## Flasher特点
* 1、基于Jedis Cluster开发的客户端支持Redis Cluster集群。
* 2、对被调用方（客户端）侵入极少，上手极快。
* 3、支持动态增加节点，客户端自动感知。（zk）
* 4、支持客户端验证与拦截。 token
* 5、异步监控调用数据，支持异步上报。
* 6、方便管理有效的区分业务系统。会员（memmber） 商品（goods）
* 7、支持Falcon协议. 监控系统
* 8、国内一线互联网公司上线项目

## 架构图
![shop](https://gitee.com/ym-monkey/flasher/raw/master/img/4.png "4.png")
![shop](https://gitee.com/ym-monkey/flasher/raw/master/img/0.png "1.png")
![shop](https://gitee.com/ym-monkey/flasher/raw/master/img/1.png "1.png")
![shop](https://gitee.com/ym-monkey/flasher/raw/master/img/2.png "2.png")
![shop](https://gitee.com/ym-monkey/flasher/raw/master/img/5.png "5.png")
![shop](https://gitee.com/ym-monkey/flasher/raw/master/img/6.png "6.png")

### 示例代码
* 1、maven依赖

```
  <dependency>
      <groupId>com.tl.flasher</groupId>
      <artifactId>flasher</artifactId>
      <version>0.0.5-snapshots</version>
    </dependency>
```

* 2、配置

```
 <bean id="jedisPoolConfig" class="redis.clients.jedis.JedisPoolConfig">
        <property name="maxTotal" value="500" />
        <property name="maxIdle" value="100" />
        <property name="minIdle" value="10" />
        <property name="maxWaitMillis" value="2000" />
        <property name="testOnBorrow" value="true" />
    </bean>
    <bean id="redisClusterConnectionFactory"
          class="com.tl.flasher.spring.RedisClusterConnectionFactory">
        <property name="jedisPoolConfig" ref="jedisPoolConfig"></property>
        <property name="hostPort" value="192.168.0.31:7000,192.168.0.31:7001,192.168.0.32:7000,192.168.0.32:7001,192.168.0.33:7000,192.168.0.33:7001"/>
    </bean>
    <bean id="redisCluster"
          class="com.tl.flasher.impl.RedisClusterImpl">
        <constructor-arg index="0" ref="redisClusterConnectionFactory" />
    </bean>
```
* 3、监控数据上报
```
<!--上报监控的数据-->
    <bean id="monitorService" class="com.tl.flasher.monitor.MonitorService">
        <property name="url" value="http://127.0.0.1:8080/monitor"/>
        <property name="protocol" ref="protocol"/>
    </bean>
    <bean id="protocol" class="com.tl.flasher.monitor.protocol.falcon.FalconProtocol">
        <property name="endpoint" value="redis-cluster"/>
    </bean>
```

* 4、Java测试

```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-tlcache.xml"})
public class TlCache {
   @Autowired
   IRedis iredis;
   @Test
   public void testKey(){
      iredis.set("trade", "monkey" , "2019");
      iredis.get("trade","monkey"));
   }
}
```
### 项目有问题加群讨论
QQ群：940577921（备注：11）
<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=1c0d93672d39f851223d8ca833ea764d809c3bd15000acb1052d65d89ceeb3e3"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="Java互联网技术技术交流" title="Java互联网技术技术交流"></a>
