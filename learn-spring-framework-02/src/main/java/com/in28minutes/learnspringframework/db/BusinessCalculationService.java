package com.in28minutes.learnspringframework.db;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class BusinessCalculationService {

	DataService dataService;
	MongoDbDataService mongoDbDataService;
	MySQLDataService mySQLDataService;

	public BusinessCalculationService(DataService dataService, MongoDbDataService mongoDbDataService,
			MySQLDataService mySQLDataService) {
		super();
		this.dataService = dataService;
		this.mongoDbDataService = mongoDbDataService;
		this.mySQLDataService = mySQLDataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
