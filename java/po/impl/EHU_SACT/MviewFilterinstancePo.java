package com.doc.common.po.impl; 
 
public class MviewFilterinstancePo implements IMviewFilterinstancePo {
 
	public enum COLUMNS {
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 

}
