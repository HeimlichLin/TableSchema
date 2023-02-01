package com.doc.common.po.impl; 
 
public class Ol$hintsPo implements IOl$hintsPo {
 
	public enum COLUMNS {
		OL_NAME("null"), //
		HINT#("null"), //
		CATEGORY("null"), //
		HINT_TYPE("null"), //
		HINT_TEXT("null"), //
		STAGE#("null"), //
		NODE#("null"), //
		TABLE_NAME("null"), //
		TABLE_TIN("null"), //
		TABLE_POS("null"), //
		REF_ID("null"), //
		USER_TABLE_NAME("null"), //
		COST("null"), //
		CARDINALITY("null"), //
		BYTES("null"), //
		HINT_TEXTOFF("null"), //
		HINT_TEXTLEN("null"), //
		JOIN_PRED("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		HINT_STRING("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String olName;
	private BigDecimal hint#;
	private String category;
	private BigDecimal hintType;
	private String hintText;
	private BigDecimal stage#;
	private BigDecimal node#;
	private String tableName;
	private BigDecimal tableTin;
	private BigDecimal tablePos;
	private BigDecimal refId;
	private String userTableName;
	private String cost;
	private String cardinality;
	private String bytes;
	private BigDecimal hintTextoff;
	private BigDecimal hintTextlen;
	private String joinPred;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String hintString;

	@Override
	public String getOlName() {
		return this.olName;
	}
 
	@Override
	public void setOlName(final String olName) {
		this.olName = olName; 
	}
 
	@Override
	public BigDecimal getHint#() {
		return this.hint#;
	}
 
	@Override
	public void setHint#(final BigDecimal hint#) {
		this.hint# = hint#; 
	}
 
	@Override
	public String getCategory() {
		return this.category;
	}
 
	@Override
	public void setCategory(final String category) {
		this.category = category; 
	}
 
	@Override
	public BigDecimal getHintType() {
		return this.hintType;
	}
 
	@Override
	public void setHintType(final BigDecimal hintType) {
		this.hintType = hintType; 
	}
 
	@Override
	public String getHintText() {
		return this.hintText;
	}
 
	@Override
	public void setHintText(final String hintText) {
		this.hintText = hintText; 
	}
 
	@Override
	public BigDecimal getStage#() {
		return this.stage#;
	}
 
	@Override
	public void setStage#(final BigDecimal stage#) {
		this.stage# = stage#; 
	}
 
	@Override
	public BigDecimal getNode#() {
		return this.node#;
	}
 
	@Override
	public void setNode#(final BigDecimal node#) {
		this.node# = node#; 
	}
 
	@Override
	public String getTableName() {
		return this.tableName;
	}
 
	@Override
	public void setTableName(final String tableName) {
		this.tableName = tableName; 
	}
 
	@Override
	public BigDecimal getTableTin() {
		return this.tableTin;
	}
 
	@Override
	public void setTableTin(final BigDecimal tableTin) {
		this.tableTin = tableTin; 
	}
 
	@Override
	public BigDecimal getTablePos() {
		return this.tablePos;
	}
 
	@Override
	public void setTablePos(final BigDecimal tablePos) {
		this.tablePos = tablePos; 
	}
 
	@Override
	public BigDecimal getRefId() {
		return this.refId;
	}
 
	@Override
	public void setRefId(final BigDecimal refId) {
		this.refId = refId; 
	}
 
	@Override
	public String getUserTableName() {
		return this.userTableName;
	}
 
	@Override
	public void setUserTableName(final String userTableName) {
		this.userTableName = userTableName; 
	}
 
	@Override
	public String getCost() {
		return this.cost;
	}
 
	@Override
	public void setCost(final String cost) {
		this.cost = cost; 
	}
 
	@Override
	public String getCardinality() {
		return this.cardinality;
	}
 
	@Override
	public void setCardinality(final String cardinality) {
		this.cardinality = cardinality; 
	}
 
	@Override
	public String getBytes() {
		return this.bytes;
	}
 
	@Override
	public void setBytes(final String bytes) {
		this.bytes = bytes; 
	}
 
	@Override
	public BigDecimal getHintTextoff() {
		return this.hintTextoff;
	}
 
	@Override
	public void setHintTextoff(final BigDecimal hintTextoff) {
		this.hintTextoff = hintTextoff; 
	}
 
	@Override
	public BigDecimal getHintTextlen() {
		return this.hintTextlen;
	}
 
	@Override
	public void setHintTextlen(final BigDecimal hintTextlen) {
		this.hintTextlen = hintTextlen; 
	}
 
	@Override
	public String getJoinPred() {
		return this.joinPred;
	}
 
	@Override
	public void setJoinPred(final String joinPred) {
		this.joinPred = joinPred; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public String getHintString() {
		return this.hintString;
	}
 
	@Override
	public void setHintString(final String hintString) {
		this.hintString = hintString; 
	}
 
}
