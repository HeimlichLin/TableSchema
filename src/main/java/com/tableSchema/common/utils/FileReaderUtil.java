package com.tableSchema.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
	
	public static List<String> readLines(File file) {
		List<String> lines = new ArrayList<String>();
		try {
			FileReader reader = new FileReader(file);
			final BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
			br.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;		
	}
	
	public static String readLine(File file) {
		String lines = "";
		try {
			FileReader reader = new FileReader(file);
			final BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) {
				lines += line;
			}
			br.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;		
	}

}
