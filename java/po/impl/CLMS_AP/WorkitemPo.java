package com.doc.common.po.impl; 
 
public class WorkitemPo implements IWorkitemPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		WORKNO("加工單號"), //
		PARTNO("料號"), //
		CTMCODE("客戶代碼(客戶編碼)"), //
		ITEMNO("項次"), //
		USEQTY("使用數量"), //
		UNIT("單位"), //
		LOCATION("儲位"), //
		ODECLNO("原報單號碼"), //
		OITEMNO("原報單項次"), //
		BOND("是否保稅"), //
		DESCRIP("品名"), //
		D8DATE("原進倉報單日期"), //
		SPEC("規格"), //
		MOITEMNO("彙報暫存原項次") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String workno;
	private String partno;
	private String ctmcode;
	private BigDecimal itemno;
	private BigDecimal useqty;
	private String unit;
	private String location;
	private String odeclno;
	private BigDecimal oitemno;
	private String bond;
	private String descrip;
	private String d8date;
	private String spec;
	private BigDecimal moitemno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getWorkno() {
		return this.workno;
	}
 
	@Override
	public void setWorkno(final String workno) {
		this.workno = workno; 
	}
 
	@Override
	public String getPartno() {
		return this.partno;
	}
 
	@Override
	public void setPartno(final String partno) {
		this.partno = partno; 
	}
 
	@Override
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
	}
 
	@Override
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
	}
 
	@Override
	public BigDecimal getUseqty() {
		return this.useqty;
	}
 
	@Override
	public void setUseqty(final BigDecimal useqty) {
		this.useqty = useqty; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getLocation() {
		return this.location;
	}
 
	@Override
	public void setLocation(final String location) {
		this.location = location; 
	}
 
	@Override
	public String getOdeclno() {
		return this.odeclno;
	}
 
	@Override
	public void setOdeclno(final String odeclno) {
		this.odeclno = odeclno; 
	}
 
	@Override
	public BigDecimal getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final BigDecimal oitemno) {
		this.oitemno = oitemno; 
	}
 
	@Override
	public String getBond() {
		return this.bond;
	}
 
	@Override
	public void setBond(final String bond) {
		this.bond = bond; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public String getD8date() {
		return this.d8date;
	}
 
	@Override
	public void setD8date(final String d8date) {
		this.d8date = d8date; 
	}
 
	@Override
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
	}
 
	@Override
	public BigDecimal getMoitemno() {
		return this.moitemno;
	}
 
	@Override
	public void setMoitemno(final BigDecimal moitemno) {
		this.moitemno = moitemno; 
	}
 
}
