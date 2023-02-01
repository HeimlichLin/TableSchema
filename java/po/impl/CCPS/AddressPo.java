package com.doc.common.po.impl; 
 
public class AddressPo implements IAddressPo {
 
	public enum COLUMNS {
		COUNTY("縣市"), //
		TOWNSHIP_AREA("市鄉鎮區") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String county;
	private String townshipArea;

	@Override
	public String getCounty() {
		return this.county;
	}
 
	@Override
	public void setCounty(final String county) {
		this.county = county; 
	}
 
	@Override
	public String getTownshipArea() {
		return this.townshipArea;
	}
 
	@Override
	public void setTownshipArea(final String townshipArea) {
		this.townshipArea = townshipArea; 
	}
 
}
