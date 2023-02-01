package com.doc.common.dao.impl; 
 
public class Msg5108sDAOImpl extends GeneralDAOImpl<Msg5108sPo> implements Msg5108sDAO { 
	public static final Msg5108sDAOImpl INSTANCE = new Msg5108sDAOImpl(); 
	public static final String TABLENAME = "MSG5108S"; 

	public Msg5108sDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Msg5108sPo> CONVERTER = new MapConverter<Msg5108sPo>() { 
 
		@Override 
		public Msg5108sPo convert(final DataObject dataObject) { 
			final Msg5108sPo msg5108sPo = new Msg5108sPo(); 
			msg5108sPo.setBondno(dataObject.getString(Msg5108sPo.COLUMNS.BONDNO.name())); 
			msg5108sPo.setProcessid(dataObject.getString(Msg5108sPo.COLUMNS.PROCESSID.name())); 
			msg5108sPo.setRespondcode(dataObject.getString(Msg5108sPo.COLUMNS.RESPONDCODE.name())); 
			msg5108sPo.setAmendcode1(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE1.name())); 
			msg5108sPo.setAmendcode2(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE2.name())); 
			msg5108sPo.setAmendcode3(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE3.name())); 
			msg5108sPo.setAmendcode4(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE4.name())); 
			msg5108sPo.setAmendcode5(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE5.name())); 
			msg5108sPo.setAmendcode6(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE6.name())); 
			msg5108sPo.setAmendcode7(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE7.name())); 
			msg5108sPo.setAmendcode8(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE8.name())); 
			msg5108sPo.setAmendcode9(dataObject.getString(Msg5108sPo.COLUMNS.AMENDCODE9.name())); 
			msg5108sPo.setOldmsgtype(dataObject.getString(Msg5108sPo.COLUMNS.OLDMSGTYPE.name())); 
			msg5108sPo.setOldserialno(dataObject.getString(Msg5108sPo.COLUMNS.OLDSERIALNO.name())); 
			msg5108sPo.setVmno(dataObject.getString(Msg5108sPo.COLUMNS.VMNO.name())); 
			msg5108sPo.setConveyance(dataObject.getString(Msg5108sPo.COLUMNS.CONVEYANCE.name())); 
			msg5108sPo.setVrno(dataObject.getString(Msg5108sPo.COLUMNS.VRNO.name())); 
			msg5108sPo.setConsignnum(dataObject.getString(Msg5108sPo.COLUMNS.CONSIGNNUM.name())); 
			msg5108sPo.setFinalnum(BigDecimalUtils.formObj(dataObject.getValue(Msg5108sPo.COLUMNS.FINALNUM.name()))); 
			msg5108sPo.setReceiptnum(BigDecimalUtils.formObj(dataObject.getValue(Msg5108sPo.COLUMNS.RECEIPTNUM.name()))); 
			msg5108sPo.setEmptynum(BigDecimalUtils.formObj(dataObject.getValue(Msg5108sPo.COLUMNS.EMPTYNUM.name()))); 
			msg5108sPo.setIntctlno(dataObject.getString(Msg5108sPo.COLUMNS.INTCTLNO.name())); 
			msg5108sPo.setSendtime(TimestampUtils.of(dataObject.getValue(Msg5108sPo.COLUMNS.SENDTIME.name()))); 
			msg5108sPo.setMsgrefno(dataObject.getString(Msg5108sPo.COLUMNS.MSGREFNO.name())); 
			msg5108sPo.setContrno(dataObject.getString(Msg5108sPo.COLUMNS.CONTRNO.name())); 
			return msg5108sPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Msg5108sPo msg5108sPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Msg5108sPo.COLUMNS.BONDNO.name(), msg5108sPo.getBondno()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.PROCESSID.name(), msg5108sPo.getProcessid()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.RESPONDCODE.name(), msg5108sPo.getRespondcode()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE1.name(), msg5108sPo.getAmendcode1()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE2.name(), msg5108sPo.getAmendcode2()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE3.name(), msg5108sPo.getAmendcode3()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE4.name(), msg5108sPo.getAmendcode4()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE5.name(), msg5108sPo.getAmendcode5()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE6.name(), msg5108sPo.getAmendcode6()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE7.name(), msg5108sPo.getAmendcode7()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE8.name(), msg5108sPo.getAmendcode8()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.AMENDCODE9.name(), msg5108sPo.getAmendcode9()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.OLDMSGTYPE.name(), msg5108sPo.getOldmsgtype()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.OLDSERIALNO.name(), msg5108sPo.getOldserialno()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.VMNO.name(), msg5108sPo.getVmno()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.CONVEYANCE.name(), msg5108sPo.getConveyance()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.VRNO.name(), msg5108sPo.getVrno()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.CONSIGNNUM.name(), msg5108sPo.getConsignnum()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.FINALNUM.name(), msg5108sPo.getFinalnum()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.RECEIPTNUM.name(), msg5108sPo.getReceiptnum()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.EMPTYNUM.name(), msg5108sPo.getEmptynum()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.INTCTLNO.name(), msg5108sPo.getIntctlno()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.SENDTIME.name(), msg5108sPo.getSendtime()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.MSGREFNO.name(), msg5108sPo.getMsgrefno()); 
			dataObject.setValue(Msg5108sPo.COLUMNS.CONTRNO.name(), msg5108sPo.getContrno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Msg5108sPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Msg5108sPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
