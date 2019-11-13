package com.tableSchema.common.javapage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.tableSchema.common.exception.ApFormatException;
import com.tableSchema.common.javapage.pagemain.PageMain;
import com.tableSchema.common.javapage.pagemain.impl.DAOPageImpl;
import com.tableSchema.common.javapage.pagemain.impl.DoPageImpl;
import com.tableSchema.domain.code.FileCode;
import com.tableSchema.domain.dto.TableDTO;

public class JavaPage {
	
	private Logger logger = Logger.getLogger(JavaPage.class);
	
	/**
	 * 建立Do
	 * @param dto
	 */
	public void createJavaPageDo(TableDTO dto) {
		PageMain doPageMain = new DoPageImpl(dto);
		this.creatFile(doPageMain, FileCode.JAVA_DO_PATH.getPath() + dto.getDto().getTableNameDoFirstWorldUp() + ".java");
	}
	
	/**
	 * 建立DAO
	 * @param dto
	 */
	public void createJavaPageDAO(TableDTO dto) {
		PageMain daoPageMain = new DAOPageImpl(dto);
		this.creatFile(daoPageMain, FileCode.JAVA_DAOIMPL_PATH.getPath() + dto.getDto().getTableNameDAOImplFirstWorldUp() + ".java");
	}
	
	/**
	 * 建立檔案
	 * @param pageMain
	 * @param filePath
	 */
	private void creatFile(PageMain pageMain, String filePath) {
		this.logger.info("建立資料夾 : " + filePath);
		File file = new File(filePath);
    	if (!file.exists()) {
    		System.out.println(file.getParentFile());
    		file.getParentFile().mkdirs();
    	}
    	try {
    		this.logger.info("開始產生檔案 : " + filePath);
    		FileWriter writer = new FileWriter(file);
    		writer.write(pageMain.getContent());
    		writer.close();
    		file.createNewFile();
    		this.logger.info("檔案產生完成 : " + filePath);
		} catch (IOException e) {
			this.logger.debug(new ApFormatException("產生檔案失敗:", e));
			e.printStackTrace();			
		}
	}

}
