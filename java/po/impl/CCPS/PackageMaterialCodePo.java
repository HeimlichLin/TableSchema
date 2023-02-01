package com.doc.common.po.impl; 
 
public class PackageMaterialCodePo implements IPackageMaterialCodePo {
 
	public enum COLUMNS {
		PACKAGE_MATERIAL_CODE("包裝容器材質代碼"), //
		PACKAGE_MATERIAL_NAME("包裝容器材質名稱"), //
		PACKAGE_MATERIAL_DESCRIPTION("包裝容器材質說明") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String packageMaterialCode;
	private String packageMaterialName;
	private String packageMaterialDescription;

	@Override
	public String getPackageMaterialCode() {
		return this.packageMaterialCode;
	}
 
	@Override
	public void setPackageMaterialCode(final String packageMaterialCode) {
		this.packageMaterialCode = packageMaterialCode; 
	}
 
	@Override
	public String getPackageMaterialName() {
		return this.packageMaterialName;
	}
 
	@Override
	public void setPackageMaterialName(final String packageMaterialName) {
		this.packageMaterialName = packageMaterialName; 
	}
 
	@Override
	public String getPackageMaterialDescription() {
		return this.packageMaterialDescription;
	}
 
	@Override
	public void setPackageMaterialDescription(final String packageMaterialDescription) {
		this.packageMaterialDescription = packageMaterialDescription; 
	}
 
}
