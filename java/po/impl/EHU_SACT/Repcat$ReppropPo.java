package com.doc.common.po.impl; 
 
public class Repcat$ReppropPo implements IRepcat$ReppropPo {
 
	public enum COLUMNS {
		SNAME("Name of the object owner"), //
		ONAME("Name of the object"), //
		TYPE("Type of the object"), //
		DBLINK("Destination database for propagation"), //
		HOW("Propagation choice for the destination database"), //
		PROPAGATE_COMMENT("Description of the propagation choice"), //
		DELIVERY_ORDER("Value of delivery order when the master was added"), //
		RECIPIENT_KEY("Recipient key for sname and oname, used in joining with def$_aqcall"), //
		EXTENSION_ID("Identifier of any active extension request") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private BigDecimal type;
	private String dblink;
	private BigDecimal how;
	private String propagateComment;
	private BigDecimal deliveryOrder;
	private BigDecimal recipientKey;
	private String extensionId;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
	}
 
	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public BigDecimal getHow() {
		return this.how;
	}
 
	@Override
	public void setHow(final BigDecimal how) {
		this.how = how; 
	}
 
	@Override
	public String getPropagateComment() {
		return this.propagateComment;
	}
 
	@Override
	public void setPropagateComment(final String propagateComment) {
		this.propagateComment = propagateComment; 
	}
 
	@Override
	public BigDecimal getDeliveryOrder() {
		return this.deliveryOrder;
	}
 
	@Override
	public void setDeliveryOrder(final BigDecimal deliveryOrder) {
		this.deliveryOrder = deliveryOrder; 
	}
 
	@Override
	public BigDecimal getRecipientKey() {
		return this.recipientKey;
	}
 
	@Override
	public void setRecipientKey(final BigDecimal recipientKey) {
		this.recipientKey = recipientKey; 
	}
 
	@Override
	public String getExtensionId() {
		return this.extensionId;
	}
 
	@Override
	public void setExtensionId(final String extensionId) {
		this.extensionId = extensionId; 
	}
 
}
