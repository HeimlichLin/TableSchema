package com.doc.common.bean; 
 
public class WorkitemDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		WORKNO("加工單號"), 
		PARTNO("原料料號"), 
		CTMCODE("客戶代碼"), 
		ITEMNO("項次"), 
		USEQTY("使用數量"), 
		UNIT("單位"), 
		LOCATION("儲位"), 
		ODECLNO("原報單號碼"), 
		OITEMNO("原報單項次"), 
		BOND("是否帳冊"), 
		DESCRIP("貨名"), 
		D8DATE("原進倉報單日期"), 
		SPEC("規格"), 
		MOITEMNO("彙報暫存原項次") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getWorkno() { 
		return workno; 
	} 
 
	public void setWorkno(String workno) { 
		this.workno = workno; 
	} 
 
	public String getPartno() { 
		return partno; 
	} 
 
	public void setPartno(String partno) { 
		this.partno = partno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public BigDecimal getUseqty() { 
		return useqty; 
	} 
 
	public void setUseqty(BigDecimal useqty) { 
		this.useqty = useqty; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public String getLocation() { 
		return location; 
	} 
 
	public void setLocation(String location) { 
		this.location = location; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
	} 
 
	public String getBond() { 
		return bond; 
	} 
 
	public void setBond(String bond) { 
		this.bond = bond; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public String getD8date() { 
		return d8date; 
	} 
 
	public void setD8date(String d8date) { 
		this.d8date = d8date; 
	} 
 
	public String getSpec() { 
		return spec; 
	} 
 
	public void setSpec(String spec) { 
		this.spec = spec; 
	} 
 
	public BigDecimal getMoitemno() { 
		return moitemno; 
	} 
 
	public void setMoitemno(BigDecimal moitemno) { 
		this.moitemno = moitemno; 
	} 
 
} 
