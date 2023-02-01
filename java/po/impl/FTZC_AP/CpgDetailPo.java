package com.doc.common.po.impl; 
 
public class CpgDetailPo implements ICpgDetailPo {
 
	public enum COLUMNS {
		BAGSFIELDNAME("欄位名稱"), //
		BAGSFIELDVALUE("欄位值"), //
		BAGNO("袋序"), //
		BAGSLASTMARK("最後一袋(F)"), //
		BAGSPAGENO("該袋頁數"), //
		BAGSQTY("件數"), //
		BAGSWEIGHT("重量"), //
		BAGSOTHERFIELDS("其他欄位"), //
		ITEMSFIELDNAME("欄位名稱"), //
		ITEMSFIELDVALUE("欄位值"), //
		ITEMSPAGENO("頁序"), //
		ITEMSCELLNO("格次"), //
		ITEMSPOSTNO("郵件號碼"), //
		ITEMSQTY("數量"), //
		ITEMSQTYUNIT("單位"), //
		ITEMSWEIGHT("重量(公斤)"), //
		DECLAREVALUEAMT("申報價值(新臺幣)"), //
		ORIGINCOUNTRY("原產地"), //
		PROVINCETYPE("省別"), //
		BOXTYPE("箱別"), //
		DELIVERDATETIME("交寄日期"), //
		SENDERNAME("原始寄件人名稱"), //
		SENDERADDRESS("原始寄件人地址"), //
		RECEIVERNAME("收件人名稱"), //
		RECEIVERADDRESS("收件人地址"), //
		GOODSDESCRIPTION("內裝物品"), //
		OTHERFIELDS("其他欄位"), //
		FILENAME("檔名") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bagsfieldname;
	private String bagsfieldvalue;
	private String bagno;
	private String bagslastmark;
	private String bagspageno;
	private BigDecimal bagsqty;
	private BigDecimal bagsweight;
	private String bagsotherfields;
	private String itemsfieldname;
	private String itemsfieldvalue;
	private String itemspageno;
	private String itemscellno;
	private String itemspostno;
	private String itemsqty;
	private String itemsqtyunit;
	private BigDecimal itemsweight;
	private String declarevalueamt;
	private String origincountry;
	private String provincetype;
	private String boxtype;
	private String deliverdatetime;
	private String sendername;
	private String senderaddress;
	private String receivername;
	private String receiveraddress;
	private String goodsdescription;
	private String otherfields;
	private String filename;

	@Override
	public String getBagsfieldname() {
		return this.bagsfieldname;
	}
 
	@Override
	public void setBagsfieldname(final String bagsfieldname) {
		this.bagsfieldname = bagsfieldname; 
	}
 
	@Override
	public String getBagsfieldvalue() {
		return this.bagsfieldvalue;
	}
 
	@Override
	public void setBagsfieldvalue(final String bagsfieldvalue) {
		this.bagsfieldvalue = bagsfieldvalue; 
	}
 
	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getBagslastmark() {
		return this.bagslastmark;
	}
 
	@Override
	public void setBagslastmark(final String bagslastmark) {
		this.bagslastmark = bagslastmark; 
	}
 
	@Override
	public String getBagspageno() {
		return this.bagspageno;
	}
 
	@Override
	public void setBagspageno(final String bagspageno) {
		this.bagspageno = bagspageno; 
	}
 
	@Override
	public BigDecimal getBagsqty() {
		return this.bagsqty;
	}
 
	@Override
	public void setBagsqty(final BigDecimal bagsqty) {
		this.bagsqty = bagsqty; 
	}
 
	@Override
	public BigDecimal getBagsweight() {
		return this.bagsweight;
	}
 
	@Override
	public void setBagsweight(final BigDecimal bagsweight) {
		this.bagsweight = bagsweight; 
	}
 
	@Override
	public String getBagsotherfields() {
		return this.bagsotherfields;
	}
 
	@Override
	public void setBagsotherfields(final String bagsotherfields) {
		this.bagsotherfields = bagsotherfields; 
	}
 
	@Override
	public String getItemsfieldname() {
		return this.itemsfieldname;
	}
 
