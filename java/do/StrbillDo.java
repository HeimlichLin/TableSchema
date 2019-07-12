package com.doc.common.bean; 
 
public class StrbillDo { 
 
	public enum COLUMNS { 
		MSGFUN("異動別"), 
		BONDNO("監管編號"), 
		STRTYPE("進出倉別"), 
		GDSTYPE("貨物類別"), 
		REFBILLNO("參考單號"), 
		CTMCODE("客戶編碼"), 
		SUBCON("委外商"), 
		OTHERS("其它") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String msgfun; 
	private String bondno; 
	private String strtype; 
	private String gdstype; 
	private String refbillno; 
	private String ctmcode; 
	private String subcon; 
	private String others; 
	
	public String getMsgfun() { 
		return msgfun; 
	} 
 
	public void setMsgfun(String msgfun) { 
		this.msgfun = msgfun; 
	} 
 
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getGdstype() { 
		return gdstype; 
	} 
 
	public void setGdstype(String gdstype) { 
		this.gdstype = gdstype; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getSubcon() { 
		return subcon; 
	} 
 
	public void setSubcon(String subcon) { 
		this.subcon = subcon; 
	} 
 
	public String getOthers() { 
		return others; 
	} 
 
	public void setOthers(String others) { 
		this.others = others; 
	} 
 
} 
