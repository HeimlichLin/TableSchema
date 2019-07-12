package com.doc.common.dao.impl; 
 
public class Msg5108sDAO extends GeneralDAOImpl<Msg5108sDo> implements Msg5108sDAO { 
	public static final Msg5108sDAOImpl INSTANCE = new Msg5108sDAOImpl(); 
	public static final String TABLENAME = "MSG5108S"; 

	public Msg5108sDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Msg5108sDo> CONVERTER = new MapConverter<Msg5108sDo>() { 
 
		@Override 
		public Msg5108sDo convert(final DataObject dataObject) { 
			final Msg5108sDo msg5108sDo = new Msg5108sDo(); 
			msg5108sDo.setBondno(dataObject.getString(Msg5108sDo.COLUMNS.BONDNO.name())); 
			msg5108sDo.setProcessid(dataObject.getString(Msg5108sDo.COLUMNS.PROCESSID.name())); 
			msg5108sDo.setRespondcode(dataObject.getString(Msg5108sDo.COLUMNS.RESPONDCODE.name())); 
			msg5108sDo.setAmendcode1(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE1.name())); 
			msg5108sDo.setAmendcode2(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE2.name())); 
			msg5108sDo.setAmendcode3(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE3.name())); 
			msg5108sDo.setAmendcode4(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE4.name())); 
			msg5108sDo.setAmendcode5(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE5.name())); 
			msg5108sDo.setAmendcode6(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE6.name())); 
			msg5108sDo.setAmendcode7(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE7.name())); 
			msg5108sDo.setAmendcode8(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE8.name())); 
			msg5108sDo.setAmendcode9(dataObject.getString(Msg5108sDo.COLUMNS.AMENDCODE9.name())); 
			msg5108sDo.setOldmsgtype(dataObject.getString(Msg5108sDo.COLUMNS.OLDMSGTYPE.name())); 
			msg5108sDo.setOldserialno(dataObject.getString(Msg5108sDo.COLUMNS.OLDSERIALNO.name())); 
			msg5108sDo.setVmno(dataObject.getString(Msg5108sDo.COLUMNS.VMNO.name())); 
			msg5108sDo.setConveyance(dataObject.getString(Msg5108sDo.COLUMNS.CONVEYANCE.name())); 
			msg5108sDo.setVrno(dataObject.getString(Msg5108sDo.COLUMNS.VRNO.name())); 
			msg5108sDo.setConsignnum(dataObject.getString(Msg5108sDo.COLUMNS.CONSIGNNUM.name())); 
			msg5108sDo.setFinalnum(BigDecimalUtils.formObj(dataObject.getString(Msg5108sDo.COLUMNS.FINALNUM.name()))); 
			msg5108sDo.setReceiptnum(BigDecimalUtils.formObj(dataObject.getString(Msg5108sDo.COLUMNS.RECEIPTNUM.name()))); 
			msg5108sDo.setEmptynum(BigDecimalUtils.formObj(dataObject.getString(Msg5108sDo.COLUMNS.EMPTYNUM.name()))); 
			msg5108sDo.setIntctlno(dataObject.getString(Msg5108sDo.COLUMNS.INTCTLNO.name())); 
			msg5108sDo.setSendtime(CommUtils.objConver2Time(dataObject.getString(Msg5108sDo.COLUMNS.SENDTIME.name()))); 
			msg5108sDo.setMsgrefno(dataObject.getString(Msg5108sDo.COLUMNS.MSGREFNO.name())); 
			msg5108sDo.setContrno(dataObject.getString(Msg5108sDo.COLUMNS.CONTRNO.name())); 
			return msg5108sDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Msg5108sDo msg5108sDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Msg5108sDo.COLUMNS.BONDNO.name(), msg5108sDo.getBondno()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.PROCESSID.name(), msg5108sDo.getProcessid()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.RESPONDCODE.name(), msg5108sDo.getRespondcode()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE1.name(), msg5108sDo.getAmendcode1()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE2.name(), msg5108sDo.getAmendcode2()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE3.name(), msg5108sDo.getAmendcode3()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE4.name(), msg5108sDo.getAmendcode4()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE5.name(), msg5108sDo.getAmendcode5()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE6.name(), msg5108sDo.getAmendcode6()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE7.name(), msg5108sDo.getAmendcode7()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE8.name(), msg5108sDo.getAmendcode8()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.AMENDCODE9.name(), msg5108sDo.getAmendcode9()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.OLDMSGTYPE.name(), msg5108sDo.getOldmsgtype()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.OLDSERIALNO.name(), msg5108sDo.getOldserialno()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.VMNO.name(), msg5108sDo.getVmno()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.CONVEYANCE.name(), msg5108sDo.getConveyance()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.VRNO.name(), msg5108sDo.getVrno()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.CONSIGNNUM.name(), msg5108sDo.getConsignnum()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.FINALNUM.name(), msg5108sDo.getFinalnum()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.RECEIPTNUM.name(), msg5108sDo.getReceiptnum()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.EMPTYNUM.name(), msg5108sDo.getEmptynum()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.INTCTLNO.name(), msg5108sDo.getIntctlno()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.SENDTIME.name(), msg5108sDo.getSendtime()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.MSGREFNO.name(), msg5108sDo.getMsgrefno()); 
			dataObject.setValue(Msg5108sDo.COLUMNS.CONTRNO.name(), msg5108sDo.getContrno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Msg5108sDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Msg5108sDo po) { 
		sqlWhere.add(Msg5108sDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.PROCESSID.name(), po.getProcessid()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.RESPONDCODE.name(), po.getRespondcode()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE1.name(), po.getAmendcode1()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE2.name(), po.getAmendcode2()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE3.name(), po.getAmendcode3()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE4.name(), po.getAmendcode4()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE5.name(), po.getAmendcode5()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE6.name(), po.getAmendcode6()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE7.name(), po.getAmendcode7()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE8.name(), po.getAmendcode8()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.AMENDCODE9.name(), po.getAmendcode9()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.OLDMSGTYPE.name(), po.getOldmsgtype()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.OLDSERIALNO.name(), po.getOldserialno()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.VMNO.name(), po.getVmno()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.CONVEYANCE.name(), po.getConveyance()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.VRNO.name(), po.getVrno()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.CONSIGNNUM.name(), po.getConsignnum()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.FINALNUM.name(), po.getFinalnum()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.RECEIPTNUM.name(), po.getReceiptnum()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.EMPTYNUM.name(), po.getEmptynum()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.INTCTLNO.name(), po.getIntctlno()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.SENDTIME.name(), po.getSendtime()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.MSGREFNO.name(), po.getMsgrefno()); 
		sqlWhere.add(Msg5108sDo.COLUMNS.CONTRNO.name(), po.getContrno()); 
	} 
 
} 
