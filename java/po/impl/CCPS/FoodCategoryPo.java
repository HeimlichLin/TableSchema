package com.doc.common.po.impl; 
 
public class FoodCategoryPo implements IFoodCategoryPo {
 
	public enum COLUMNS {
		FOOD_CATEGORY_IDEN_CODE("食品類別識別碼"), //
		FOOD_SORT_BIG("食品類別大分類"), //
		FOOD_SORT_MID("食品類別中分類"), //
		FOOD_SORT_SMALL("食品類別小分類"), //
		FOOD_SORT_CAREFUL("食品類別細分類"), //
		FOOD_CATEGORY_NAME("食品類別名稱"), //
		EXPLANATION("說明"), //
		DELETE_MARK("刪除註記"), //
		DELETE_REASON("刪除理由") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String foodCategoryIdenCode;
	private String foodSortBig;
	private String foodSortMid;
	private String foodSortSmall;
	private String foodSortCareful;
	private String foodCategoryName;
	private String explanation;
	private String deleteMark;
	private String deleteReason;

	@Override
	public String getFoodCategoryIdenCode() {
		return this.foodCategoryIdenCode;
	}
 
	@Override
	public void setFoodCategoryIdenCode(final String foodCategoryIdenCode) {
		this.foodCategoryIdenCode = foodCategoryIdenCode; 
	}
 
	@Override
	public String getFoodSortBig() {
		return this.foodSortBig;
	}
 
	@Override
	public void setFoodSortBig(final String foodSortBig) {
		this.foodSortBig = foodSortBig; 
	}
 
	@Override
	public String getFoodSortMid() {
		return this.foodSortMid;
	}
 
	@Override
	public void setFoodSortMid(final String foodSortMid) {
		this.foodSortMid = foodSortMid; 
	}
 
	@Override
	public String getFoodSortSmall() {
		return this.foodSortSmall;
	}
 
	@Override
	public void setFoodSortSmall(final String foodSortSmall) {
		this.foodSortSmall = foodSortSmall; 
	}
 
	@Override
	public String getFoodSortCareful() {
		return this.foodSortCareful;
	}
 
	@Override
	public void setFoodSortCareful(final String foodSortCareful) {
		this.foodSortCareful = foodSortCareful; 
	}
 
	@Override
	public String getFoodCategoryName() {
		return this.foodCategoryName;
	}
 
	@Override
	public void setFoodCategoryName(final String foodCategoryName) {
		this.foodCategoryName = foodCategoryName; 
	}
 
	@Override
	public String getExplanation() {
		return this.explanation;
	}
 
	@Override
	public void setExplanation(final String explanation) {
		this.explanation = explanation; 
	}
 
	@Override
	public String getDeleteMark() {
		return this.deleteMark;
	}
 
	@Override
	public void setDeleteMark(final String deleteMark) {
		this.deleteMark = deleteMark; 
	}
 
	@Override
	public String getDeleteReason() {
		return this.deleteReason;
	}
 
	@Override
	public void setDeleteReason(final String deleteReason) {
		this.deleteReason = deleteReason; 
	}
 
}
