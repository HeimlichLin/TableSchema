package com.doc.common.po.impl; 
 
public class ChecksheetPo implements IChecksheetPo {
 
	public enum COLUMNS {
		DATE1("null"), //
		DATE2("null"), //
		DATATYPE("null"), //
		IE("null"), //
		CUSID("null"), //
		CUSNAME("null"), //
		DEFTIME("null"), //
		DATADATE("null"), //
		WT1("null"), //
		WT1_TOT("null"), //
		WT2("null"), //
		WT2_TOT("null"), //
		CREATE_DATE("null"), //
		CREATE_USER("null"), //
		SNO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String date1;
	private String date2;
	private String datatype;
	private String ie;
	private String cusid;
	private String cusname;
	private String deftime;
	private String datadate;
	private String wt1;
	private String wt1Tot;
	private String wt2;
	private String wt2Tot;
	private String createDate;
	private String createUser;
	private BigDecimal sno;

	@Override
	public String getDate1() {
		return this.date1;
	}
 
	@Override
	public void setDate1(final String date1) {
		this.date1 = date1; 
	}
 
	@Override
	public String getDate2() {
		return this.date2;
	}
 
	@Override
	public void setDate2(final String date2) {
		this.date2 = date2; 
	}
 
	@Override
	public String getDatatype() {
		return this.datatype;
	}
 
	@Override
	public void setDatatype(final String datatype) {
		this.datatype = datatype; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getCusid() {
		return this.cusid;
	}
 
	@Override
	public void setCusid(final String cusid) {
		this.cusid = cusid; 
	}
 
	@Override
	public String getCusname() {
		return this.cusname;
	}
 
	@Override
	public void setCusname(final String cusname) {
		this.cusname = cusname; 
	}
 
	@Override
	public String getDeftime() {
		return this.deftime;
	}
 
	@Override
	public void setDeftime(final String deftime) {
		this.deftime = deftime; 
	}
 
	@Override
	public String getDatadate() {
		return this.datadate;
	}
 
	@Override
	public void setDatadate(final String datadate) {
		this.datadate = datadate; 
	}
 
	@Override
	public String getWt1() {
		return this.wt1;
	}
 
	@Override
	public void setWt1(final String wt1) {
		this.wt1 = wt1; 
	}
 
	@Override
	public String getWt1Tot() {
		return this.wt1Tot;
	}
 
	@Override
	public void setWt1Tot(final String wt1Tot) {
		this.wt1Tot = wt1Tot; 
	}
 
	@Override
	public String getWt2() {
		return this.wt2;
	}
 
	@Override
	public void setWt2(final String wt2) {
		this.wt2 = wt2; 
	}
 
	@Override
	public String getWt2Tot() {
		return this.wt2Tot;
	}
 
	@Override
	public void setWt2Tot(final String wt2Tot) {
		this.wt2Tot = wt2Tot; 
	}
 
	@Override
	public String getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final String createDate) {
		this.createDate = createDate; 
	}
 
	@Override
	public String getCreateUser() {
		return this.createUser;
	}
 
	@Override
	public void setCreateUser(final String createUser) {
		this.createUser = createUser; 
	}
 
	@Override
	public BigDecimal getSno() {
		return this.sno;
	}
 
	@Override
	public void setSno(final BigDecimal sno) {
		this.sno = sno; 
	}
 
}
