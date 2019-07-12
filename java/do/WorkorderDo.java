package com.doc.common.bean; 
 
public class WorkorderDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		WORKNO("加工單號"), 
		CTMCODE("客戶代碼"), 
		PRDTNO("產品料號"), 
		PRDTQTY("產品數量"), 
		RSTRQTY("進倉數量"), 
		PRDTUNIT("產品單位"), 
		REQRDATE("需求日期"), 
		APPLYDATE("申請日期"), 
		APPROVEDNO("核准文號"), 
		APPROVEDDATE("核准日期"), 
		PRDTNAME("產品名稱"), 
		PRDTSPEC("產品規格"), 
		PROCESS("加工方式"), 
		D8DATE("原進倉報單日期") 
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
	private String ctmcode; 
	private String prdtno; 
	private BigDecimal prdtqty; 
	private BigDecimal rstrqty; 
	private String prdtunit; 
	private String reqrdate; 
	private String applydate; 
	private String approvedno; 
	private String approveddate; 
	private String prdtname; 
	private String prdtspec; 
	private String process; 
	private String d8date; 
	
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
 
	public BigDecimal getPrdtqty() { 
		return prdtqty; 
	} 
 
	public void setPrdtqty(BigDecimal prdtqty) { 
		this.prdtqty = prdtqty; 
	} 
 
	public BigDecimal getRstrqty() { 
		return rstrqty; 
	} 
 
	public void setRstrqty(BigDecimal rstrqty) { 
		this.rstrqty = rstrqty; 
	} 
 
	public String getPrdtunit() { 
		return prdtunit; 
	} 
 
	public void setPrdtunit(String prdtunit) { 
		this.prdtunit = prdtunit; 
	} 
 
	public String getReqrdate() { 
		return reqrdate; 
	} 
 
	public void setReqrdate(String reqrdate) { 
		this.reqrdate = reqrdate; 
	} 
 
	public String getApplydate() { 
		return applydate; 
	} 
 
	public void setApplydate(String applydate) { 
		this.applydate = applydate; 
	} 
 
	public String getApprovedno() { 
		return approvedno; 
	} 
 
	public void setApprovedno(String approvedno) { 
		this.approvedno = approvedno; 
	} 
 
	public String getApproveddate() { 
		return approveddate; 
	} 
 
	public void setApproveddate(String approveddate) { 
		this.approveddate = approveddate; 
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
 
	public String getProcess() { 
		return process; 
	} 
 
	public void setProcess(String process) { 
		this.process = process; 
	} 
 
	public String getD8date() { 
		return d8date; 
	} 
 
	public void setD8date(String d8date) { 
		this.d8date = d8date; 
	} 
 
} 
