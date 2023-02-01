package com.doc.common.po.impl; 
 
public class DeclarPo implements IDeclarPo {
 
	public enum COLUMNS {
		MSG_FUN("異動別 9:新增 5:修改 1:刪除"), //
		BF_NO("監管編號"), //
		STR_TYPE("進出倉別 1:進 2:出"), //
		DECL_TYPE("報單類別"), //
		DECL_NO("報單號碼"), //
		IMPORT_DATE("進口日期"), //
		DECL_DATE("申報日期"), //
		RLS_DATE("放行日期"), //
		STG_PLACE("存放處所"), //
		NO_PKG("件數"), //
		PKG_UNIT("件數單位"), //
		G_WGT("總重量"), //
		REF_BILL_NO("參考單號"), //
		BOX_NO("報關行箱號"), //
		INBOND_NO("進倉保稅倉庫業者代碼"), //
		OUTBOND_NO("出倉保稅倉庫業者代碼"), //
		SEND_ID("傳送代碼"), //
		SEND_QULF("送方識別碼"), //
		RECV_ID("接收代碼"), //
		RECV_QULF("收方識別碼"), //
		RLS_FLAG("是否放行 (N:未放行 Y:已放行)"), //
		MAWB_NO("主提單號"), //
		HAWB_NO("分提單號"), //
		OWNER_BAN("貨主統編"), //
		CONFIRMED("是否確認 (N:未確認 Y:已確認)"), //
		MN_RPT("按月彙報駐記"), //
		RMKS("註解"), //
		FOB_AMT("FOB價格"), //
		SHIP_PORT("出口港"), //
		DEST_PORT("進口港"), //
		TRANS_TYPE("運輸別"), //
		CIF_AMT("CIF價格"), //
		MARK("麥頭"), //
		BILLING_STAT("收費狀態"), //
		MSG_TYPE("EDI訊息別"), //
		USER_ID("使用者ID"), //
		STATUS("註記 (1:取消 2:註銷 3:不進出倉)"), //
		TRANS_ID("資料來源提供的識別碼,唯一,不得修改"), //
		CFM_DATE("進出倉確認之日期時間"), //
		TAX_RSN("保稅貨物內銷補稅原因代碼"), //
		MAN_MARK("人工註記放行欄位.Y:人工放行.N:非人工放行"), //
		AS_TYPE("海空運別.S:海運.A:空運"), //
		IO_TYPE("進出口別.I:進口.O:出口"), //
		VR_NO("海掛"), //
		SO_NO("裝貨單號"), //
		DECL_SEQ_NO("報單序號(5205使用)"), //
		TOT_INVOICE_AMT("發票總金額"), //
		DECL_REMARK1("其他申報事項1"), //
		DECL_REMARK2("其他申報事項2") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String msgFun;
	private String bfNo;
	private String strType;
	private String declType;
	private String declNo;
	private String importDate;
	private String declDate;
	private java.sql.Timestamp rlsDate;
	private String stgPlace;
	private BigDecimal noPkg;
	private String pkgUnit;
	private BigDecimal gWgt;
	private String refBillNo;
	private String boxNo;
	private String inbondNo;
	private String outbondNo;
	private String sendId;
	private String sendQulf;
	private String recvId;
	private String recvQulf;
	private String rlsFlag;
	private String mawbNo;
	private String hawbNo;
	private String ownerBan;
	private String confirmed;
	private String mnRpt;
	private String rmks;
	private BigDecimal fobAmt;
	private String shipPort;
	private String destPort;
	private String transType;
	private BigDecimal cifAmt;
	private String mark;
	private String billingStat;
	private String msgType;
	private String userId;
	private String status;
	private String transId;
	private String cfmDate;
	private String taxRsn;
	private String manMark;
	private String asType;
	private String ioType;
	private String vrNo;
	private String soNo;
	private BigDecimal declSeqNo;
	private BigDecimal totInvoiceAmt;
	private String declRemark1;
	private String declRemark2;

	@Override
	public String getMsgFun() {
		return this.msgFun;
	}
 
	@Override
	public void setMsgFun(final String msgFun) {
		this.msgFun = msgFun; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getImportDate() {
		return this.importDate;
	}
 
	@Override
	public void setImportDate(final String importDate) {
		this.importDate = importDate; 
	}
 
	@Override
	public String getDeclDate() {
		return this.declDate;
	}
 
	@Override
	public void setDeclDate(final String declDate) {
		this.declDate = declDate; 
	}
 
	@Override
	public java.sql.Timestamp getRlsDate() {
		return this.rlsDate;
	}
 
	@Override
	public void setRlsDate(final java.sql.Timestamp rlsDate) {
		this.rlsDate = rlsDate; 
	}
 
	@Override
	public String getStgPlace() {
		return this.stgPlace;
	}
 
	@Override
	public void setStgPlace(final String stgPlace) {
		this.stgPlace = stgPlace; 
	}
 
	@Override
	public BigDecimal getNoPkg() {
		return this.noPkg;
	}
 
	@Override
	public void setNoPkg(final BigDecimal noPkg) {
		this.noPkg = noPkg; 
	}
 
	@Override
	public String getPkgUnit() {
		return this.pkgUnit;
	}
 
	@Override
	public void setPkgUnit(final String pkgUnit) {
		this.pkgUnit = pkgUnit; 
	}
 
	@Override
	public BigDecimal getGWgt() {
		return this.gWgt;
	}
 
	@Override
	public void setGWgt(final BigDecimal gWgt) {
		this.gWgt = gWgt; 
	}
 
	@Override
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
	}
 
	@Override
	public String getBoxNo() {
		return this.boxNo;
	}
 
	@Override
	public void setBoxNo(final String boxNo) {
		this.boxNo = boxNo; 
	}
 
