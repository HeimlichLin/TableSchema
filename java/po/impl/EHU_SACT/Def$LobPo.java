package com.doc.common.po.impl; 
 
public class Def$LobPo implements IDef$LobPo {
 
	public enum COLUMNS {
		ID("Identifier of LOB parameter"), //
		ENQ_TID("Transaction identifier for deferred RPC with this LOB parameter"), //
		BLOB_COL("Binary LOB parameter"), //
		CLOB_COL("Character LOB parameter"), //
		NCLOB_COL("National Character LOB parameter") //
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
	private String enqTid;
	private String blobCol;
	private String clobCol;
	private String nclobCol;

	@Override
	public String getId() {
		return this.id;
	}
 
	@Override
	public void setId(final String id) {
		this.id = id; 
	}
 
	@Override
	public String getEnqTid() {
		return this.enqTid;
	}
 
	@Override
	public void setEnqTid(final String enqTid) {
		this.enqTid = enqTid; 
	}
 
	@Override
	public String getBlobCol() {
		return this.blobCol;
	}
 
	@Override
	public void setBlobCol(final String blobCol) {
		this.blobCol = blobCol; 
	}
 
	@Override
	public String getClobCol() {
		return this.clobCol;
	}
 
	@Override
	public void setClobCol(final String clobCol) {
		this.clobCol = clobCol; 
	}
 
	@Override
	public String getNclobCol() {
		return this.nclobCol;
	}
 
	@Override
	public void setNclobCol(final String nclobCol) {
		this.nclobCol = nclobCol; 
	}
 
}
