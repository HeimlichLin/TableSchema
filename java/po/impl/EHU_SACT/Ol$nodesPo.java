package com.doc.common.po.impl; 
 
public class Ol$nodesPo implements IOl$nodesPo {
 
	public enum COLUMNS {
		OL_NAME("null"), //
		CATEGORY("null"), //
		NODE_ID("null"), //
		PARENT_ID("null"), //
		NODE_TYPE("null"), //
		NODE_TEXTLEN("null"), //
		NODE_TEXTOFF("null"), //
		NODE_NAME("null") //
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
	private String category;
	private BigDecimal nodeId;
	private BigDecimal parentId;
	private BigDecimal nodeType;
	private BigDecimal nodeTextlen;
	private BigDecimal nodeTextoff;
	private String nodeName;

	@Override
	public String getOlName() {
		return this.olName;
	}
 
	@Override
	public void setOlName(final String olName) {
		this.olName = olName; 
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
	public BigDecimal getNodeId() {
		return this.nodeId;
	}
 
	@Override
	public void setNodeId(final BigDecimal nodeId) {
		this.nodeId = nodeId; 
	}
 
	@Override
	public BigDecimal getParentId() {
		return this.parentId;
	}
 
	@Override
	public void setParentId(final BigDecimal parentId) {
		this.parentId = parentId; 
	}
 
	@Override
	public BigDecimal getNodeType() {
		return this.nodeType;
	}
 
	@Override
	public void setNodeType(final BigDecimal nodeType) {
		this.nodeType = nodeType; 
	}
 
	@Override
	public BigDecimal getNodeTextlen() {
		return this.nodeTextlen;
	}
 
	@Override
	public void setNodeTextlen(final BigDecimal nodeTextlen) {
		this.nodeTextlen = nodeTextlen; 
	}
 
	@Override
	public BigDecimal getNodeTextoff() {
		return this.nodeTextoff;
	}
 
	@Override
	public void setNodeTextoff(final BigDecimal nodeTextoff) {
		this.nodeTextoff = nodeTextoff; 
	}
 
	@Override
	public String getNodeName() {
		return this.nodeName;
	}
 
	@Override
	public void setNodeName(final String nodeName) {
		this.nodeName = nodeName; 
	}
 
}
