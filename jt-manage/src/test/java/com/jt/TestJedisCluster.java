package com.jt;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class TestJedisCluster {

	@Test
	public void test01() {
		Set<HostAndPort> sets = new HashSet<>();
		sets.add(new HostAndPort("192.168.233.130", 7000));
		sets.add(new HostAndPort("192.168.233.130", 7001));
		sets.add(new HostAndPort("192.168.233.130", 7002));
		sets.add(new HostAndPort("192.168.233.130", 7003));
		sets.add(new HostAndPort("192.168.233.130", 7004));
		sets.add(new HostAndPort("192.168.233.130", 7005));
		// Redis 集群操作工具 JedisCluster
		JedisCluster cluster = new JedisCluster(sets);
		cluster.set("2020", "集群搭建完成");
		System.out.println("获取集群数据:" + cluster.get("2020"));
	}
}
