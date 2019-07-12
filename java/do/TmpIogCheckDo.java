package com.doc.common.bean; 
 
public class TmpIogCheckDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		IOCOUNT("null"), 
		BCOUNT("null"), 
		GCOUNT("null"), 
		INIONOTG("null"), 
		INBNOTG("null"), 
		INGNOTIBO("null"), 
		INOROUT("null"), 
		MONTH("null"), 
		GMINUSIO("null") 
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
	private String iocount; 
	private String bcount; 
	private String gcount; 
	private String inionotg; 
	private String inbnotg; 
	private String ingnotibo; 
	private String inorout; 
	private String month; 
	private String gminusio; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getIocount() { 
		return iocount; 
	} 
 
	public void setIocount(String iocount) { 
		this.iocount = iocount; 
	} 
 
	public String getBcount() { 
		return bcount; 
	} 
 
	public void setBcount(String bcount) { 
		this.bcount = bcount; 
	} 
 
	public String getGcount() { 
		return gcount; 
	} 
 
	public void setGcount(String gcount) { 
		this.gcount = gcount; 
	} 
 
	public String getInionotg() { 
		return inionotg; 
	} 
 
	public void setInionotg(String inionotg) { 
		this.inionotg = inionotg; 
	} 
 
	public String getInbnotg() { 
		return inbnotg; 
	} 
 
	public void setInbnotg(String inbnotg) { 
		this.inbnotg = inbnotg; 
	} 
 
	public String getIngnotibo() { 
		return ingnotibo; 
	} 
 
	public void setIngnotibo(String ingnotibo) { 
		this.ingnotibo = ingnotibo; 
	} 
 
	public String getInorout() { 
		return inorout; 
	} 
 
	public void setInorout(String inorout) { 
		this.inorout = inorout; 
	} 
 
	public String getMonth() { 
		return month; 
	} 
 
	public void setMonth(String month) { 
		this.month = month; 
	} 
 
	public String getGminusio() { 
		return gminusio; 
	} 
 
	public void setGminusio(String gminusio) { 
		this.gminusio = gminusio; 
	} 
 
} 
