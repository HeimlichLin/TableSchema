package com.tableSchema.common.codegenerate;

public enum DBsetting {

	DRIVER_CLASS_NAME("jdbc.driverClassName"), //
	URL("jdbc.url"), //
	USERNAME("jdbc.username"), //
	PASSWORD("jdbc.password"), //
	OWNER("jdbc.owner"), //
	;

	final String name;
	final String code;

	private DBsetting(String code) {
		this.name = this.name();
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public String toText() {
		return this.code;
	}

}
