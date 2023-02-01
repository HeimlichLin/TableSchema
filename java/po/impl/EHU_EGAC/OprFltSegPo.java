package com.doc.common.po.impl; 
 
public class OprFltSegPo implements IOprFltSegPo {
 
	public enum COLUMNS {
		FSU_TYPE("FSU訊息別"), //
		COD_FLT_CAR("航空公司代碼"), //
		COD_FLT_NUM("航班編號"), //
		COD_APT_BRD("起運地"), //
		COD_APT_OFF("目的地"), //
		SEND_ACTIVE("是否傳送；Y：啟用傳送；N：不傳送"), //
		CREATE_DATE("null"), //
		MODETYPE("1：依EDI、業者艙單資料； 2：依FFM艙單資料") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String fsuType;
	private String codFltCar;
	private String codFltNum;
	private String codAptBrd;
	private String codAptOff;
	private String sendActive;
	private java.sql.Timestamp createDate;
	private String modetype;

	@Override
	public String getFsuType() {
		return this.fsuType;
	}
 
	@Override
	public void setFsuType(final String fsuType) {
		this.fsuType = fsuType; 
	}
 
	@Override
	public String getCodFltCar() {
		return this.codFltCar;
	}
 
	@Override
	public void setCodFltCar(final String codFltCar) {
		this.codFltCar = codFltCar; 
	}
 
	@Override
	public String getCodFltNum() {
		return this.codFltNum;
	}
 
	@Override
	public void setCodFltNum(final String codFltNum) {
		this.codFltNum = codFltNum; 
	}
 
	@Override
	public String getCodAptBrd() {
		return this.codAptBrd;
	}
 
	@Override
	public void setCodAptBrd(final String codAptBrd) {
		this.codAptBrd = codAptBrd; 
	}
 
	@Override
	public String getCodAptOff() {
		return this.codAptOff;
	}
 
	@Override
	public void setCodAptOff(final String codAptOff) {
		this.codAptOff = codAptOff; 
	}
 
	@Override
	public String getSendActive() {
		return this.sendActive;
	}
 
	@Override
	public void setSendActive(final String sendActive) {
		this.sendActive = sendActive; 
	}
 
	@Override
	public java.sql.Timestamp getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final java.sql.Timestamp createDate) {
		this.createDate = createDate; 
	}
 
	@Override
	public String getModetype() {
		return this.modetype;
	}
 
	@Override
	public void setModetype(final String modetype) {
		this.modetype = modetype; 
	}
 
}
