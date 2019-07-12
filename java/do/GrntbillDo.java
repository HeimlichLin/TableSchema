package com.doc.common.bean; 
 
public class GrntbillDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		BILLNO("單號"), 
		DEPSDATE("繳納日期"), 
		DEPSAMT("繳納金額"), 
		RMKS("備註"), 
		MSGFUN("異動別"), 
		VALIDDATE("擔保有效(截止)日期") 
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
	private String billno; 
	private String depsdate; 
	private BigDecimal depsamt; 
	private String rmks; 
	private String msgfun; 
	private String validdate; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getBillno() { 
		return billno; 
	} 
 
	public void setBillno(String billno) { 
		this.billno = billno; 
	} 
 
	public String getDepsdate() { 
		return depsdate; 
	} 
 
	public void setDepsdate(String depsdate) { 
		this.depsdate = depsdate; 
	} 
 
	public BigDecimal getDepsamt() { 
		return depsamt; 
	} 
 
	public void setDepsamt(BigDecimal depsamt) { 
		this.depsamt = depsamt; 
	} 
 
	public String getRmks() { 
		return rmks; 
	} 
 
	public void setRmks(String rmks) { 
		this.rmks = rmks; 
	} 
 
	public String getMsgfun() { 
		return msgfun; 
	} 
 
	public void setMsgfun(String msgfun) { 
		this.msgfun = msgfun; 
	} 
 
	public String getValiddate() { 
		return validdate; 
	} 
 
	public void setValiddate(String validdate) { 
		this.validdate = validdate; 
	} 
 
} 
