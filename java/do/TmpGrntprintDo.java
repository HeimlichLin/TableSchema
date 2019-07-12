package com.doc.common.bean; 
 
public class TmpGrntprintDo { 
 
	public enum COLUMNS { 
		SESSIONID("null"), 
		BONDNO("null"), 
		RECORDNO("null"), 
		STRDATE("null"), 
		STRQTY("null"), 
		DECLQTY("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		PRDTNO("null"), 
		INTAXAMT("null"), 
		OUTAXAMT("null"), 
		AVLAMT("null"), 
		DUTYRATE222("null"), 
		COMDTAXRATE222("null"), 
		VATAXAMT("null"), 
		DECLTYPE("null"), 
		CCCCODE("null"), 
		STRPOST("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String sessionid; 
	private String bondno; 
	private BigDecimal recordno; 
	private String strdate; 
	private BigDecimal strqty; 
	private BigDecimal declqty; 
	private String declno; 
	private BigDecimal itemno; 
	private String prdtno; 
	private BigDecimal intaxamt; 
	private BigDecimal outaxamt; 
	private BigDecimal avlamt; 
	private BigDecimal dutyrate222; 
	private BigDecimal comdtaxrate222; 
	private BigDecimal vataxamt; 
	private String decltype; 
	private String ccccode; 
	private String strpost; 
	
	public String getSessionid() { 
		return sessionid; 
	} 
 
	public void setSessionid(String sessionid) { 
		this.sessionid = sessionid; 
	} 
 
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public BigDecimal getRecordno() { 
		return recordno; 
	} 
 
	public void setRecordno(BigDecimal recordno) { 
		this.recordno = recordno; 
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
 
	public BigDecimal getDeclqty() { 
		return declqty; 
	} 
 
	public void setDeclqty(BigDecimal declqty) { 
		this.declqty = declqty; 
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
 
	public BigDecimal getIntaxamt() { 
		return intaxamt; 
	} 
 
	public void setIntaxamt(BigDecimal intaxamt) { 
		this.intaxamt = intaxamt; 
	} 
 
	public BigDecimal getOutaxamt() { 
		return outaxamt; 
	} 
 
	public void setOutaxamt(BigDecimal outaxamt) { 
		this.outaxamt = outaxamt; 
	} 
 
	public BigDecimal getAvlamt() { 
		return avlamt; 
	} 
 
	public void setAvlamt(BigDecimal avlamt) { 
		this.avlamt = avlamt; 
	} 
 
	public BigDecimal getDutyrate222() { 
		return dutyrate222; 
	} 
 
	public void setDutyrate222(BigDecimal dutyrate222) { 
		this.dutyrate222 = dutyrate222; 
	} 
 
	public BigDecimal getComdtaxrate222() { 
		return comdtaxrate222; 
	} 
 
	public void setComdtaxrate222(BigDecimal comdtaxrate222) { 
		this.comdtaxrate222 = comdtaxrate222; 
	} 
 
	public BigDecimal getVataxamt() { 
		return vataxamt; 
	} 
 
	public void setVataxamt(BigDecimal vataxamt) { 
		this.vataxamt = vataxamt; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
	} 
 
} 
