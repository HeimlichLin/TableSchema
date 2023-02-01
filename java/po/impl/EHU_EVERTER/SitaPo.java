package com.doc.common.po.impl; 
 
public class SitaPo implements ISitaPo {
 
	public enum COLUMNS {
		SITA_AWB_NO("null"), //
		SITA_CODE("null"), //
		SITA_CREATE_STAMP("null"), //
		SITA_FSU_VERSION("null"), //
		SITA_DES_ADDRESS_01("null"), //
		SITA_DES_ADDRESS_02("null"), //
		SITA_DES_ADDRESS_03("null"), //
		SITA_DES_ADDRESS_04("null"), //
		SITA_DES_ADDRESS_05("null"), //
		SITA_DES_ADDRESS_06("null"), //
		SITA_TEXT_A("null"), //
		SITA_TEXT_B("null"), //
		SITA_TEXT_C("null"), //
		SITA_PROCESS_STAMP("null"), //
		SITA_PROCESS_FLAG("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sitaAwbNo;
	private String sitaCode;
	private String sitaCreateStamp;
	private String sitaFsuVersion;
	private String sitaDesAddress01;
	private String sitaDesAddress02;
	private String sitaDesAddress03;
	private String sitaDesAddress04;
	private String sitaDesAddress05;
	private String sitaDesAddress06;
	private String sitaTextA;
	private String sitaTextB;
	private String sitaTextC;
	private String sitaProcessStamp;
	private String sitaProcessFlag;

	@Override
	public String getSitaAwbNo() {
		return this.sitaAwbNo;
	}
 
	@Override
	public void setSitaAwbNo(final String sitaAwbNo) {
		this.sitaAwbNo = sitaAwbNo; 
	}
 
	@Override
	public String getSitaCode() {
		return this.sitaCode;
	}
 
	@Override
	public void setSitaCode(final String sitaCode) {
		this.sitaCode = sitaCode; 
	}
 
	@Override
	public String getSitaCreateStamp() {
		return this.sitaCreateStamp;
	}
 
	@Override
	public void setSitaCreateStamp(final String sitaCreateStamp) {
		this.sitaCreateStamp = sitaCreateStamp; 
	}
 
	@Override
	public String getSitaFsuVersion() {
		return this.sitaFsuVersion;
	}
 
	@Override
	public void setSitaFsuVersion(final String sitaFsuVersion) {
		this.sitaFsuVersion = sitaFsuVersion; 
	}
 
	@Override
	public String getSitaDesAddress01() {
		return this.sitaDesAddress01;
	}
 
	@Override
	public void setSitaDesAddress01(final String sitaDesAddress01) {
		this.sitaDesAddress01 = sitaDesAddress01; 
	}
 
	@Override
	public String getSitaDesAddress02() {
		return this.sitaDesAddress02;
	}
 
	@Override
	public void setSitaDesAddress02(final String sitaDesAddress02) {
		this.sitaDesAddress02 = sitaDesAddress02; 
	}
 
	@Override
	public String getSitaDesAddress03() {
		return this.sitaDesAddress03;
	}
 
	@Override
	public void setSitaDesAddress03(final String sitaDesAddress03) {
		this.sitaDesAddress03 = sitaDesAddress03; 
	}
 
	@Override
	public String getSitaDesAddress04() {
		return this.sitaDesAddress04;
	}
 
	@Override
	public void setSitaDesAddress04(final String sitaDesAddress04) {
		this.sitaDesAddress04 = sitaDesAddress04; 
	}
 
	@Override
	public String getSitaDesAddress05() {
		return this.sitaDesAddress05;
	}
 
	@Override
	public void setSitaDesAddress05(final String sitaDesAddress05) {
		this.sitaDesAddress05 = sitaDesAddress05; 
	}
 
	@Override
	public String getSitaDesAddress06() {
		return this.sitaDesAddress06;
	}
 
	@Override
	public void setSitaDesAddress06(final String sitaDesAddress06) {
		this.sitaDesAddress06 = sitaDesAddress06; 
	}
 
	@Override
	public String getSitaTextA() {
		return this.sitaTextA;
	}
 
	@Override
	public void setSitaTextA(final String sitaTextA) {
		this.sitaTextA = sitaTextA; 
	}
 
	@Override
	public String getSitaTextB() {
		return this.sitaTextB;
	}
 
	@Override
	public void setSitaTextB(final String sitaTextB) {
		this.sitaTextB = sitaTextB; 
	}
 
	@Override
	public String getSitaTextC() {
		return this.sitaTextC;
	}
 
	@Override
	public void setSitaTextC(final String sitaTextC) {
		this.sitaTextC = sitaTextC; 
	}
 
	@Override
	public String getSitaProcessStamp() {
		return this.sitaProcessStamp;
	}
 
	@Override
	public void setSitaProcessStamp(final String sitaProcessStamp) {
		this.sitaProcessStamp = sitaProcessStamp; 
	}
 
	@Override
	public String getSitaProcessFlag() {
		return this.sitaProcessFlag;
	}
 
	@Override
	public void setSitaProcessFlag(final String sitaProcessFlag) {
		this.sitaProcessFlag = sitaProcessFlag; 
	}
 
}
