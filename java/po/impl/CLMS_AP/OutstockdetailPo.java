package com.doc.common.po.impl; 
 
public class OutstockdetailPo implements IOutstockdetailPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		OUTSTRNO("參考單號"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		DESCRIP("貨名"), //
		UNIT("單位"), //
		OUTQTY("實際出倉數量"), //
		OUTPOST("儲位"), //
		STOCKNO("進倉單號"), //
		ODECLNO("原報單號碼"), //
		OITEMNO("原報單項次"), //
		RMK("出倉註記"), //
		UPDTIME("null"), //
		OUTSTATUS("出倉狀態"), //
		NWGHT("null"), //
		OREFBILLNO("原參考單號"), //
		OITEM("原項次"), //
		RSTRQTY("null"), //
		UNINQTY("null") //
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
	private String outstrno;
	private String item;
	private String prdtno;
	private String descrip;
	private String unit;
	private BigDecimal outqty;
	private String outpost;
	private String stockno;
	private String odeclno;
	private BigDecimal oitemno;
	private String rmk;
	private String updtime;
	private String outstatus;
	private BigDecimal nwght;
	private String orefbillno;
	private BigDecimal oitem;
	private BigDecimal rstrqty;
	private BigDecimal uninqty;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getOutstrno() {
		return this.outstrno;
	}
 
	@Override
	public void setOutstrno(final String outstrno) {
		this.outstrno = outstrno; 
	}
 
	@Override
	public String getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final String item) {
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
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
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
	public BigDecimal getOutqty() {
		return this.outqty;
	}
 
	@Override
	public void setOutqty(final BigDecimal outqty) {
		this.outqty = outqty; 
	}
 
	@Override
	public String getOutpost() {
		return this.outpost;
	}
 
	@Override
	public void setOutpost(final String outpost) {
		this.outpost = outpost; 
	}
 
	@Override
	public String getStockno() {
		return this.stockno;
	}
 
	@Override
	public void setStockno(final String stockno) {
		this.stockno = stockno; 
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
	public BigDecimal getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final BigDecimal oitemno) {
		this.oitemno = oitemno; 
	}
 
	@Override
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getOutstatus() {
		return this.outstatus;
	}
 
	@Override
	public void setOutstatus(final String outstatus) {
		this.outstatus = outstatus; 
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
	public BigDecimal getRstrqty() {
		return this.rstrqty;
	}
 
	@Override
	public void setRstrqty(final BigDecimal rstrqty) {
		this.rstrqty = rstrqty; 
	}
 
	@Override
	public BigDecimal getUninqty() {
		return this.uninqty;
	}
 
	@Override
	public void setUninqty(final BigDecimal uninqty) {
		this.uninqty = uninqty; 
	}
 
}
