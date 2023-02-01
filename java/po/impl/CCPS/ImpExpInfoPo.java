package com.doc.common.po.impl; 
 
public class ImpExpInfoPo implements IImpExpInfoPo {
 
	public enum COLUMNS {
		ID("null"), //
		CTRL_NODE("null"), //
		IC_NO("null"), //
		IC_PHOTO("null"), //
		SCHED_IN_DATA_TIME("null"), //
		SCHED_OUT_DATA_TIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String id;
	private String ctrlNode;
	private String icNo;
	private String icPhoto;
	private String schedInDataTime;
	private String schedOutDataTime;

	@Override
	public String getId() {
		return this.id;
	}
 
	@Override
	public void setId(final String id) {
		this.id = id; 
	}
 
	@Override
	public String getCtrlNode() {
		return this.ctrlNode;
	}
 
	@Override
	public void setCtrlNode(final String ctrlNode) {
		this.ctrlNode = ctrlNode; 
	}
 
	@Override
	public String getIcNo() {
		return this.icNo;
	}
 
	@Override
	public void setIcNo(final String icNo) {
		this.icNo = icNo; 
	}
 
	@Override
	public String getIcPhoto() {
		return this.icPhoto;
	}
 
	@Override
	public void setIcPhoto(final String icPhoto) {
		this.icPhoto = icPhoto; 
	}
 
	@Override
	public String getSchedInDataTime() {
		return this.schedInDataTime;
	}
 
	@Override
	public void setSchedInDataTime(final String schedInDataTime) {
		this.schedInDataTime = schedInDataTime; 
	}
 
	@Override
	public String getSchedOutDataTime() {
		return this.schedOutDataTime;
	}
 
	@Override
	public void setSchedOutDataTime(final String schedOutDataTime) {
		this.schedOutDataTime = schedOutDataTime; 
	}
 
}
