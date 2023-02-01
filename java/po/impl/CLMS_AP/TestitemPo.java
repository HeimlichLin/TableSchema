package com.doc.common.po.impl; 
 
public class TestitemPo implements ITestitemPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		TESTNO("委外單號"), //
		PRDTNO("產品號碼(料號)"), //
		PRDTQTY("產品數量"), //
		PRDTUNIT("產品單位"), //
		RSTRQTY("進倉數量"), //
		UNITPRICE("單價"), //
		UNINQTY("未進倉數量"), //
		ITEM("項次"), //
		DECLNO("報單號碼"), //
		ITEMNO("報單項次"), //
		OREFBILLNO("原參考單號"), //
		OITEM("原參考項次"), //
		INPOST("進倉儲位"), //
		DESCRIP("貨名"), //
		MOITEMNO("彙報暫存原報單項次") //
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
	private String testno;
	private String prdtno;
	private BigDecimal prdtqty;
	private String prdtunit;
	private BigDecimal rstrqty;
	private BigDecimal unitprice;
	private BigDecimal uninqty;
	private BigDecimal item;
	private String declno;
	private BigDecimal itemno;
	private String orefbillno;
	private BigDecimal oitem;
	private String inpost;
	private String descrip;
	private BigDecimal moitemno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getTestno() {
		return this.testno;
	}
 
	@Override
	public void setTestno(final String testno) {
		this.testno = testno; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getPrdtqty() {
		return this.prdtqty;
	}
 
	@Override
	public void setPrdtqty(final BigDecimal prdtqty) {
		this.prdtqty = prdtqty; 
	}
 
	@Override
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
	}
 
	@Override
	public BigDecimal getRstrqty() {
		return this.rstrqty;
	}
 
	@Override
	public void setRstrqty(final BigDecimal rstrqty) {
		this.rstrqty = rstrqty; 
	}
 
	@Override
	public BigDecimal getUnitprice() {
		return this.unitprice;
	}
 
	@Override
	public void setUnitprice(final BigDecimal unitprice) {
		this.unitprice = unitprice; 
	}
 
	@Override
	public BigDecimal getUninqty() {
		return this.uninqty;
	}
 
	@Override
	public void setUninqty(final BigDecimal uninqty) {
		this.uninqty = uninqty; 
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
	public String getOrefbillno() {
		return this.orefbillno;
	}
 
	@Override
	public void setOrefbillno(final String orefbillno) {
		this.orefbillno = orefbillno; 
	}
 
	@Override
	public BigDecimal getOitem() {
		return this.oitem;
	}
 
	@Override
	public void setOitem(final BigDecimal oitem) {
		this.oitem = oitem; 
	}
 
	@Override
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public BigDecimal getMoitemno() {
		return this.moitemno;
	}
 
	@Override
	public void setMoitemno(final BigDecimal moitemno) {
		this.moitemno = moitemno; 
	}
 
}
