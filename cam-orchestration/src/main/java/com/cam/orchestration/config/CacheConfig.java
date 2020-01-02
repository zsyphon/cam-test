package com.cam.orchestration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class CacheConfig {

	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		final RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);
		return new JedisConnectionFactory(config);
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory());
		return template;
	}
}
