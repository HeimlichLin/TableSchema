package com.tableSchema.controller;

import org.apache.log4j.Logger;

import com.tableSchema.domain.service.impl.ProviderServiceImpl;

public class TableSchemaController {
	
	private Logger logger = Logger.getLogger(TableSchemaController.class);
	private ProviderServiceImpl service = new ProviderServiceImpl();
	
	public void execute() {
    	this.logger.info("-----Start 依DB 產生 Table Schema Excel-----");
    	this.service.createTableSchema();
    	this.logger.info("-----Start 產生 DO & DAO JAVA-----");
    	this.service.createJavePage();		
		this.logger.info("-----End----");
	}	
	
	public void execute(String tableName) {
    	this.logger.info("-----Start 產生 DO & DAO JAVA-----");
    	this.service.createJavePage(tableName);		
		this.logger.info("-----End----");
	}

}
