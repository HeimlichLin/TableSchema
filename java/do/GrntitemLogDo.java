package com.doc.common.bean; 
 
public class GrntitemLogDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		REFBILLNO("參考單號"), 
		DECLNO("報單號碼"), 
		ITEMNO("報單項次"), 
		STRPOST("儲位"), 
		DECLTYPE("報單類別"), 
		STRTYPE("進出倉別"), 
		STRDATE("進出倉日期"), 
		STRQTY("進出倉數量"), 
		VALUEAMT("完稅價格"), 
		DUTYRATE("進口稅率"), 
		AVLGRNTAMT("保證金平均"), 
		ODECLNO("原報單號碼"), 
		PRDTNO("料號"), 
		SERIALNO("序號"), 
		RMKS("備註"), 
		COMDTAXRATE("貨物稅率"), 
		VATAXRATE("營業稅率"), 
		DECLQTY("報單數量"), 
		TAXAMT("稅金總額"), 
		ISEVAL("核算否"), 
		OITEMNO("原報單項次"), 
		CCCCODE("商品分類號列"), 
		ITEM("項次"), 
		MOITEMNO("暫存原進倉項次"), 
		PROCESSTIME("異動時間"), 
		PROCESSSTATE("異動類別") 
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
	private String declno; 
	private BigDecimal itemno; 
	private String strpost; 
	private String decltype; 
	private String strtype; 
	private String strdate; 
	private BigDecimal strqty; 
	private BigDecimal valueamt; 
	private BigDecimal dutyrate; 
	private BigDecimal avlgrntamt; 
	private String odeclno; 
	private String prdtno; 
	private String serialno; 
	private String rmks; 
	private BigDecimal comdtaxrate; 
	private BigDecimal vataxrate; 
	private BigDecimal declqty; 
	private BigDecimal taxamt; 
	private String iseval; 
	private BigDecimal oitemno; 
	private String ccccode; 
	private BigDecimal item; 
	private BigDecimal moitemno; 
	private String processtime; 
	private String processstate; 
	
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
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getStrdate() { 
		return strdate; 
	} 
 
	public void setStrdate(String strdate) { 
		this.strdate = strdate; 
	} 
 
	public BigDecimal getStrqty() { 
		return strqty; 
	} 
 
	public void setStrqty(BigDecimal strqty) { 
		this.strqty = strqty; 
	} 
 
	public BigDecimal getValueamt() { 
		return valueamt; 
	} 
 
	public void setValueamt(BigDecimal valueamt) { 
		this.valueamt = valueamt; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public BigDecimal getAvlgrntamt() { 
		return avlgrntamt; 
	} 
 
	public void setAvlgrntamt(BigDecimal avlgrntamt) { 
		this.avlgrntamt = avlgrntamt; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getSerialno() { 
		return serialno; 
	} 
 
	public void setSerialno(String serialno) { 
		this.serialno = serialno; 
	} 
 
	public String getRmks() { 
		return rmks; 
	} 
 
	public void setRmks(String rmks) { 
		this.rmks = rmks; 
	} 
 
	public BigDecimal getComdtaxrate() { 
		return comdtaxrate; 
	} 
 
	public void setComdtaxrate(BigDecimal comdtaxrate) { 
		this.comdtaxrate = comdtaxrate; 
	} 
 
	public BigDecimal getVataxrate() { 
		return vataxrate; 
	} 
 
	public void setVataxrate(BigDecimal vataxrate) { 
		this.vataxrate = vataxrate; 
	} 
 
	public BigDecimal getDeclqty() { 
		return declqty; 
	} 
 
	public void setDeclqty(BigDecimal declqty) { 
		this.declqty = declqty; 
	} 
 
	public BigDecimal getTaxamt() { 
		return taxamt; 
	} 
 
	public void setTaxamt(BigDecimal taxamt) { 
		this.taxamt = taxamt; 
	} 
 
	public String getIseval() { 
		return iseval; 
	} 
 
	public void setIseval(String iseval) { 
		this.iseval = iseval; 
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
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public BigDecimal getMoitemno() { 
		return moitemno; 
	} 
 
	public void setMoitemno(BigDecimal moitemno) { 
		this.moitemno = moitemno; 
	} 
 
	public String getProcesstime() { 
		return processtime; 
	} 
 
	public void setProcesstime(String processtime) { 
		this.processtime = processtime; 
	} 
 
	public String getProcessstate() { 
		return processstate; 
	} 
 
	public void setProcessstate(String processstate) { 
		this.processstate = processstate; 
	} 
 
} 
