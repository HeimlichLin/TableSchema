package com.doc.common.dao.impl; 
 
public class AdjustmentDAOImpl extends GeneralDAOImpl<AdjustmentPo> implements AdjustmentDAO { 
	public static final AdjustmentDAOImpl INSTANCE = new AdjustmentDAOImpl(); 
	public static final String TABLENAME = "ADJUSTMENT"; 

	public AdjustmentDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AdjustmentPo> CONVERTER = new MapConverter<AdjustmentPo>() { 
 
		@Override 
		public AdjustmentPo convert(final DataObject dataObject) { 
			final AdjustmentPo adjustmentPo = new AdjustmentPo(); 
			adjustmentPo.setBondno(dataObject.getString(AdjustmentPo.COLUMNS.BONDNO.name())); 
			adjustmentPo.setRefbillno(dataObject.getString(AdjustmentPo.COLUMNS.REFBILLNO.name())); 
			adjustmentPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(AdjustmentPo.COLUMNS.ITEM.name()))); 
			adjustmentPo.setInpost(dataObject.getString(AdjustmentPo.COLUMNS.INPOST.name())); 
			adjustmentPo.setDeclno(dataObject.getString(AdjustmentPo.COLUMNS.DECLNO.name())); 
			adjustmentPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(AdjustmentPo.COLUMNS.ITEMNO.name()))); 
			adjustmentPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(AdjustmentPo.COLUMNS.RINQTY.name()))); 
			adjustmentPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(AdjustmentPo.COLUMNS.ADJUSTQTY.name()))); 
			adjustmentPo.setApprvno(dataObject.getString(AdjustmentPo.COLUMNS.APPRVNO.name())); 
			adjustmentPo.setApprvdate(dataObject.getString(AdjustmentPo.COLUMNS.APPRVDATE.name())); 
			adjustmentPo.setRmk(dataObject.getString(AdjustmentPo.COLUMNS.RMK.name())); 
			adjustmentPo.setUpdtime(dataObject.getString(AdjustmentPo.COLUMNS.UPDTIME.name())); 
			return adjustmentPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AdjustmentPo adjustmentPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AdjustmentPo.COLUMNS.BONDNO.name(), adjustmentPo.getBondno()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.REFBILLNO.name(), adjustmentPo.getRefbillno()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.ITEM.name(), adjustmentPo.getItem()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.INPOST.name(), adjustmentPo.getInpost()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.DECLNO.name(), adjustmentPo.getDeclno()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.ITEMNO.name(), adjustmentPo.getItemno()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.RINQTY.name(), adjustmentPo.getRinqty()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.ADJUSTQTY.name(), adjustmentPo.getAdjustqty()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.APPRVNO.name(), adjustmentPo.getApprvno()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.APPRVDATE.name(), adjustmentPo.getApprvdate()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.RMK.name(), adjustmentPo.getRmk()); 
			dataObject.setValue(AdjustmentPo.COLUMNS.UPDTIME.name(), adjustmentPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AdjustmentPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AdjustmentPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
