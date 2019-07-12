package com.tableSchema.common.excel;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

import com.tableSchema.domain.dto.SchemaDTO;

public class ExcelFileGenerator {
	
	private final int SPLIT_COUNT = 1500;
    private ArrayList<?> fieldName = null;
    private List<List<SchemaDTO>> fieldData = null;
    private HSSFWorkbook workBook = null;
    
    public ExcelFileGenerator(ArrayList<?> fieldName, List<List<SchemaDTO>> lists) {
        this.fieldName = fieldName;  
        this.fieldData = lists;  
    }

	public void expordExcel(OutputStream os) throws Exception {  
        workBook = createWorkbook();  
        workBook.write(os);  
        os.close();  
    }  

    public HSSFWorkbook createWorkbook() {
    	workBook = new HSSFWorkbook();  
        int rows = fieldData.size();  
        int sheetNum = 0;  
        int count= 0;
        if (rows % SPLIT_COUNT == 0) {  
            sheetNum = rows / SPLIT_COUNT;  
        } else {  
            sheetNum = rows / SPLIT_COUNT + 1;  
        }
        for (int i = 1; i <= sheetNum; i++) {  
            HSSFSheet sheet = workBook.createSheet("Page " + i);
            HSSFRow headRow = sheet.createRow((short) 0);   
            for (int j = 0; j < fieldName.size(); j++) {  
            	//HSSFCell cell = headRow.createCell((short) j);
            	HSSFCell cell = headRow.createCell(j);
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);  
                //cell.setEncoding(HSSFCell.ENCODING_UTF_16);  
                sheet.setColumnWidth(j, 6000);
                HSSFCellStyle cellStyle = workBook.createCellStyle(); 
                HSSFFont font = workBook.createFont(); 
                font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); 
                short color = HSSFColor.RED.index;  
                font.setColor(color);
                cellStyle.setFont(font);  
                if(fieldName.get(j) != null){
                		cell.setCellStyle(cellStyle);  
                		cell.setCellValue((String) fieldName.get(j));  
                    
                }else{  
                    cell.setCellStyle(cellStyle);  
                    cell.setCellValue("-");  
                }  
            }
            
            for(int x=0;x<rows;x++){            	
            	List<SchemaDTO> rowList = fieldData.get(x); 
            	int rowListSize = rowList.size();
            	count++;
            	for (int n = 0; n < rowListSize; n++) { 
            		count++;
            		HSSFRow row = sheet.createRow(count);
            		HSSFCell tableNameCell = row.createCell(0);  
            		HSSFCell tableCommentsCell = row.createCell(1);
            		HSSFCell columnNameCell = row.createCell(2);
            		HSSFCell columnCommentsCell = row.createCell(3);
            		HSSFCell dataTypeCell = row.createCell(4);
            		HSSFCell dataSizeCell = row.createCell(5);
            		HSSFCell nullAbleCell = row.createCell(6);
            		HSSFCell positionCell = row.createCell(7);
            		
            		tableNameCell.setCellValue(rowList.get(n).getTableName()); 
            		//tableCommentsCell.setEncoding(HSSFCell.ENCODING_UTF_16);
            		tableCommentsCell.setCellValue(rowList.get(n).getTableComments()); 
            		columnNameCell.setCellValue(rowList.get(n).getColumnName()); 
            		//columnCommentsCell.setEncoding(HSSFCell.ENCODING_UTF_16);
            		columnCommentsCell.setCellValue(rowList.get(n).getColumnComments());
            		dataTypeCell.setCellValue(rowList.get(n).getDataType()); 
            		dataSizeCell.setCellValue(rowList.get(n).getDataSize()); 
            		nullAbleCell.setCellValue(rowList.get(n).getNullAble()); 
            		positionCell.setCellValue(rowList.get(n).getPosition());
            	}
            }
        }  
        return workBook;  
    } 

}
