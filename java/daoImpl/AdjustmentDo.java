package com.doc.common.dao.impl; 
 
public class AdjustmentDAO extends GeneralDAOImpl<AdjustmentDo> implements AdjustmentDAO { 
	public static final AdjustmentDAOImpl INSTANCE = new AdjustmentDAOImpl(); 
	public static final String TABLENAME = "ADJUSTMENT"; 

	public AdjustmentDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<AdjustmentDo> CONVERTER = new MapConverter<AdjustmentDo>() { 
 
		@Override 
		public AdjustmentDo convert(final DataObject dataObject) { 
			final AdjustmentDo adjustmentDo = new AdjustmentDo(); 
			adjustmentDo.setBondno(dataObject.getString(AdjustmentDo.COLUMNS.BONDNO.name())); 
			adjustmentDo.setRefbillno(dataObject.getString(AdjustmentDo.COLUMNS.REFBILLNO.name())); 
			adjustmentDo.setItem(BigDecimalUtils.formObj(dataObject.getString(AdjustmentDo.COLUMNS.ITEM.name()))); 
			adjustmentDo.setInpost(dataObject.getString(AdjustmentDo.COLUMNS.INPOST.name())); 
			adjustmentDo.setDeclno(dataObject.getString(AdjustmentDo.COLUMNS.DECLNO.name())); 
			adjustmentDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(AdjustmentDo.COLUMNS.ITEMNO.name()))); 
			adjustmentDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(AdjustmentDo.COLUMNS.RINQTY.name()))); 
			adjustmentDo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getString(AdjustmentDo.COLUMNS.ADJUSTQTY.name()))); 
			adjustmentDo.setApprvno(dataObject.getString(AdjustmentDo.COLUMNS.APPRVNO.name())); 
			adjustmentDo.setApprvdate(dataObject.getString(AdjustmentDo.COLUMNS.APPRVDATE.name())); 
			adjustmentDo.setRmk(dataObject.getString(AdjustmentDo.COLUMNS.RMK.name())); 
			adjustmentDo.setUpdtime(dataObject.getString(AdjustmentDo.COLUMNS.UPDTIME.name())); 
			return adjustmentDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AdjustmentDo adjustmentDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AdjustmentDo.COLUMNS.BONDNO.name(), adjustmentDo.getBondno()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.REFBILLNO.name(), adjustmentDo.getRefbillno()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.ITEM.name(), adjustmentDo.getItem()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.INPOST.name(), adjustmentDo.getInpost()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.DECLNO.name(), adjustmentDo.getDeclno()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.ITEMNO.name(), adjustmentDo.getItemno()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.RINQTY.name(), adjustmentDo.getRinqty()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.ADJUSTQTY.name(), adjustmentDo.getAdjustqty()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.APPRVNO.name(), adjustmentDo.getApprvno()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.APPRVDATE.name(), adjustmentDo.getApprvdate()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.RMK.name(), adjustmentDo.getRmk()); 
			dataObject.setValue(AdjustmentDo.COLUMNS.UPDTIME.name(), adjustmentDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AdjustmentDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AdjustmentDo po) { 
		sqlWhere.add(AdjustmentDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.ADJUSTQTY.name(), po.getAdjustqty()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.APPRVNO.name(), po.getApprvno()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.APPRVDATE.name(), po.getApprvdate()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.RMK.name(), po.getRmk()); 
		sqlWhere.add(AdjustmentDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
