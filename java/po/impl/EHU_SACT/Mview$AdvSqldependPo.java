package com.doc.common.po.impl; 
 
public class Mview$AdvSqldependPo implements IMview$AdvSqldependPo {
 
	public enum COLUMNS {
		COLLECTIONID#("null"), //
		INST_ID("null"), //
		FROM_ADDRESS("null"), //
		FROM_HASH("null"), //
		TO_OWNER("null"), //
		TO_NAME("null"), //
		TO_TYPE("null"), //
		CARDINALITY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal collectionid#;
	private BigDecimal instId;
	private String fromAddress;
	private BigDecimal fromHash;
	private String toOwner;
	private String toName;
	private BigDecimal toType;
	private BigDecimal cardinality;

	@Override
	public BigDecimal getCollectionid#() {
		return this.collectionid#;
	}
 
	@Override
	public void setCollectionid#(final BigDecimal collectionid#) {
		this.collectionid# = collectionid#; 
	}
 
	@Override
	public BigDecimal getInstId() {
		return this.instId;
	}
 
	@Override
	public void setInstId(final BigDecimal instId) {
		this.instId = instId; 
	}
 
	@Override
	public String getFromAddress() {
		return this.fromAddress;
	}
 
	@Override
	public void setFromAddress(final String fromAddress) {
		this.fromAddress = fromAddress; 
	}
 
	@Override
	public BigDecimal getFromHash() {
		return this.fromHash;
	}
 
	@Override
	public void setFromHash(final BigDecimal fromHash) {
		this.fromHash = fromHash; 
	}
 
	@Override
	public String getToOwner() {
		return this.toOwner;
	}
 
	@Override
	public void setToOwner(final String toOwner) {
		this.toOwner = toOwner; 
	}
 
	@Override
	public String getToName() {
		return this.toName;
	}
 
	@Override
	public void setToName(final String toName) {
		this.toName = toName; 
	}
 
	@Override
	public BigDecimal getToType() {
		return this.toType;
	}
 
	@Override
	public void setToType(final BigDecimal toType) {
		this.toType = toType; 
	}
 
	@Override
	public BigDecimal getCardinality() {
		return this.cardinality;
	}
 
	@Override
	public void setCardinality(final BigDecimal cardinality) {
		this.cardinality = cardinality; 
	}
 
}
