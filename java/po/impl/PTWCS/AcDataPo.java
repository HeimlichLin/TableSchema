package com.doc.common.po.impl; 
 
public class AcDataPo implements IAcDataPo {
 
	public enum COLUMNS {
		WH_CODE("CA：華儲
CG：榮儲
CW：遠雄"), //
		AC_ID("貨棧代號+三位流水號"), //
		STORE_DESC("倉別描述"), //
		CONT_TEL("連絡電話"), //
		EXPRESS_GROUP("Y：是
N：否"), //
		CANCEL_MARK("Y：是
N：否
") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whCode;
	private String acId;
	private String storeDesc;
	private String contTel;
	private String expressGroup;
	private String cancelMark;

	@Override
	public String getWhCode() {
		return this.whCode;
	}
 
	@Override
	public void setWhCode(final String whCode) {
		this.whCode = whCode; 
	}
 
	@Override
	public String getAcId() {
		return this.acId;
	}
 
	@Override
	public void setAcId(final String acId) {
		this.acId = acId; 
	}
 
	@Override
	public String getStoreDesc() {
		return this.storeDesc;
	}
 
	@Override
	public void setStoreDesc(final String storeDesc) {
		this.storeDesc = storeDesc; 
	}
 
	@Override
	public String getContTel() {
		return this.contTel;
	}
 
	@Override
	public void setContTel(final String contTel) {
		this.contTel = contTel; 
	}
 
	@Override
	public String getExpressGroup() {
		return this.expressGroup;
	}
 
	@Override
	public void setExpressGroup(final String expressGroup) {
		this.expressGroup = expressGroup; 
	}
 
	@Override
	public String getCancelMark() {
		return this.cancelMark;
	}
 
	@Override
	public void setCancelMark(final String cancelMark) {
		this.cancelMark = cancelMark; 
	}
 
}
