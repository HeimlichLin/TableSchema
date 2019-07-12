package com.tableSchema.common.utils;

import java.io.File;

public class FolderCreateUtil {
	
	public static void createFolders(String... paths) {
		for (String path : paths) {
			File file = new File(path);
			file.mkdirs();
			file.setExecutable(true, false);
			file.setReadable(true, false);
			file.setWritable(true, false);
		}
	}
	
	public static void createFolders(File... files) {
		for (File file : files) {
			file.mkdirs();
			file.setExecutable(true, false);
			file.setReadable(true, false);
			file.setWritable(true, false);
		}
	}
	
	public static File getResourcesFile(Class<?> pClass, final String file) {
		final ClassLoader classLoader = pClass.getClassLoader();
		return new File(classLoader.getResource(file).getFile());
	}

}