	@Override
	public void setItemsfieldname(final String itemsfieldname) {
		this.itemsfieldname = itemsfieldname; 
	}
 
	@Override
	public String getItemsfieldvalue() {
		return this.itemsfieldvalue;
	}
 
	@Override
	public void setItemsfieldvalue(final String itemsfieldvalue) {
		this.itemsfieldvalue = itemsfieldvalue; 
	}
 
	@Override
	public String getItemspageno() {
		return this.itemspageno;
	}
 
	@Override
	public void setItemspageno(final String itemspageno) {
		this.itemspageno = itemspageno; 
	}
 
	@Override
	public String getItemscellno() {
		return this.itemscellno;
	}
 
	@Override
	public void setItemscellno(final String itemscellno) {
		this.itemscellno = itemscellno; 
	}
 
	@Override
	public String getItemspostno() {
		return this.itemspostno;
	}
 
	@Override
	public void setItemspostno(final String itemspostno) {
		this.itemspostno = itemspostno; 
	}
 
	@Override
	public String getItemsqty() {
		return this.itemsqty;
	}
 
	@Override
	public void setItemsqty(final String itemsqty) {
		this.itemsqty = itemsqty; 
	}
 
	@Override
	public String getItemsqtyunit() {
		return this.itemsqtyunit;
	}
 
	@Override
	public void setItemsqtyunit(final String itemsqtyunit) {
		this.itemsqtyunit = itemsqtyunit; 
	}
 
	@Override
	public BigDecimal getItemsweight() {
		return this.itemsweight;
	}
 
	@Override
	public void setItemsweight(final BigDecimal itemsweight) {
		this.itemsweight = itemsweight; 
	}
 
	@Override
	public String getDeclarevalueamt() {
		return this.declarevalueamt;
	}
 
	@Override
	public void setDeclarevalueamt(final String declarevalueamt) {
		this.declarevalueamt = declarevalueamt; 
	}
 
	@Override
	public String getOrigincountry() {
		return this.origincountry;
	}
 
	@Override
	public void setOrigincountry(final String origincountry) {
		this.origincountry = origincountry; 
	}
 
	@Override
	public String getProvincetype() {
		return this.provincetype;
	}
 
	@Override
	public void setProvincetype(final String provincetype) {
		this.provincetype = provincetype; 
	}
 
	@Override
	public String getBoxtype() {
		return this.boxtype;
	}
 
	@Override
	public void setBoxtype(final String boxtype) {
		this.boxtype = boxtype; 
	}
 
	@Override
	public String getDeliverdatetime() {
		return this.deliverdatetime;
	}
 
	@Override
	public void setDeliverdatetime(final String deliverdatetime) {
		this.deliverdatetime = deliverdatetime; 
	}
 
	@Override
	public String getSendername() {
		return this.sendername;
	}
 
	@Override
	public void setSendername(final String sendername) {
		this.sendername = sendername; 
	}
 
	@Override
	public String getSenderaddress() {
		return this.senderaddress;
	}
 
	@Override
	public void setSenderaddress(final String senderaddress) {
		this.senderaddress = senderaddress; 
	}
 
	@Override
	public String getReceivername() {
		return this.receivername;
	}
 
	@Override
	public void setReceivername(final String receivername) {
		this.receivername = receivername; 
	}
 
	@Override
	public String getReceiveraddress() {
		return this.receiveraddress;
	}
 
	@Override
	public void setReceiveraddress(final String receiveraddress) {
		this.receiveraddress = receiveraddress; 
	}
 
	@Override
	public String getGoodsdescription() {
		return this.goodsdescription;
	}
 
	@Override
	public void setGoodsdescription(final String goodsdescription) {
		this.goodsdescription = goodsdescription; 
	}
 
	@Override
	public String getOtherfields() {
		return this.otherfields;
	}
 
	@Override
	public void setOtherfields(final String otherfields) {
		this.otherfields = otherfields; 
	}
 
	@Override
	public String getFilename() {
		return this.filename;
	}
 
	@Override
	public void setFilename(final String filename) {
		this.filename = filename; 
	}
 
}
