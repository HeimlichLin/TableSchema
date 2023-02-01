package com.doc.common.po.impl; 
 
public class AbnormalPo implements IAbnormalPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		ABNORMAL_TYPE("異常類別代碼；1：逾二個月未放行報單；2：待確認報單；3：已確認核銷異常報單；4：加工單/檢測單/維修單 未完成；5：委外貨物逾四個月未回自貿港；6：按月彙報保證金異常；7：進倉單位與貨物基本資料不一致；8：進出倉料號單位儲位不一致"), //
		ABNORMAL_NAME("異常類別名稱"), //
		DOC_NO("表單號碼"), //
		DOC_ITEM_NO("表單項次"), //
		DOC_DATE("表單日期"), //
		REMARK("備註"), //
		REF1_NAME("異常說明"), //
		REF1("異常內容"), //
		DATE_TYPE("日期類別") //
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
	private String abnormalType;
	private String abnormalName;
	private String docNo;
	private BigDecimal docItemNo;
	private String docDate;
	private String remark;
	private String ref1Name;
	private String ref1;
	private String dateType;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getAbnormalType() {
		return this.abnormalType;
	}
 
	@Override
	public void setAbnormalType(final String abnormalType) {
		this.abnormalType = abnormalType; 
	}
 
	@Override
	public String getAbnormalName() {
		return this.abnormalName;
	}
 
	@Override
	public void setAbnormalName(final String abnormalName) {
		this.abnormalName = abnormalName; 
	}
 
	@Override
	public String getDocNo() {
		return this.docNo;
	}
 
	@Override
	public void setDocNo(final String docNo) {
		this.docNo = docNo; 
	}
 
	@Override
	public BigDecimal getDocItemNo() {
		return this.docItemNo;
	}
 
	@Override
	public void setDocItemNo(final BigDecimal docItemNo) {
		this.docItemNo = docItemNo; 
	}
 
	@Override
	public String getDocDate() {
		return this.docDate;
	}
 
	@Override
	public void setDocDate(final String docDate) {
		this.docDate = docDate; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public String getRef1Name() {
		return this.ref1Name;
	}
 
	@Override
	public void setRef1Name(final String ref1Name) {
		this.ref1Name = ref1Name; 
	}
 
	@Override
	public String getRef1() {
		return this.ref1;
	}
 
	@Override
	public void setRef1(final String ref1) {
		this.ref1 = ref1; 
	}
 
	@Override
	public String getDateType() {
		return this.dateType;
	}
 
	@Override
	public void setDateType(final String dateType) {
		this.dateType = dateType; 
	}
 
}
