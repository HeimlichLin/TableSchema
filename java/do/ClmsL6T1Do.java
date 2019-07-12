package com.doc.common.bean; 
 
public class ClmsL6T1Do { 
 
	public enum COLUMNS { 
		BONDNO("海關監管編號"), 
		REF_BILL_NO("參考單號"), 
		ITEM("參考項次"), 
		OIL_POST("原有儲位"), 
		NEW_POST("異動儲位"), 
		QTY("數量"), 
		CONFIRM_DATE("確認日期"), 
		CONTROL_NO("檔案"), 
		VERSION("版本"), 
		SEQ_NO("序號"), 
		I_CONFIRMED("是否完成(Y:完成；N:待執行；E:超過7日無進倉)") 
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
	private String refBillNo; 
	private BigDecimal item; 
	private String oilPost; 
	private String newPost; 
	private BigDecimal qty; 
	private String confirmDate; 
	private String controlNo; 
	private BigDecimal version; 
	private BigDecimal seqNo; 
	private String iConfirmed; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getRefBillNo() { 
		return refBillNo; 
	} 
 
	public void setRefBillNo(String refBillNo) { 
		this.refBillNo = refBillNo; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getOilPost() { 
		return oilPost; 
	} 
 
	public void setOilPost(String oilPost) { 
		this.oilPost = oilPost; 
	} 
 
	public String getNewPost() { 
		return newPost; 
	} 
 
	public void setNewPost(String newPost) { 
		this.newPost = newPost; 
	} 
 
	public BigDecimal getQty() { 
		return qty; 
	} 
 
	public void setQty(BigDecimal qty) { 
		this.qty = qty; 
	} 
 
	public String getConfirmDate() { 
		return confirmDate; 
	} 
 
	public void setConfirmDate(String confirmDate) { 
		this.confirmDate = confirmDate; 
	} 
 
	public String getControlNo() { 
		return controlNo; 
	} 
 
	public void setControlNo(String controlNo) { 
		this.controlNo = controlNo; 
	} 
 
	public BigDecimal getVersion() { 
		return version; 
	} 
 
	public void setVersion(BigDecimal version) { 
		this.version = version; 
	} 
 
	public BigDecimal getSeqNo() { 
		return seqNo; 
	} 
 
	public void setSeqNo(BigDecimal seqNo) { 
		this.seqNo = seqNo; 
	} 
 
	public String getIConfirmed() { 
		return iConfirmed; 
	} 
 
	public void setIConfirmed(String iConfirmed) { 
		this.iConfirmed = iConfirmed; 
	} 
 
} 
