package com.doc.common.po.impl; 
 
public class ProductSpecPo implements IProductSpecPo {
 
	public enum COLUMNS {
		PRODUCT_SPEC_IDEN_CODE("產品包裝規格識別碼"), //
		PRODUCT_INFO_ASSO_CODE("產品資訊主檔關聯碼"), //
		PRODUCT_SPEC("包裝規格"), //
		PACKAGE_SPEC_FORM("產品包裝形式"), //
		PACKAGE_SPEC_WEIGHT("產品包裝規格重量"), //
		PACKAGE_SPEC_WEIGHT_TYPE("產品包裝規格重量單位"), //
		PACKAGE_SPEC_TYPE_ASSO_CODE("產品包裝規格單位代碼關聯碼"), //
		OUTER_PACKAGE_SPEC("外包裝標示規格"), //
		PACKAGE_SPEC_BULK_REMARK("產品包裝規格散裝備註"), //
		PACKAGE_CONTAINER_REMARK("產品包裝容器材質備註"), //
		GENETIC_MODIFICATION_LABEL("產品包裝基因改造標示"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		PRODUCT_PACKAGE_GS1_CODE("產品包裝GS1商品條碼"), //
		PRODUCT_TRACE_CODE("產品追溯系統串接碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String productSpecIdenCode;
	private String productInfoAssoCode;
	private String productSpec;
	private String packageSpecForm;
	private String packageSpecWeight;
	private String packageSpecWeightType;
	private String packageSpecTypeAssoCode;
	private String outerPackageSpec;
	private String packageSpecBulkRemark;
	private String packageContainerRemark;
	private String geneticModificationLabel;
	private String productSelfCode;
	private String productPackageGs1Code;
	private String productTraceCode;

	@Override
	public String getProductSpecIdenCode() {
		return this.productSpecIdenCode;
	}
 
	@Override
	public void setProductSpecIdenCode(final String productSpecIdenCode) {
		this.productSpecIdenCode = productSpecIdenCode; 
	}
 
	@Override
	public String getProductInfoAssoCode() {
		return this.productInfoAssoCode;
	}
 
	@Override
	public void setProductInfoAssoCode(final String productInfoAssoCode) {
		this.productInfoAssoCode = productInfoAssoCode; 
	}
 
	@Override
	public String getProductSpec() {
		return this.productSpec;
	}
 
	@Override
	public void setProductSpec(final String productSpec) {
		this.productSpec = productSpec; 
	}
 
	@Override
	public String getPackageSpecForm() {
		return this.packageSpecForm;
	}
 
	@Override
	public void setPackageSpecForm(final String packageSpecForm) {
		this.packageSpecForm = packageSpecForm; 
	}
 
	@Override
	public String getPackageSpecWeight() {
		return this.packageSpecWeight;
	}
 
	@Override
	public void setPackageSpecWeight(final String packageSpecWeight) {
		this.packageSpecWeight = packageSpecWeight; 
	}
 
	@Override
	public String getPackageSpecWeightType() {
		return this.packageSpecWeightType;
	}
 
	@Override
	public void setPackageSpecWeightType(final String packageSpecWeightType) {
		this.packageSpecWeightType = packageSpecWeightType; 
	}
 
	@Override
	public String getPackageSpecTypeAssoCode() {
		return this.packageSpecTypeAssoCode;
	}
 
	@Override
	public void setPackageSpecTypeAssoCode(final String packageSpecTypeAssoCode) {
		this.packageSpecTypeAssoCode = packageSpecTypeAssoCode; 
	}
 
	@Override
	public String getOuterPackageSpec() {
		return this.outerPackageSpec;
	}
 
	@Override
	public void setOuterPackageSpec(final String outerPackageSpec) {
		this.outerPackageSpec = outerPackageSpec; 
	}
 
	@Override
	public String getPackageSpecBulkRemark() {
		return this.packageSpecBulkRemark;
	}
 
	@Override
	public void setPackageSpecBulkRemark(final String packageSpecBulkRemark) {
		this.packageSpecBulkRemark = packageSpecBulkRemark; 
	}
 
	@Override
	public String getPackageContainerRemark() {
		return this.packageContainerRemark;
	}
 
	@Override
	public void setPackageContainerRemark(final String packageContainerRemark) {
		this.packageContainerRemark = packageContainerRemark; 
	}
 
	@Override
	public String getGeneticModificationLabel() {
		return this.geneticModificationLabel;
	}
 
	@Override
	public void setGeneticModificationLabel(final String geneticModificationLabel) {
		this.geneticModificationLabel = geneticModificationLabel; 
	}
 
	@Override
	public String getProductSelfCode() {
		return this.productSelfCode;
	}
 
	@Override
	public void setProductSelfCode(final String productSelfCode) {
		this.productSelfCode = productSelfCode; 
	}
 
	@Override
	public String getProductPackageGs1Code() {
		return this.productPackageGs1Code;
	}
 
	@Override
	public void setProductPackageGs1Code(final String productPackageGs1Code) {
		this.productPackageGs1Code = productPackageGs1Code; 
	}
 
	@Override
	public String getProductTraceCode() {
		return this.productTraceCode;
	}
 
	@Override
	public void setProductTraceCode(final String productTraceCode) {
		this.productTraceCode = productTraceCode; 
	}
 
}
