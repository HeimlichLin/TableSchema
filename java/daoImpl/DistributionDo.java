package com.doc.common.dao.impl; 
 
public class DistributionDAO extends GeneralDAOImpl<DistributionDo> implements DistributionDAO { 
	public static final DistributionDAOImpl INSTANCE = new DistributionDAOImpl(); 
	public static final String TABLENAME = "DISTRIBUTION"; 

	public DistributionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<DistributionDo> CONVERTER = new MapConverter<DistributionDo>() { 
 
		@Override 
		public DistributionDo convert(final DataObject dataObject) { 
			final DistributionDo distributionDo = new DistributionDo(); 
			distributionDo.setValsystem(dataObject.getString(DistributionDo.COLUMNS.VALSYSTEM.name())); 
			distributionDo.setMsgcode(dataObject.getString(DistributionDo.COLUMNS.MSGCODE.name())); 
			distributionDo.setCondtype(dataObject.getString(DistributionDo.COLUMNS.CONDTYPE.name())); 
			distributionDo.setBoxno(dataObject.getString(DistributionDo.COLUMNS.BOXNO.name())); 
			distributionDo.setOwnerban(dataObject.getString(DistributionDo.COLUMNS.OWNERBAN.name())); 
			distributionDo.setStgplace(dataObject.getString(DistributionDo.COLUMNS.STGPLACE.name())); 
			distributionDo.setDecltype(dataObject.getString(DistributionDo.COLUMNS.DECLTYPE.name())); 
			distributionDo.setSendtype(dataObject.getString(DistributionDo.COLUMNS.SENDTYPE.name())); 
			distributionDo.setDestin01(dataObject.getString(DistributionDo.COLUMNS.DESTIN01.name())); 
			distributionDo.setDestin02(dataObject.getString(DistributionDo.COLUMNS.DESTIN02.name())); 
			distributionDo.setDestin03(dataObject.getString(DistributionDo.COLUMNS.DESTIN03.name())); 
			distributionDo.setDestin04(dataObject.getString(DistributionDo.COLUMNS.DESTIN04.name())); 
			distributionDo.setDestin05(dataObject.getString(DistributionDo.COLUMNS.DESTIN05.name())); 
			distributionDo.setActivedate(dataObject.getString(DistributionDo.COLUMNS.ACTIVEDATE.name())); 
			distributionDo.setEnddate(dataObject.getString(DistributionDo.COLUMNS.ENDDATE.name())); 
			distributionDo.setStatus(dataObject.getString(DistributionDo.COLUMNS.STATUS.name())); 
			return distributionDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DistributionDo distributionDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DistributionDo.COLUMNS.VALSYSTEM.name(), distributionDo.getValsystem()); 
			dataObject.setValue(DistributionDo.COLUMNS.MSGCODE.name(), distributionDo.getMsgcode()); 
			dataObject.setValue(DistributionDo.COLUMNS.CONDTYPE.name(), distributionDo.getCondtype()); 
			dataObject.setValue(DistributionDo.COLUMNS.BOXNO.name(), distributionDo.getBoxno()); 
			dataObject.setValue(DistributionDo.COLUMNS.OWNERBAN.name(), distributionDo.getOwnerban()); 
			dataObject.setValue(DistributionDo.COLUMNS.STGPLACE.name(), distributionDo.getStgplace()); 
			dataObject.setValue(DistributionDo.COLUMNS.DECLTYPE.name(), distributionDo.getDecltype()); 
			dataObject.setValue(DistributionDo.COLUMNS.SENDTYPE.name(), distributionDo.getSendtype()); 
			dataObject.setValue(DistributionDo.COLUMNS.DESTIN01.name(), distributionDo.getDestin01()); 
			dataObject.setValue(DistributionDo.COLUMNS.DESTIN02.name(), distributionDo.getDestin02()); 
			dataObject.setValue(DistributionDo.COLUMNS.DESTIN03.name(), distributionDo.getDestin03()); 
			dataObject.setValue(DistributionDo.COLUMNS.DESTIN04.name(), distributionDo.getDestin04()); 
			dataObject.setValue(DistributionDo.COLUMNS.DESTIN05.name(), distributionDo.getDestin05()); 
			dataObject.setValue(DistributionDo.COLUMNS.ACTIVEDATE.name(), distributionDo.getActivedate()); 
			dataObject.setValue(DistributionDo.COLUMNS.ENDDATE.name(), distributionDo.getEnddate()); 
			dataObject.setValue(DistributionDo.COLUMNS.STATUS.name(), distributionDo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DistributionDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DistributionDo po) { 
		sqlWhere.add(DistributionDo.COLUMNS.VALSYSTEM.name(), po.getValsystem()); 
		sqlWhere.add(DistributionDo.COLUMNS.MSGCODE.name(), po.getMsgcode()); 
		sqlWhere.add(DistributionDo.COLUMNS.CONDTYPE.name(), po.getCondtype()); 
		sqlWhere.add(DistributionDo.COLUMNS.BOXNO.name(), po.getBoxno()); 
		sqlWhere.add(DistributionDo.COLUMNS.OWNERBAN.name(), po.getOwnerban()); 
		sqlWhere.add(DistributionDo.COLUMNS.STGPLACE.name(), po.getStgplace()); 
		sqlWhere.add(DistributionDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(DistributionDo.COLUMNS.SENDTYPE.name(), po.getSendtype()); 
		sqlWhere.add(DistributionDo.COLUMNS.DESTIN01.name(), po.getDestin01()); 
		sqlWhere.add(DistributionDo.COLUMNS.DESTIN02.name(), po.getDestin02()); 
		sqlWhere.add(DistributionDo.COLUMNS.DESTIN03.name(), po.getDestin03()); 
		sqlWhere.add(DistributionDo.COLUMNS.DESTIN04.name(), po.getDestin04()); 
		sqlWhere.add(DistributionDo.COLUMNS.DESTIN05.name(), po.getDestin05()); 
		sqlWhere.add(DistributionDo.COLUMNS.ACTIVEDATE.name(), po.getActivedate()); 
		sqlWhere.add(DistributionDo.COLUMNS.ENDDATE.name(), po.getEnddate()); 
		sqlWhere.add(DistributionDo.COLUMNS.STATUS.name(), po.getStatus()); 
	} 
 
} 
