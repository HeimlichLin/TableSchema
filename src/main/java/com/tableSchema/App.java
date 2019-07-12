package com.tableSchema;

import com.tableSchema.common.codegenerate.SystemDefine;
import com.tableSchema.controller.TableSchemaController;

public class App {
	
    public static void main( String[] args ) {
    	System.setProperty("SystemDefine", SystemDefine.CLMS_AP.name());	
    	TableSchemaController controller = new TableSchemaController();
//    	controller.execute();
    	controller.execute("GRNTBILL_LOG");
    }
}
