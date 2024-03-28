package com.kaique.userrequestspringbatch.reader;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.AfterChunk;
import org.springframework.batch.core.annotation.BeforeChunk;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.kaique.userrequestspringbatch.dto.UserDTO;

@Configuration
public class FetchUserDataReaderConfig implements ItemReader<UserDTO> {
	
	private static Logger logger = LoggerFactory.getLogger(FetchUserDataReaderConfig.class);

	private final String BASE_URL = "http://localhost:8081";
	private RestTemplate restTemplate = new RestTemplate();


	@Override
	public UserDTO read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	}

	private List<UserDTO> fetchUserDataFromAPI() {

		String uri = BASE_URL + "/clients/pagedData?page=%d&size=%d";
		
	
	}
	
}