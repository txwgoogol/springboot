package com.example.springboot;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {
	
	@Test
	public void redisConnectionTest() {
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server successfully");
		System.out.println("Server is running: "+jedis.ping());
	}
	
}