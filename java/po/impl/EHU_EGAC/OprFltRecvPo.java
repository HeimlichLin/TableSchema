package com.doc.common.po.impl; 
 
public class OprFltRecvPo implements IOprFltRecvPo {
 
	public enum COLUMNS {
		ORI_CHG_COD("航空公司代碼"), //
		COD_DST_ADD("航空公司所需傳送之位置"), //
		CREATE_DATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String oriChgCod;
	private String codDstAdd;
	private java.sql.Timestamp createDate;

	@Override
	public String getOriChgCod() {
		return this.oriChgCod;
	}
 
	@Override
	public void setOriChgCod(final String oriChgCod) {
		this.oriChgCod = oriChgCod; 
	}
 
	@Override
	public String getCodDstAdd() {
		return this.codDstAdd;
	}
 
	@Override
	public void setCodDstAdd(final String codDstAdd) {
		this.codDstAdd = codDstAdd; 
	}
 
	@Override
	public java.sql.Timestamp getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final java.sql.Timestamp createDate) {
		this.createDate = createDate; 
	}
 
}
