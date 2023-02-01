package com.doc.common.po.impl; 
 
public class SeqCurrnoPo implements ISeqCurrnoPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		SEQ_NAME("Sequence 名稱"), //
		CURR_NO("目前產生的最後一個單號") //
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
	private String seqName;
	private String currNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getSeqName() {
		return this.seqName;
	}
 
	@Override
	public void setSeqName(final String seqName) {
		this.seqName = seqName; 
	}
 
	@Override
	public String getCurrNo() {
		return this.currNo;
	}
 
	@Override
	public void setCurrNo(final String currNo) {
		this.currNo = currNo; 
	}
 
}
