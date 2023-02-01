package com.doc.common.po.impl; 
 
public class AttachInfoPo implements IAttachInfoPo {
 
	public enum COLUMNS {
		TRANS_IDEN_ID("交易識別碼"), //
		ATTACH_TYPE("附件代號(0：全部, 1：CLOB, 2：BLOB)"), //
		ATTACH_CLOB("附件文字資料"), //
		ATTACH_BLOB("附件位元組資料") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transIdenId;
	private String attachType;
	private String attachClob;
	private String attachBlob;

	@Override
	public String getTransIdenId() {
		return this.transIdenId;
	}
 
	@Override
	public void setTransIdenId(final String transIdenId) {
		this.transIdenId = transIdenId; 
	}
 
	@Override
	public String getAttachType() {
		return this.attachType;
	}
 
	@Override
	public void setAttachType(final String attachType) {
		this.attachType = attachType; 
	}
 
	@Override
	public String getAttachClob() {
		return this.attachClob;
	}
 
	@Override
	public void setAttachClob(final String attachClob) {
		this.attachClob = attachClob; 
	}
 
	@Override
	public String getAttachBlob() {
		return this.attachBlob;
	}
 
	@Override
	public void setAttachBlob(final String attachBlob) {
		this.attachBlob = attachBlob; 
	}
 
}
