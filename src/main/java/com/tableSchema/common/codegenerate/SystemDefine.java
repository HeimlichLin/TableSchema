package com.tableSchema.common.codegenerate;

public enum SystemDefine {

	FOSP_AP("pfosp/ap/"), //
	FOSP_BK("pfosp/bk/"), //
	FTZC_AP("pftzc/ap/"), //
	FTZC_BK("pftzc/bk/"), //
	CLMS_AP("pclms/ap/"), //
	CLMS_BK("pclms/bk/"), //
	EHU_SACT("ehu/SACT/"), //
	EHU_EGAC("ehu/EGAC/"), //
	EHU_TACT("ehu/TACT/"), //
	EHU_EVERTER("ehu/EVERTER/"), //
	CCPS("ccps/"), //
	PTWCS("ptwcs/"), //
	ABS("abs/"), //
	;

	final String configFile;
	final static String CONFIG_FILE_DEFINE = "config.properties";

	private SystemDefine(String parent) {
		this.configFile = parent + CONFIG_FILE_DEFINE;
	}

	public String getConfigFile() {
		return this.configFile;
	}

}
