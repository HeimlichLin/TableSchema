package com.doc.common.bean; 
 
public class ViewPdCheckLogDo { 
 
	public enum COLUMNS { 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	
} 
