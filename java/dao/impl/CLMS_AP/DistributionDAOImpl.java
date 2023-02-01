package com.doc.common.dao.impl; 
 
public class DistributionDAOImpl extends GeneralDAOImpl<DistributionPo> implements DistributionDAO { 
	public static final DistributionDAOImpl INSTANCE = new DistributionDAOImpl(); 
	public static final String TABLENAME = "DISTRIBUTION"; 

	public DistributionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DistributionPo> CONVERTER = new MapConverter<DistributionPo>() { 
 
		@Override 
		public DistributionPo convert(final DataObject dataObject) { 
			final DistributionPo distributionPo = new DistributionPo(); 
			distributionPo.setValsystem(dataObject.getString(DistributionPo.COLUMNS.VALSYSTEM.name())); 
			distributionPo.setMsgcode(dataObject.getString(DistributionPo.COLUMNS.MSGCODE.name())); 
			distributionPo.setCondtype(dataObject.getString(DistributionPo.COLUMNS.CONDTYPE.name())); 
			distributionPo.setBoxno(dataObject.getString(DistributionPo.COLUMNS.BOXNO.name())); 
			distributionPo.setOwnerban(dataObject.getString(DistributionPo.COLUMNS.OWNERBAN.name())); 
			distributionPo.setStgplace(dataObject.getString(DistributionPo.COLUMNS.STGPLACE.name())); 
			distributionPo.setDecltype(dataObject.getString(DistributionPo.COLUMNS.DECLTYPE.name())); 
			distributionPo.setSendtype(dataObject.getString(DistributionPo.COLUMNS.SENDTYPE.name())); 
			distributionPo.setDestin01(dataObject.getString(DistributionPo.COLUMNS.DESTIN01.name())); 
			distributionPo.setDestin02(dataObject.getString(DistributionPo.COLUMNS.DESTIN02.name())); 
			distributionPo.setDestin03(dataObject.getString(DistributionPo.COLUMNS.DESTIN03.name())); 
			distributionPo.setDestin04(dataObject.getString(DistributionPo.COLUMNS.DESTIN04.name())); 
			distributionPo.setDestin05(dataObject.getString(DistributionPo.COLUMNS.DESTIN05.name())); 
			distributionPo.setActivedate(dataObject.getString(DistributionPo.COLUMNS.ACTIVEDATE.name())); 
			distributionPo.setEnddate(dataObject.getString(DistributionPo.COLUMNS.ENDDATE.name())); 
			distributionPo.setStatus(dataObject.getString(DistributionPo.COLUMNS.STATUS.name())); 
			return distributionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DistributionPo distributionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DistributionPo.COLUMNS.VALSYSTEM.name(), distributionPo.getValsystem()); 
			dataObject.setValue(DistributionPo.COLUMNS.MSGCODE.name(), distributionPo.getMsgcode()); 
			dataObject.setValue(DistributionPo.COLUMNS.CONDTYPE.name(), distributionPo.getCondtype()); 
			dataObject.setValue(DistributionPo.COLUMNS.BOXNO.name(), distributionPo.getBoxno()); 
			dataObject.setValue(DistributionPo.COLUMNS.OWNERBAN.name(), distributionPo.getOwnerban()); 
			dataObject.setValue(DistributionPo.COLUMNS.STGPLACE.name(), distributionPo.getStgplace()); 
			dataObject.setValue(DistributionPo.COLUMNS.DECLTYPE.name(), distributionPo.getDecltype()); 
			dataObject.setValue(DistributionPo.COLUMNS.SENDTYPE.name(), distributionPo.getSendtype()); 
			dataObject.setValue(DistributionPo.COLUMNS.DESTIN01.name(), distributionPo.getDestin01()); 
			dataObject.setValue(DistributionPo.COLUMNS.DESTIN02.name(), distributionPo.getDestin02()); 
			dataObject.setValue(DistributionPo.COLUMNS.DESTIN03.name(), distributionPo.getDestin03()); 
			dataObject.setValue(DistributionPo.COLUMNS.DESTIN04.name(), distributionPo.getDestin04()); 
			dataObject.setValue(DistributionPo.COLUMNS.DESTIN05.name(), distributionPo.getDestin05()); 
			dataObject.setValue(DistributionPo.COLUMNS.ACTIVEDATE.name(), distributionPo.getActivedate()); 
			dataObject.setValue(DistributionPo.COLUMNS.ENDDATE.name(), distributionPo.getEnddate()); 
			dataObject.setValue(DistributionPo.COLUMNS.STATUS.name(), distributionPo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DistributionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DistributionPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
