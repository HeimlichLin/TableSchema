package com.doc.common.dao.impl; 
 
public class InvtryremarkDAOImpl extends GeneralDAOImpl<InvtryremarkPo> implements InvtryremarkDAO { 
	public static final InvtryremarkDAOImpl INSTANCE = new InvtryremarkDAOImpl(); 
	public static final String TABLENAME = "INVTRYREMARK"; 

	public InvtryremarkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtryremarkPo> CONVERTER = new MapConverter<InvtryremarkPo>() { 
 
		@Override 
		public InvtryremarkPo convert(final DataObject dataObject) { 
			final InvtryremarkPo invtryremarkPo = new InvtryremarkPo(); 
			invtryremarkPo.setBfNo(dataObject.getString(InvtryremarkPo.COLUMNS.BF_NO.name())); 
			invtryremarkPo.setInvYear(dataObject.getString(InvtryremarkPo.COLUMNS.INV_YEAR.name())); 
			invtryremarkPo.setCommodityNo(dataObject.getString(InvtryremarkPo.COLUMNS.COMMODITY_NO.name())); 
			invtryremarkPo.setRemark(dataObject.getString(InvtryremarkPo.COLUMNS.REMARK.name())); 
			return invtryremarkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtryremarkPo invtryremarkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtryremarkPo.COLUMNS.BF_NO.name(), invtryremarkPo.getBfNo()); 
			dataObject.setValue(InvtryremarkPo.COLUMNS.INV_YEAR.name(), invtryremarkPo.getInvYear()); 
			dataObject.setValue(InvtryremarkPo.COLUMNS.COMMODITY_NO.name(), invtryremarkPo.getCommodityNo()); 
			dataObject.setValue(InvtryremarkPo.COLUMNS.REMARK.name(), invtryremarkPo.getRemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtryremarkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtryremarkPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
