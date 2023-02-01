package com.doc.common.po.impl; 
 
public class ScrapItemPo implements IScrapItemPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		SCRAP_NO("報廢單號碼"), //
		ITEM("項次"), //
		PRDT_NO("料號"), //
		DESCRIP("品名"), //
		PRDT_QTY("數量"), //
		UNIT_PRICE("單價"), //
		NET("淨重"), //
		O_DECL_NO("原進倉報單號碼"), //
		O_ITEM_NO("原進倉報單項次"), //
		PRDT_UNIT("單位"), //
		OUT_POST("儲位"), //
		BOM_NO("用料清表編號"), //
		O_GDS_TYPE("原進倉作業類別"), //
		ROW_PRDT_NO("折合原料料號"), //
		ROW_QTY("折合原料數量"), //
		REMRKS("備註") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String scrapNo;
	private BigDecimal item;
	private String prdtNo;
	private String descrip;
	private BigDecimal prdtQty;
	private BigDecimal unitPrice;
	private BigDecimal net;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private String prdtUnit;
	private String outPost;
	private String bomNo;
	private String oGdsType;
	private String rowPrdtNo;
	private BigDecimal rowQty;
	private String remrks;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getScrapNo() {
		return this.scrapNo;
	}
 
	@Override
	public void setScrapNo(final String scrapNo) {
		this.scrapNo = scrapNo; 
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
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
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
	public BigDecimal getPrdtQty() {
		return this.prdtQty;
	}
 
	@Override
	public void setPrdtQty(final BigDecimal prdtQty) {
		this.prdtQty = prdtQty; 
	}
 
	@Override
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
 
	@Override
	public void setUnitPrice(final BigDecimal unitPrice) {
		this.unitPrice = unitPrice; 
	}
 
	@Override
	public BigDecimal getNet() {
		return this.net;
	}
 
	@Override
	public void setNet(final BigDecimal net) {
		this.net = net; 
	}
 
	@Override
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
	@Override
	public BigDecimal getOItemNo() {
		return this.oItemNo;
	}
 
	@Override
	public void setOItemNo(final BigDecimal oItemNo) {
		this.oItemNo = oItemNo; 
	}
 
	@Override
	public String getPrdtUnit() {
		return this.prdtUnit;
	}
 
	@Override
	public void setPrdtUnit(final String prdtUnit) {
		this.prdtUnit = prdtUnit; 
	}
 
	@Override
	public String getOutPost() {
		return this.outPost;
	}
 
	@Override
	public void setOutPost(final String outPost) {
		this.outPost = outPost; 
	}
 
	@Override
	public String getBomNo() {
		return this.bomNo;
	}
 
	@Override
	public void setBomNo(final String bomNo) {
		this.bomNo = bomNo; 
	}
 
	@Override
	public String getOGdsType() {
		return this.oGdsType;
	}
 
	@Override
	public void setOGdsType(final String oGdsType) {
		this.oGdsType = oGdsType; 
	}
 
	@Override
	public String getRowPrdtNo() {
		return this.rowPrdtNo;
	}
 
	@Override
	public void setRowPrdtNo(final String rowPrdtNo) {
		this.rowPrdtNo = rowPrdtNo; 
	}
 
	@Override
	public BigDecimal getRowQty() {
		return this.rowQty;
	}
 
	@Override
	public void setRowQty(final BigDecimal rowQty) {
		this.rowQty = rowQty; 
	}
 
	@Override
	public String getRemrks() {
		return this.remrks;
	}
 
	@Override
	public void setRemrks(final String remrks) {
		this.remrks = remrks; 
	}
 
}
