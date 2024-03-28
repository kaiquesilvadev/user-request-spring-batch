package com.kaique.userrequestspringbatch.writer;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kaique.userrequestspringbatch.entities.User;

@Configuration
public class InsertUserDataDBWriterConfig {

	@Bean
	public ItemWriter<User> insertUserDataDBWriter(@Qualifier("appDS") DataSource dataSource) {
		
		return new JdbcBatchItemWriterBuilder<User>()
				.dataSource(dataSource)
				.sql("INSERT INTO tb_user (login, name, avatar_url) VALUES (:login, :name, :avatarUrl)")
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>()).build();
	}
}