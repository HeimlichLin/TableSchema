package com.doc.common.po.impl; 
 
public class ModlogPo implements IModlogPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		REFBILLNO("參考單號"), //
		ITEM("項次"), //
		POST("儲位"), //
		STRTYPE("進出倉別"), //
		MODIFER("修改者"), //
		MODTIME("修改時間"), //
		MODITEM("修改項目"), //
		ORIDATA("原始資料"), //
		MODDATA("修改資料"), //
		MODFILE("修改檔案"), //
		REMKS("備註"), //
		DECLNO("報單號碼"), //
		ITEMNO("項次"), //
		ODECLNO("原報單號碼"), //
		OITEMNO("項次") //
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

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
	}
 
	@Override
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
	@Override
	public String getModifer() {
		return this.modifer;
	}
 
	@Override
	public void setModifer(final String modifer) {
		this.modifer = modifer; 
	}
 
	@Override
	public java.sql.Timestamp getModtime() {
		return this.modtime;
	}
 
	@Override
	public void setModtime(final java.sql.Timestamp modtime) {
		this.modtime = modtime; 
	}
 
	@Override
	public String getModitem() {
		return this.moditem;
	}
 
	@Override
	public void setModitem(final String moditem) {
		this.moditem = moditem; 
	}
 
	@Override
	public String getOridata() {
		return this.oridata;
	}
 
	@Override
	public void setOridata(final String oridata) {
		this.oridata = oridata; 
	}
 
	@Override
	public String getModdata() {
		return this.moddata;
	}
 
	@Override
	public void setModdata(final String moddata) {
		this.moddata = moddata; 
	}
 
	@Override
	public String getModfile() {
		return this.modfile;
	}
 
	@Override
	public void setModfile(final String modfile) {
		this.modfile = modfile; 
	}
 
	@Override
	public String getRemks() {
		return this.remks;
	}
 
	@Override
	public void setRemks(final String remks) {
		this.remks = remks; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
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
	public String getOdeclno() {
		return this.odeclno;
	}
 
	@Override
	public void setOdeclno(final String odeclno) {
		this.odeclno = odeclno; 
	}
 
	@Override
	public String getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final String oitemno) {
		this.oitemno = oitemno; 
	}
 
}
