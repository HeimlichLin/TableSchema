package com.doc.common.bean; 
 
public class BomdetailDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		CTMCODE("客戶代碼"), 
		PRDTNO("產品料號"), 
		PARTNO("原料料號"), 
		UNITQTY("單位用量"), 
		UNIT("單位"), 
		REMARKS("備註"), 
		DESCRIP("品名"), 
		MODEL("型號"), 
		SPEC("規格"), 
		GOODQTY("null"), 
		BADQTY("null"), 
		MIXQTY("null"), 
		BOMRATE("null"), 
		BOMDATE("用料清表日期") 
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
	private String ctmcode; 
	private String prdtno; 
	private String partno; 
	private BigDecimal unitqty; 
	private String unit; 
	private String remarks; 
	private String descrip; 
	private String model; 
	private String spec; 
	private BigDecimal goodqty; 
	private BigDecimal badqty; 
	private BigDecimal mixqty; 
	private BigDecimal bomrate; 
	private String bomdate; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getPartno() { 
		return partno; 
	} 
 
	public void setPartno(String partno) { 
		this.partno = partno; 
	} 
 
	public BigDecimal getUnitqty() { 
		return unitqty; 
	} 
 
	public void setUnitqty(BigDecimal unitqty) { 
		this.unitqty = unitqty; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public String getRemarks() { 
		return remarks; 
	} 
 
	public void setRemarks(String remarks) { 
		this.remarks = remarks; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public String getModel() { 
		return model; 
	} 
 
	public void setModel(String model) { 
		this.model = model; 
	} 
 
	public String getSpec() { 
		return spec; 
	} 
 
	public void setSpec(String spec) { 
		this.spec = spec; 
	} 
 
	public BigDecimal getGoodqty() { 
		return goodqty; 
	} 
 
	public void setGoodqty(BigDecimal goodqty) { 
		this.goodqty = goodqty; 
	} 
 
	public BigDecimal getBadqty() { 
		return badqty; 
	} 
 
	public void setBadqty(BigDecimal badqty) { 
		this.badqty = badqty; 
	} 
 
	public BigDecimal getMixqty() { 
		return mixqty; 
	} 
 
	public void setMixqty(BigDecimal mixqty) { 
		this.mixqty = mixqty; 
	} 
 
	public BigDecimal getBomrate() { 
		return bomrate; 
	} 
 
	public void setBomrate(BigDecimal bomrate) { 
		this.bomrate = bomrate; 
	} 
 
	public String getBomdate() { 
		return bomdate; 
	} 
 
	public void setBomdate(String bomdate) { 
		this.bomdate = bomdate; 
	} 
 
} 
