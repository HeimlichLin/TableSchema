package com.doc.common.po.impl; 
 
public class TestTablePo implements ITestTablePo {
 
	public enum COLUMNS {
		USER_NAME("使用者名稱"), //
		COM_NAME("公司名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String userName;
	private String comName;

	@Override
	public String getUserName() {
		return this.userName;
	}
 
	@Override
	public void setUserName(final String userName) {
		this.userName = userName; 
	}
 
	@Override
	public String getComName() {
		return this.comName;
	}
 
	@Override
	public void setComName(final String comName) {
		this.comName = comName; 
	}
 
}
