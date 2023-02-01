package com.tableSchema;

import com.tableSchema.common.codegenerate.SystemDefine;
import com.tableSchema.controller.TableSchemaController;

public class AppTest {

	public static void main(String[] args) {
		System.setProperty("SystemDefine", SystemDefine.ABS.name());
		final TableSchemaController controller = new TableSchemaController();
//		controller.execute();
		controller.execute("OMS_MENU_FUNCTION");
	}

}
