package com.doc.common.dao.impl; 
 
public class SitaDAOImpl extends GeneralDAOImpl<SitaPo> implements SitaDAO { 
	public static final SitaDAOImpl INSTANCE = new SitaDAOImpl(); 
	public static final String TABLENAME = "SITA"; 

	public SitaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SitaPo> CONVERTER = new MapConverter<SitaPo>() { 
 
		@Override 
		public SitaPo convert(final DataObject dataObject) { 
			final SitaPo sitaPo = new SitaPo(); 
			sitaPo.setSitaAwbNo(dataObject.getString(SitaPo.COLUMNS.SITA_AWB_NO.name())); 
			sitaPo.setSitaCode(dataObject.getString(SitaPo.COLUMNS.SITA_CODE.name())); 
			sitaPo.setSitaCreateStamp(dataObject.getString(SitaPo.COLUMNS.SITA_CREATE_STAMP.name())); 
			sitaPo.setSitaFsuVersion(dataObject.getString(SitaPo.COLUMNS.SITA_FSU_VERSION.name())); 
			sitaPo.setSitaDesAddress01(dataObject.getString(SitaPo.COLUMNS.SITA_DES_ADDRESS_01.name())); 
			sitaPo.setSitaDesAddress02(dataObject.getString(SitaPo.COLUMNS.SITA_DES_ADDRESS_02.name())); 
			sitaPo.setSitaDesAddress03(dataObject.getString(SitaPo.COLUMNS.SITA_DES_ADDRESS_03.name())); 
			sitaPo.setSitaDesAddress04(dataObject.getString(SitaPo.COLUMNS.SITA_DES_ADDRESS_04.name())); 
			sitaPo.setSitaDesAddress05(dataObject.getString(SitaPo.COLUMNS.SITA_DES_ADDRESS_05.name())); 
			sitaPo.setSitaDesAddress06(dataObject.getString(SitaPo.COLUMNS.SITA_DES_ADDRESS_06.name())); 
			sitaPo.setSitaTextA(dataObject.getString(SitaPo.COLUMNS.SITA_TEXT_A.name())); 
			sitaPo.setSitaTextB(dataObject.getString(SitaPo.COLUMNS.SITA_TEXT_B.name())); 
			sitaPo.setSitaTextC(dataObject.getString(SitaPo.COLUMNS.SITA_TEXT_C.name())); 
			sitaPo.setSitaProcessStamp(dataObject.getString(SitaPo.COLUMNS.SITA_PROCESS_STAMP.name())); 
			sitaPo.setSitaProcessFlag(dataObject.getString(SitaPo.COLUMNS.SITA_PROCESS_FLAG.name())); 
			return sitaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SitaPo sitaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_AWB_NO.name(), sitaPo.getSitaAwbNo()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_CODE.name(), sitaPo.getSitaCode()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_CREATE_STAMP.name(), sitaPo.getSitaCreateStamp()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_FSU_VERSION.name(), sitaPo.getSitaFsuVersion()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_DES_ADDRESS_01.name(), sitaPo.getSitaDesAddress01()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_DES_ADDRESS_02.name(), sitaPo.getSitaDesAddress02()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_DES_ADDRESS_03.name(), sitaPo.getSitaDesAddress03()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_DES_ADDRESS_04.name(), sitaPo.getSitaDesAddress04()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_DES_ADDRESS_05.name(), sitaPo.getSitaDesAddress05()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_DES_ADDRESS_06.name(), sitaPo.getSitaDesAddress06()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_TEXT_A.name(), sitaPo.getSitaTextA()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_TEXT_B.name(), sitaPo.getSitaTextB()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_TEXT_C.name(), sitaPo.getSitaTextC()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_PROCESS_STAMP.name(), sitaPo.getSitaProcessStamp()); 
			dataObject.setValue(SitaPo.COLUMNS.SITA_PROCESS_FLAG.name(), sitaPo.getSitaProcessFlag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SitaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SitaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