	@Override
	public String getInbondNo() {
		return this.inbondNo;
	}
 
	@Override
	public void setInbondNo(final String inbondNo) {
		this.inbondNo = inbondNo; 
	}
 
	@Override
	public String getOutbondNo() {
		return this.outbondNo;
	}
 
	@Override
	public void setOutbondNo(final String outbondNo) {
		this.outbondNo = outbondNo; 
	}
 
	@Override
	public String getSendId() {
		return this.sendId;
	}
 
	@Override
	public void setSendId(final String sendId) {
		this.sendId = sendId; 
	}
 
	@Override
	public String getSendQulf() {
		return this.sendQulf;
	}
 
	@Override
	public void setSendQulf(final String sendQulf) {
		this.sendQulf = sendQulf; 
	}
 
	@Override
	public String getRecvId() {
		return this.recvId;
	}
 
	@Override
	public void setRecvId(final String recvId) {
		this.recvId = recvId; 
	}
 
	@Override
	public String getRecvQulf() {
		return this.recvQulf;
	}
 
	@Override
	public void setRecvQulf(final String recvQulf) {
		this.recvQulf = recvQulf; 
	}
 
	@Override
	public String getRlsFlag() {
		return this.rlsFlag;
	}
 
	@Override
	public void setRlsFlag(final String rlsFlag) {
		this.rlsFlag = rlsFlag; 
	}
 
	@Override
	public String getMawbNo() {
		return this.mawbNo;
	}
 
	@Override
	public void setMawbNo(final String mawbNo) {
		this.mawbNo = mawbNo; 
	}
 
	@Override
	public String getHawbNo() {
		return this.hawbNo;
	}
 
	@Override
	public void setHawbNo(final String hawbNo) {
		this.hawbNo = hawbNo; 
	}
 
	@Override
	public String getOwnerBan() {
		return this.ownerBan;
	}
 
	@Override
	public void setOwnerBan(final String ownerBan) {
		this.ownerBan = ownerBan; 
	}
 
	@Override
	public String getConfirmed() {
		return this.confirmed;
	}
 
	@Override
	public void setConfirmed(final String confirmed) {
		this.confirmed = confirmed; 
	}
 
	@Override
	public String getMnRpt() {
		return this.mnRpt;
	}
 
	@Override
	public void setMnRpt(final String mnRpt) {
		this.mnRpt = mnRpt; 
	}
 
	@Override
	public String getRmks() {
		return this.rmks;
	}
 
	@Override
	public void setRmks(final String rmks) {
		this.rmks = rmks; 
	}
 
	@Override
	public BigDecimal getFobAmt() {
		return this.fobAmt;
	}
 
	@Override
	public void setFobAmt(final BigDecimal fobAmt) {
		this.fobAmt = fobAmt; 
	}
 
	@Override
	public String getShipPort() {
		return this.shipPort;
	}
 
	@Override
	public void setShipPort(final String shipPort) {
		this.shipPort = shipPort; 
	}
 
	@Override
	public String getDestPort() {
		return this.destPort;
	}
 
	@Override
	public void setDestPort(final String destPort) {
		this.destPort = destPort; 
	}
 
	@Override
	public String getTransType() {
		return this.transType;
	}
 
	@Override
	public void setTransType(final String transType) {
		this.transType = transType; 
	}
 
	@Override
	public BigDecimal getCifAmt() {
		return this.cifAmt;
	}
 
	@Override
	public void setCifAmt(final BigDecimal cifAmt) {
		this.cifAmt = cifAmt; 
	}
 
	@Override
	public String getMark() {
		return this.mark;
	}
 
	@Override
	public void setMark(final String mark) {
		this.mark = mark; 
	}
 
	@Override
	public String getBillingStat() {
		return this.billingStat;
	}
 
	@Override
	public void setBillingStat(final String billingStat) {
		this.billingStat = billingStat; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
	@Override
	public String getCfmDate() {
		return this.cfmDate;
	}
 
	@Override
	public void setCfmDate(final String cfmDate) {
		this.cfmDate = cfmDate; 
	}
 
	@Override
	public String getTaxRsn() {
		return this.taxRsn;
	}
 
	@Override
	public void setTaxRsn(final String taxRsn) {
		this.taxRsn = taxRsn; 
	}
 
	@Override
	public String getManMark() {
		return this.manMark;
	}
 
	@Override
	public void setManMark(final String manMark) {
		this.manMark = manMark; 
	}
 
	@Override
	public String getAsType() {
		return this.asType;
	}
 
	@Override
	public void setAsType(final String asType) {
		this.asType = asType; 
	}
 
	@Override
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
	}
 
	@Override
	public String getVrNo() {
		return this.vrNo;
	}
 
	@Override
	public void setVrNo(final String vrNo) {
		this.vrNo = vrNo; 
	}
 
	@Override
	public String getSoNo() {
		return this.soNo;
	}
 
	@Override
	public void setSoNo(final String soNo) {
		this.soNo = soNo; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
	@Override
	public BigDecimal getTotInvoiceAmt() {
		return this.totInvoiceAmt;
	}
 
	@Override
	public void setTotInvoiceAmt(final BigDecimal totInvoiceAmt) {
		this.totInvoiceAmt = totInvoiceAmt; 
	}
 
	@Override
	public String getDeclRemark1() {
		return this.declRemark1;
	}
 
	@Override
	public void setDeclRemark1(final String declRemark1) {
		this.declRemark1 = declRemark1; 
	}
 
	@Override
	public String getDeclRemark2() {
		return this.declRemark2;
	}
 
	@Override
	public void setDeclRemark2(final String declRemark2) {
		this.declRemark2 = declRemark2; 
	}
 
}
