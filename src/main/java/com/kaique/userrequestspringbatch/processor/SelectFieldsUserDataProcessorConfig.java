package com.kaique.userrequestspringbatch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kaique.userrequestspringbatch.dto.UserDTO;
import com.kaique.userrequestspringbatch.entities.User;

@Configuration
public class SelectFieldsUserDataProcessorConfig {
	
	@Bean
	public ItemProcessor<UserDTO, User> selectFieldsUserDataProcessor() {
		return new ItemProcessor<UserDTO, User>() {
			
			@Override
			public User process(UserDTO item) throws Exception {
				User user = new User();
				user.setLogin(item.getLogin());
				user.setName(item.getName());
				user.setAvatarUrl(item.getAvatarUrl());
				return user;
			}
			
		};
	}
}