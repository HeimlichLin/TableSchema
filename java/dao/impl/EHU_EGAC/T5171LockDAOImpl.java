package com.doc.common.dao.impl; 
 
public class T5171LockDAOImpl extends GeneralDAOImpl<T5171LockPo> implements T5171LockDAO { 
	public static final T5171LockDAOImpl INSTANCE = new T5171LockDAOImpl(); 
	public static final String TABLENAME = "T5171_LOCK"; 

	public T5171LockDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5171LockPo> CONVERTER = new MapConverter<T5171LockPo>() { 
 
		@Override 
		public T5171LockPo convert(final DataObject dataObject) { 
			final T5171LockPo t5171LockPo = new T5171LockPo(); 
			t5171LockPo.setWdate(dataObject.getString(T5171LockPo.COLUMNS.WDATE.name())); 
			t5171LockPo.setWtime(dataObject.getString(T5171LockPo.COLUMNS.WTIME.name())); 
			t5171LockPo.setTtype(dataObject.getString(T5171LockPo.COLUMNS.TTYPE.name())); 
			t5171LockPo.setImportationdate(dataObject.getString(T5171LockPo.COLUMNS.IMPORTATIONDATE.name())); 
			t5171LockPo.setMwb(dataObject.getString(T5171LockPo.COLUMNS.MWB.name())); 
			t5171LockPo.setFlightno(dataObject.getString(T5171LockPo.COLUMNS.FLIGHTNO.name())); 
			t5171LockPo.setPkghwb(dataObject.getString(T5171LockPo.COLUMNS.PKGHWB.name())); 
			t5171LockPo.setPkghwbqty(dataObject.getString(T5171LockPo.COLUMNS.PKGHWBQTY.name())); 
			t5171LockPo.setPkgbagweight(dataObject.getString(T5171LockPo.COLUMNS.PKGBAGWEIGHT.name())); 
			t5171LockPo.setPkgbagpce(dataObject.getString(T5171LockPo.COLUMNS.PKGBAGPCE.name())); 
			t5171LockPo.setPkgbagno(dataObject.getString(T5171LockPo.COLUMNS.PKGBAGNO.name())); 
			t5171LockPo.setLockdate(TimestampUtils.of(dataObject.getValue(T5171LockPo.COLUMNS.LOCKDATE.name()))); 
			t5171LockPo.setLockuser(dataObject.getString(T5171LockPo.COLUMNS.LOCKUSER.name())); 
			t5171LockPo.setSenddate(dataObject.getString(T5171LockPo.COLUMNS.SENDDATE.name())); 
			t5171LockPo.setPrintdate(TimestampUtils.of(dataObject.getValue(T5171LockPo.COLUMNS.PRINTDATE.name()))); 
			return t5171LockPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5171LockPo t5171LockPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5171LockPo.COLUMNS.WDATE.name(), t5171LockPo.getWdate()); 
			dataObject.setValue(T5171LockPo.COLUMNS.WTIME.name(), t5171LockPo.getWtime()); 
			dataObject.setValue(T5171LockPo.COLUMNS.TTYPE.name(), t5171LockPo.getTtype()); 
			dataObject.setValue(T5171LockPo.COLUMNS.IMPORTATIONDATE.name(), t5171LockPo.getImportationdate()); 
			dataObject.setValue(T5171LockPo.COLUMNS.MWB.name(), t5171LockPo.getMwb()); 
			dataObject.setValue(T5171LockPo.COLUMNS.FLIGHTNO.name(), t5171LockPo.getFlightno()); 
			dataObject.setValue(T5171LockPo.COLUMNS.PKGHWB.name(), t5171LockPo.getPkghwb()); 
			dataObject.setValue(T5171LockPo.COLUMNS.PKGHWBQTY.name(), t5171LockPo.getPkghwbqty()); 
			dataObject.setValue(T5171LockPo.COLUMNS.PKGBAGWEIGHT.name(), t5171LockPo.getPkgbagweight()); 
			dataObject.setValue(T5171LockPo.COLUMNS.PKGBAGPCE.name(), t5171LockPo.getPkgbagpce()); 
			dataObject.setValue(T5171LockPo.COLUMNS.PKGBAGNO.name(), t5171LockPo.getPkgbagno()); 
			dataObject.setValue(T5171LockPo.COLUMNS.LOCKDATE.name(), t5171LockPo.getLockdate()); 
			dataObject.setValue(T5171LockPo.COLUMNS.LOCKUSER.name(), t5171LockPo.getLockuser()); 
			dataObject.setValue(T5171LockPo.COLUMNS.SENDDATE.name(), t5171LockPo.getSenddate()); 
			dataObject.setValue(T5171LockPo.COLUMNS.PRINTDATE.name(), t5171LockPo.getPrintdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5171LockPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5171LockPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
