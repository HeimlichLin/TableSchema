package com.doc.common.po.impl; 
 
public class Def$PushedTransactionsPo implements IDef$PushedTransactionsPo {
 
	public enum COLUMNS {
		SOURCE_SITE_ID("Originating database identifier for the deferred transaction"), //
		LAST_TRAN_ID("Last committed transaction"), //
		DISABLED("Disable propagation"), //
		SOURCE_SITE("Obsolete - do not use") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sourceSiteId;
	private BigDecimal lastTranId;
	private String disabled;
	private String sourceSite;

	@Override
	public BigDecimal getSourceSiteId() {
		return this.sourceSiteId;
	}
 
	@Override
	public void setSourceSiteId(final BigDecimal sourceSiteId) {
		this.sourceSiteId = sourceSiteId; 
	}
 
	@Override
	public BigDecimal getLastTranId() {
		return this.lastTranId;
	}
 
	@Override
	public void setLastTranId(final BigDecimal lastTranId) {
		this.lastTranId = lastTranId; 
	}
 
	@Override
	public String getDisabled() {
		return this.disabled;
	}
 
	@Override
	public void setDisabled(final String disabled) {
		this.disabled = disabled; 
	}
 
	@Override
	public String getSourceSite() {
		return this.sourceSite;
	}
 
	@Override
	public void setSourceSite(final String sourceSite) {
		this.sourceSite = sourceSite; 
	}
 
}
