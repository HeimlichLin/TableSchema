package com.doc.common.bean; 
 
public class ModlogDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		REFBILLNO("參考單號(報單/倉單)"), 
		ITEM("項次"), 
		POST("儲位"), 
		STRTYPE("進出倉別"), 
		MODIFER("修改者"), 
		MODTIME("修改時間"), 
		MODITEM("修改項目"), 
		ORIDATA("異動前資料"), 
		MODDATA("異動後資料"), 
		MODFILE("修改類別 1:報單 2:倉單"), 
		REMKS("備註"), 
		DECLNO("報單號碼"), 
		ITEMNO("項次"), 
		ODECLNO("原報單號碼"), 
		OITEMNO("項次") 
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
	private String refbillno; 
	private BigDecimal item; 
	private String post; 
	private String strtype; 
	private String modifer; 
	private java.sql.Timestamp modtime; 
	private String moditem; 
	private String oridata; 
	private String moddata; 
	private String modfile; 
	private String remks; 
	private String declno; 
	private BigDecimal itemno; 
	private String odeclno; 
	private String oitemno; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getPost() { 
		return post; 
	} 
 
	public void setPost(String post) { 
		this.post = post; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getModifer() { 
		return modifer; 
	} 
 
	public void setModifer(String modifer) { 
		this.modifer = modifer; 
	} 
 
	public java.sql.Timestamp getModtime() { 
		return modtime; 
	} 
 
	public void setModtime(java.sql.Timestamp modtime) { 
		this.modtime = modtime; 
	} 
 
	public String getModitem() { 
		return moditem; 
	} 
 
	public void setModitem(String moditem) { 
		this.moditem = moditem; 
	} 
 
	public String getOridata() { 
		return oridata; 
	} 
 
	public void setOridata(String oridata) { 
		this.oridata = oridata; 
	} 
 
	public String getModdata() { 
		return moddata; 
	} 
 
	public void setModdata(String moddata) { 
		this.moddata = moddata; 
	} 
 
	public String getModfile() { 
		return modfile; 
	} 
 
	public void setModfile(String modfile) { 
		this.modfile = modfile; 
	} 
 
	public String getRemks() { 
		return remks; 
	} 
 
	public void setRemks(String remks) { 
		this.remks = remks; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public String getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(String oitemno) { 
		this.oitemno = oitemno; 
	} 
 
} 
