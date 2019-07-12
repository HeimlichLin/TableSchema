package com.tableSchema.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.tableSchema.common.codegenerate.CodeParm;
import com.tableSchema.common.codegenerate.DBsetting;
import com.tableSchema.common.context.AppContext;

public class PropertiesUtil {
	
	public static String getUserName() {
		final String dbProperties = AppContext.get().getValue(CodeParm.DB_SETTING.name(), "db.properties");
		final File f = FileLoaderUtil.getResourcesFile(PropertiesUtil.class, dbProperties);
		final Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(f));
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(DBsetting.USERNAME.toText());
	}

}
