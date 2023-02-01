package com.doc.common.po.impl; 
 
public class Repcat$ExtensionPo implements IRepcat$ExtensionPo {
 
	public enum COLUMNS {
		EXTENSION_ID("Globally unique identifier for replication extension"), //
		EXTENSION_CODE("Kind of replication extension"), //
		MASTERDEF("Master definition site for replication extension"), //
		EXPORT_REQUIRED("YES if this extension requires an export, and NO if no export is required"), //
		REPCATLOG_ID("Identifier of repcatlog records related to replication extension"), //
		EXTENSION_STATUS("Status of replication extension"), //
		FLASHBACK_SCN("Flashback_scn for export or change-based recovery for replication extension"), //
		PUSH_TO_MDEF("YES if existing masters partially push to masterdef, NO if no pushing"), //
		PUSH_TO_NEW("YES if existing masters partially push to new masters, NO if no pushing"), //
		PERCENTAGE_FOR_CATCHUP_MDEF("Fraction of push to masterdef cycle devoted to catching up"), //
		CYCLE_SECONDS_MDEF("Length of push to masterdef cycle when catching up"), //
		PERCENTAGE_FOR_CATCHUP_NEW("Fraction of push to new masters cycle devoted to catching up"), //
		CYCLE_SECONDS_NEW("Length of push to new masters cycle when catching up") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String extensionId;
	private BigDecimal extensionCode;
	private String masterdef;
	private String exportRequired;
	private BigDecimal repcatlogId;
	private BigDecimal extensionStatus;
	private BigDecimal flashbackScn;
	private String pushToMdef;
	private String pushToNew;
	private BigDecimal percentageForCatchupMdef;
	private BigDecimal cycleSecondsMdef;
	private BigDecimal percentageForCatchupNew;
	private BigDecimal cycleSecondsNew;

	@Override
	public String getExtensionId() {
		return this.extensionId;
	}
 
	@Override
	public void setExtensionId(final String extensionId) {
		this.extensionId = extensionId; 
	}
 
	@Override
	public BigDecimal getExtensionCode() {
		return this.extensionCode;
	}
 
	@Override
	public void setExtensionCode(final BigDecimal extensionCode) {
		this.extensionCode = extensionCode; 
	}
 
	@Override
	public String getMasterdef() {
		return this.masterdef;
	}
 
	@Override
	public void setMasterdef(final String masterdef) {
		this.masterdef = masterdef; 
	}
 
	@Override
	public String getExportRequired() {
		return this.exportRequired;
	}
 
	@Override
	public void setExportRequired(final String exportRequired) {
		this.exportRequired = exportRequired; 
	}
 
	@Override
	public BigDecimal getRepcatlogId() {
		return this.repcatlogId;
	}
 
	@Override
	public void setRepcatlogId(final BigDecimal repcatlogId) {
		this.repcatlogId = repcatlogId; 
	}
 
	@Override
	public BigDecimal getExtensionStatus() {
		return this.extensionStatus;
	}
 
	@Override
	public void setExtensionStatus(final BigDecimal extensionStatus) {
		this.extensionStatus = extensionStatus; 
	}
 
	@Override
	public BigDecimal getFlashbackScn() {
		return this.flashbackScn;
	}
 
	@Override
	public void setFlashbackScn(final BigDecimal flashbackScn) {
		this.flashbackScn = flashbackScn; 
	}
 
	@Override
	public String getPushToMdef() {
		return this.pushToMdef;
	}
 
	@Override
	public void setPushToMdef(final String pushToMdef) {
		this.pushToMdef = pushToMdef; 
	}
 
	@Override
	public String getPushToNew() {
		return this.pushToNew;
	}
 
	@Override
	public void setPushToNew(final String pushToNew) {
		this.pushToNew = pushToNew; 
	}
 
	@Override
	public BigDecimal getPercentageForCatchupMdef() {
		return this.percentageForCatchupMdef;
	}
 
	@Override
	public void setPercentageForCatchupMdef(final BigDecimal percentageForCatchupMdef) {
		this.percentageForCatchupMdef = percentageForCatchupMdef; 
	}
 
	@Override
	public BigDecimal getCycleSecondsMdef() {
		return this.cycleSecondsMdef;
	}
 
	@Override
	public void setCycleSecondsMdef(final BigDecimal cycleSecondsMdef) {
		this.cycleSecondsMdef = cycleSecondsMdef; 
	}
 
	@Override
	public BigDecimal getPercentageForCatchupNew() {
		return this.percentageForCatchupNew;
	}
 
	@Override
	public void setPercentageForCatchupNew(final BigDecimal percentageForCatchupNew) {
		this.percentageForCatchupNew = percentageForCatchupNew; 
	}
 
	@Override
	public BigDecimal getCycleSecondsNew() {
		return this.cycleSecondsNew;
	}
 
	@Override
	public void setCycleSecondsNew(final BigDecimal cycleSecondsNew) {
		this.cycleSecondsNew = cycleSecondsNew; 
	}
 
}
