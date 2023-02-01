package com.doc.common.po.impl; 
 
public class ScrapinPo implements IScrapinPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		SCRAPNO("報廢單號"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		CCCCODE("商品分類號列"), //
		DESCRIP("貨名"), //
		QTY("數量"), //
		UNIT("單位"), //
		UNITPRICE("單價"), //
		NWGHT("淨重"), //
		GROSS("毛重"), //
		DECLNO("報單號碼"), //
		VALUEAMT("剩餘價格"), //
		INPOST("儲位") //
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
	private String scrapno;
	private BigDecimal item;
	private String prdtno;
	private String ccccode;
	private String descrip;
	private BigDecimal qty;
	private String unit;
	private BigDecimal unitprice;
	private BigDecimal nwght;
	private BigDecimal gross;
	private String declno;
	private BigDecimal valueamt;
	private String inpost;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getScrapno() {
		return this.scrapno;
	}
 
	@Override
	public void setScrapno(final String scrapno) {
		this.scrapno = scrapno; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
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
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
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
	public BigDecimal getNwght() {
		return this.nwght;
	}
 
	@Override
	public void setNwght(final BigDecimal nwght) {
		this.nwght = nwght; 
	}
 
	@Override
	public BigDecimal getGross() {
		return this.gross;
	}
 
	@Override
	public void setGross(final BigDecimal gross) {
		this.gross = gross; 
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
	public BigDecimal getValueamt() {
		return this.valueamt;
	}
 
	@Override
	public void setValueamt(final BigDecimal valueamt) {
		this.valueamt = valueamt; 
	}
 
	@Override
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
	}
 
}
