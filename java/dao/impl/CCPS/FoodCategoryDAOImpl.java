package com.doc.common.dao.impl; 
 
public class FoodCategoryDAOImpl extends GeneralDAOImpl<FoodCategoryPo> implements FoodCategoryDAO { 
	public static final FoodCategoryDAOImpl INSTANCE = new FoodCategoryDAOImpl(); 
	public static final String TABLENAME = "FOOD_CATEGORY"; 

	public FoodCategoryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FoodCategoryPo> CONVERTER = new MapConverter<FoodCategoryPo>() { 
 
		@Override 
		public FoodCategoryPo convert(final DataObject dataObject) { 
			final FoodCategoryPo foodCategoryPo = new FoodCategoryPo(); 
			foodCategoryPo.setFoodCategoryIdenCode(dataObject.getString(FoodCategoryPo.COLUMNS.FOOD_CATEGORY_IDEN_CODE.name())); 
			foodCategoryPo.setFoodSortBig(dataObject.getString(FoodCategoryPo.COLUMNS.FOOD_SORT_BIG.name())); 
			foodCategoryPo.setFoodSortMid(dataObject.getString(FoodCategoryPo.COLUMNS.FOOD_SORT_MID.name())); 
			foodCategoryPo.setFoodSortSmall(dataObject.getString(FoodCategoryPo.COLUMNS.FOOD_SORT_SMALL.name())); 
			foodCategoryPo.setFoodSortCareful(dataObject.getString(FoodCategoryPo.COLUMNS.FOOD_SORT_CAREFUL.name())); 
			foodCategoryPo.setFoodCategoryName(dataObject.getString(FoodCategoryPo.COLUMNS.FOOD_CATEGORY_NAME.name())); 
			foodCategoryPo.setExplanation(dataObject.getString(FoodCategoryPo.COLUMNS.EXPLANATION.name())); 
			foodCategoryPo.setDeleteMark(dataObject.getString(FoodCategoryPo.COLUMNS.DELETE_MARK.name())); 
			foodCategoryPo.setDeleteReason(dataObject.getString(FoodCategoryPo.COLUMNS.DELETE_REASON.name())); 
			return foodCategoryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FoodCategoryPo foodCategoryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.FOOD_CATEGORY_IDEN_CODE.name(), foodCategoryPo.getFoodCategoryIdenCode()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.FOOD_SORT_BIG.name(), foodCategoryPo.getFoodSortBig()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.FOOD_SORT_MID.name(), foodCategoryPo.getFoodSortMid()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.FOOD_SORT_SMALL.name(), foodCategoryPo.getFoodSortSmall()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.FOOD_SORT_CAREFUL.name(), foodCategoryPo.getFoodSortCareful()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.FOOD_CATEGORY_NAME.name(), foodCategoryPo.getFoodCategoryName()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.EXPLANATION.name(), foodCategoryPo.getExplanation()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.DELETE_MARK.name(), foodCategoryPo.getDeleteMark()); 
			dataObject.setValue(FoodCategoryPo.COLUMNS.DELETE_REASON.name(), foodCategoryPo.getDeleteReason()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FoodCategoryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FoodCategoryPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(FoodCategoryPo.COLUMNS.FOOD_CATEGORY_IDEN_CODE.name(), po.getFoodCategoryIdenCode()); 
		return sqlWhere; 
	} 
 
} 
