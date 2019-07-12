package com.doc.common.bean; 
 
public class TestorderDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		TESTNO("null"), 
		CTMCODE("null"), 
		SUBCODE("null"), 
		REQRDATE("null"), 
		APPLYDATE("null"), 
		APPRVNO("null"), 
		APPROVEDDATE("null"), 
		DESTPLACE("null"), 
		TESTTYPE("null"), 
		CONFIRMDATE("null") 
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
	private String testno; 
	private String ctmcode; 
	private String subcode; 
	private String reqrdate; 
	private String applydate; 
	private String apprvno; 
	private String approveddate; 
	private String destplace; 
	private String testtype; 
	private String confirmdate; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getTestno() { 
		return testno; 
	} 
 
	public void setTestno(String testno) { 
		this.testno = testno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getSubcode() { 
		return subcode; 
	} 
 
	public void setSubcode(String subcode) { 
		this.subcode = subcode; 
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
 
	public String getApprvno() { 
		return apprvno; 
	} 
 
	public void setApprvno(String apprvno) { 
		this.apprvno = apprvno; 
	} 
 
	public String getApproveddate() { 
		return approveddate; 
	} 
 
	public void setApproveddate(String approveddate) { 
		this.approveddate = approveddate; 
	} 
 
	public String getDestplace() { 
		return destplace; 
	} 
 
	public void setDestplace(String destplace) { 
		this.destplace = destplace; 
	} 
 
	public String getTesttype() { 
		return testtype; 
	} 
 
	public void setTesttype(String testtype) { 
		this.testtype = testtype; 
	} 
 
	public String getConfirmdate() { 
		return confirmdate; 
	} 
 
	public void setConfirmdate(String confirmdate) { 
		this.confirmdate = confirmdate; 
	} 
 
} 
