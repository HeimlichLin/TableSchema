package com.doc.common.po.impl; 
 
public class PackageUnitCodePo implements IPackageUnitCodePo {
 
	public enum COLUMNS {
		PACKAGE_UNIT_CODE("包裝單位代碼"), //
		PACKAGE_UNIT_NAME("包裝單位名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String packageUnitCode;
	private String packageUnitName;

	@Override
	public String getPackageUnitCode() {
		return this.packageUnitCode;
	}
 
	@Override
	public void setPackageUnitCode(final String packageUnitCode) {
		this.packageUnitCode = packageUnitCode; 
	}
 
	@Override
	public String getPackageUnitName() {
		return this.packageUnitName;
	}
 
	@Override
	public void setPackageUnitName(final String packageUnitName) {
		this.packageUnitName = packageUnitName; 
	}
 
}
