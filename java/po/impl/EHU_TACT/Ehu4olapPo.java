package com.doc.common.po.impl; 
 
public class Ehu4olapPo implements IEhu4olapPo {
 
	public enum COLUMNS {
		CARGO_LOCATION("貨棧代碼, 'C':台北  'K':高雄"), //
		LOCAL_TYPE("倉別, 'O'EHU出口倉, 'B'進口倉"), //
		DATA_TYPE("資料類別: '1' 激勵佣金, '2': 倉租優惠 '3':倉租收入 '4'貨量"), //
		DATA_DATE("資料日期"), //
		CUS_TYPE("客戶別: 'A'航空公司, 'M':主號(前三碼)  'G':出口(箱號) 'F':進口箱號  'I':統編"), //
		CUS_NO("客戶代碼: "), //
		AMOUNT("金額"), //
		WET("實重"), //
		PCS("件數"), //
		COUNT("筆數"), //
		LASTUPDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String cargoLocation;
	private String localType;
	private String dataType;
	private String dataDate;
	private String cusType;
	private String cusNo;
	private BigDecimal amount;
	private BigDecimal wet;
	private BigDecimal pcs;
	private BigDecimal count;
	private java.sql.Timestamp lastupdate;

	@Override
	public String getCargoLocation() {
		return this.cargoLocation;
	}
 
	@Override
	public void setCargoLocation(final String cargoLocation) {
		this.cargoLocation = cargoLocation; 
	}
 
	@Override
	public String getLocalType() {
		return this.localType;
	}
 
	@Override
	public void setLocalType(final String localType) {
		this.localType = localType; 
	}
 
	@Override
	public String getDataType() {
		return this.dataType;
	}
 
	@Override
	public void setDataType(final String dataType) {
		this.dataType = dataType; 
	}
 
	@Override
	public String getDataDate() {
		return this.dataDate;
	}
 
	@Override
	public void setDataDate(final String dataDate) {
		this.dataDate = dataDate; 
	}
 
	@Override
	public String getCusType() {
		return this.cusType;
	}
 
	@Override
	public void setCusType(final String cusType) {
		this.cusType = cusType; 
	}
 
	@Override
	public String getCusNo() {
		return this.cusNo;
	}
 
	@Override
	public void setCusNo(final String cusNo) {
		this.cusNo = cusNo; 
	}
 
	@Override
	public BigDecimal getAmount() {
		return this.amount;
	}
 
	@Override
	public void setAmount(final BigDecimal amount) {
		this.amount = amount; 
	}
 
	@Override
	public BigDecimal getWet() {
		return this.wet;
	}
 
	@Override
	public void setWet(final BigDecimal wet) {
		this.wet = wet; 
	}
 
	@Override
	public BigDecimal getPcs() {
		return this.pcs;
	}
 
	@Override
	public void setPcs(final BigDecimal pcs) {
		this.pcs = pcs; 
	}
 
	@Override
	public BigDecimal getCount() {
		return this.count;
	}
 
	@Override
	public void setCount(final BigDecimal count) {
		this.count = count; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
}
