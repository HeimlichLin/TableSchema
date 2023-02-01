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
		this.workBook = this.createWorkbook();
		this.workBook.write(os);
		os.close();
	}

	public HSSFWorkbook createWorkbook() {
		this.workBook = new HSSFWorkbook();
		final int rows = this.fieldData.size();
		int sheetNum = 0;
		int count = 0;
		if (rows % this.SPLIT_COUNT == 0) {
			sheetNum = rows / this.SPLIT_COUNT;
		} else {
			sheetNum = rows / this.SPLIT_COUNT + 1;
		}
		for (int i = 1; i <= sheetNum; i++) {
			final HSSFSheet sheet = this.workBook.createSheet("Page " + i);
			final HSSFRow headRow = sheet.createRow((short) 0);
			for (int j = 0; j < this.fieldName.size(); j++) {
				//HSSFCell cell = headRow.createCell((short) j);
				final HSSFCell cell = headRow.createCell(j);
				cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				//cell.setEncoding(HSSFCell.ENCODING_UTF_16);  
				sheet.setColumnWidth(j, 6000);
				final HSSFCellStyle cellStyle = this.workBook.createCellStyle();
				final HSSFFont font = this.workBook.createFont();
				font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
				final short color = HSSFColor.RED.index;
				font.setColor(color);
				cellStyle.setFont(font);
				if (this.fieldName.get(j) != null) {
					cell.setCellStyle(cellStyle);
					cell.setCellValue((String) this.fieldName.get(j));

				} else {
					cell.setCellStyle(cellStyle);
					cell.setCellValue("-");
				}
			}

			for (int x = 0; x < rows; x++) {
				final List<SchemaDTO> rowList = this.fieldData.get(x);
				final int rowListSize = rowList.size();
				for (int n = 0; n < rowListSize; n++) {
					if (n == 0) {
						count++;
					}
					final HSSFRow row = sheet.createRow(count);
					final HSSFCell tableNameCell = row.createCell(0);
					final HSSFCell tableCommentsCell = row.createCell(1);
					final HSSFCell columnNameCell = row.createCell(2);
					final HSSFCell columnCommentsCell = row.createCell(3);
					final HSSFCell dataTypeCell = row.createCell(4);
					final HSSFCell dataSizeCell = row.createCell(5);
					final HSSFCell nullAbleCell = row.createCell(6);
					final HSSFCell positionCell = row.createCell(7);

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
					count++;
				}
			}
		}
		return this.workBook;
	}

}
