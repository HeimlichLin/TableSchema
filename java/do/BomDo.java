package com.doc.common.bean; 
 
public class BomDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		CTMCODE("客戶代碼"), 
		PRDTNO("產品料號"), 
		PRDTNAME("產品名稱"), 
		PRDTSPEC("產品規格"), 
		PRDTUNIT("產品單位"), 
		PROCESS("加工方式"), 
		WHS("工時"), 
		APPROVEDNO("核准文號"), 
		BOMNO("用料清單號碼"), 
		BOMDATE("用料清表日期"), 
		BOMTYPE("用料清表種類") 
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
	private String prdtname; 
	private String prdtspec; 
	private String prdtunit; 
	private String process; 
	private BigDecimal whs; 
	private String approvedno; 
	private String bomno; 
	private String bomdate; 
	private String bomtype; 
	
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
 
	public String getPrdtname() { 
		return prdtname; 
	} 
 
	public void setPrdtname(String prdtname) { 
		this.prdtname = prdtname; 
	} 
 
	public String getPrdtspec() { 
		return prdtspec; 
	} 
 
	public void setPrdtspec(String prdtspec) { 
		this.prdtspec = prdtspec; 
	} 
 
	public String getPrdtunit() { 
		return prdtunit; 
	} 
 
	public void setPrdtunit(String prdtunit) { 
		this.prdtunit = prdtunit; 
	} 
 
	public String getProcess() { 
		return process; 
	} 
 
	public void setProcess(String process) { 
		this.process = process; 
	} 
 
	public BigDecimal getWhs() { 
		return whs; 
	} 
 
	public void setWhs(BigDecimal whs) { 
		this.whs = whs; 
	} 
 
	public String getApprovedno() { 
		return approvedno; 
	} 
 
	public void setApprovedno(String approvedno) { 
		this.approvedno = approvedno; 
	} 
 
	public String getBomno() { 
		return bomno; 
	} 
 
	public void setBomno(String bomno) { 
		this.bomno = bomno; 
	} 
 
	public String getBomdate() { 
		return bomdate; 
	} 
 
	public void setBomdate(String bomdate) { 
		this.bomdate = bomdate; 
	} 
 
	public String getBomtype() { 
		return bomtype; 
	} 
 
	public void setBomtype(String bomtype) { 
		this.bomtype = bomtype; 
	} 
 
} 
