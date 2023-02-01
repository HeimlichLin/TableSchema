package com.doc.common.po.impl; 
 
public class HelpPo implements IHelpPo {
 
	public enum COLUMNS {
		TOPIC("null"), //
		SEQ("null"), //
		INFO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String topic;
	private BigDecimal seq;
	private String info;

	@Override
	public String getTopic() {
		return this.topic;
	}
 
	@Override
	public void setTopic(final String topic) {
		this.topic = topic; 
	}
 
	@Override
	public BigDecimal getSeq() {
		return this.seq;
	}
 
	@Override
	public void setSeq(final BigDecimal seq) {
		this.seq = seq; 
	}
 
	@Override
	public String getInfo() {
		return this.info;
	}
 
	@Override
	public void setInfo(final String info) {
		this.info = info; 
	}
 
}
