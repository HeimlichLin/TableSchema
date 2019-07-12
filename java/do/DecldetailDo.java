package com.doc.common.bean; 
 
public class DecldetailDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		DECLNO("報單號碼"), 
		ITEMNO("項次"), 
		PRDTNO("料號"), 
		DESCRIP("貨名"), 
		BRAND("廠牌"), 
		MODEL("型號"), 
		SPEC("規格"), 
		QTY("數量"), 
		UNIT("單位"), 
		UPRICE("單價"), 
		CUR("幣別"), 
		VALUEAMT("完稅價格"), 
		VALUEQTY("完稅數量"), 
		DUTYRATE("進口稅率"), 
		UNITDUTY("單位稅額"), 
		ODECLNO("原報單號碼"), 
		OITEMNO("原報單項次"), 
		CCCCODE("商品分類號列"), 
		COMDTAXRATE("貨物稅率"), 
		STRTYPE("進出倉別"), 
		DUTYTYPE("納辦"), 
		STATMODE("統計方式"), 
		MSGTYPE("EDI訊息別"), 
		D8DATE("原進倉日期"), 
		PRODCOUNTRY("產地"), 
		D8DECLNO("D8報單號碼"), 
		NWGHT("淨重") 
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
	private String declno; 
	private BigDecimal itemno; 
	private String prdtno; 
	private String descrip; 
	private String brand; 
	private String model; 
	private String spec; 
	private BigDecimal qty; 
	private String unit; 
	private BigDecimal uprice; 
	private String cur; 
	private BigDecimal valueamt; 
	private BigDecimal valueqty; 
	private BigDecimal dutyrate; 
	private BigDecimal unitduty; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String ccccode; 
	private BigDecimal comdtaxrate; 
	private String strtype; 
	private String dutytype; 
	private String statmode; 
	private String msgtype; 
	private String d8date; 
	private String prodcountry; 
	private String d8declno; 
	private BigDecimal nwght; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
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
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public String getBrand() { 
		return brand; 
	} 
 
	public void setBrand(String brand) { 
		this.brand = brand; 
	} 
 
	public String getModel() { 
		return model; 
	} 
 
	public void setModel(String model) { 
		this.model = model; 
	} 
 
	public String getSpec() { 
		return spec; 
	} 
 
	public void setSpec(String spec) { 
		this.spec = spec; 
	} 
 
	public BigDecimal getQty() { 
		return qty; 
	} 
 
	public void setQty(BigDecimal qty) { 
		this.qty = qty; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public BigDecimal getUprice() { 
		return uprice; 
	} 
 
	public void setUprice(BigDecimal uprice) { 
		this.uprice = uprice; 
	} 
 
	public String getCur() { 
		return cur; 
	} 
 
	public void setCur(String cur) { 
		this.cur = cur; 
	} 
 
	public BigDecimal getValueamt() { 
		return valueamt; 
	} 
 
	public void setValueamt(BigDecimal valueamt) { 
		this.valueamt = valueamt; 
	} 
 
	public BigDecimal getValueqty() { 
		return valueqty; 
	} 
 
	public void setValueqty(BigDecimal valueqty) { 
		this.valueqty = valueqty; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public BigDecimal getUnitduty() { 
		return unitduty; 
	} 
 
	public void setUnitduty(BigDecimal unitduty) { 
		this.unitduty = unitduty; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public BigDecimal getComdtaxrate() { 
		return comdtaxrate; 
	} 
 
	public void setComdtaxrate(BigDecimal comdtaxrate) { 
		this.comdtaxrate = comdtaxrate; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getDutytype() { 
		return dutytype; 
	} 
 
	public void setDutytype(String dutytype) { 
		this.dutytype = dutytype; 
	} 
 
	public String getStatmode() { 
		return statmode; 
	} 
 
	public void setStatmode(String statmode) { 
		this.statmode = statmode; 
	} 
 
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
	public String getD8date() { 
		return d8date; 
	} 
 
	public void setD8date(String d8date) { 
		this.d8date = d8date; 
	} 
 
	public String getProdcountry() { 
		return prodcountry; 
	} 
 
	public void setProdcountry(String prodcountry) { 
		this.prodcountry = prodcountry; 
	} 
 
	public String getD8declno() { 
		return d8declno; 
	} 
 
	public void setD8declno(String d8declno) { 
		this.d8declno = d8declno; 
	} 
 
	public BigDecimal getNwght() { 
		return nwght; 
	} 
 
	public void setNwght(BigDecimal nwght) { 
		this.nwght = nwght; 
	} 
 
} 
