package com.tableSchema.common.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tableSchema.common.exception.ApFormatException;
import com.tableSchema.common.utils.FolderCreateUtil;
import com.tableSchema.common.utils.PropertiesUtil;
import com.tableSchema.domain.code.FileCode;
import com.tableSchema.domain.code.SchemaCode;
import com.tableSchema.domain.dto.SchemaDTO;

public class Excel {
	
	private Logger logger = Logger.getLogger(Excel.class);
	
	public void creatExcel(List<List<SchemaDTO>> lists) {
		try {  
			logger.info("建立資料夾");
        	FolderCreateUtil.createFolders(FileCode.EXCEL_PATH.getPath());
        	FileOutputStream out = new FileOutputStream(FileCode.EXCEL_PATH.getPath() + PropertiesUtil.getUserName() + " table schema.xls");			
        	//OutputStream out = new FileOutputStream("D:\\"+props.getPropertyOwner() + " table schema.xls");        	
        	logger.info("開始產生檔案");
        	ExcelFileGenerator efg = new ExcelFileGenerator(this.getFieldName(), lists);
			efg.expordExcel(out);
			logger.info("檔案產生完成");
		} catch (FileNotFoundException e) {
			logger.debug(new ApFormatException("產生檔案失敗:", e));
			e.printStackTrace();
		} catch (Exception e) {
			logger.debug(new ApFormatException("產生檔案失敗:", e));			
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getFieldName(){ 
    	ArrayList<String> list=new ArrayList<String>();  
    	for (SchemaCode code : SchemaCode.values()) {
    		list.add(code.getText());
    	}
        return list;  
    }
			

}
