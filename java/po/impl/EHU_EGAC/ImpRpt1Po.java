package com.doc.common.po.impl; 
 
public class ImpRpt1Po implements IImpRpt1Po {
 
	public enum COLUMNS {
		DECL_FLIGHTNO("艙單班機資訊"), //
		DECL_FLIGHTDATE("艙單航班日期"), //
		DECL_MWB("艙單主號"), //
		DECL_EXPBAGNO("艙單袋號"), //
		DECL_PIECE("艙單件數"), //
		IMP_CONTAINER("點貨進倉櫃號"), //
		IMP_FLIGHTNO("點貨進倉航班資訊"), //
		IMP_EXPBAGNO("點貨進倉袋號"), //
		IMP_CHKPIECE("點貨進倉數"), //
		IMP_GCIPIECE("點貨進倉進倉數"), //
		IMP_DIFFPIECE("差異(點貨-艙單件數)"), //
		IMP_INPUTMODE("點貨進倉輸入方式"), //
		IMP_CHKDATE("點貨進倉時間"), //
		IMP_GCIDATE("貨物進倉時間"), //
		IMP_GCODATE("貨物出倉時間"), //
		IMP_PIECE("EDI申報件數"), //
		REPNO("報表編號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String declFlightno;
	private java.sql.Timestamp declFlightdate;
	private String declMwb;
	private String declExpbagno;
	private BigDecimal declPiece;
	private String impContainer;
	private String impFlightno;
	private String impExpbagno;
	private BigDecimal impChkpiece;
	private BigDecimal impGcipiece;
	private BigDecimal impDiffpiece;
	private String impInputmode;
	private java.sql.Timestamp impChkdate;
	private java.sql.Timestamp impGcidate;
	private java.sql.Timestamp impGcodate;
	private BigDecimal impPiece;
	private String repno;

	@Override
	public String getDeclFlightno() {
		return this.declFlightno;
	}
 
	@Override
	public void setDeclFlightno(final String declFlightno) {
		this.declFlightno = declFlightno; 
	}
 
	@Override
	public java.sql.Timestamp getDeclFlightdate() {
		return this.declFlightdate;
	}
 
	@Override
	public void setDeclFlightdate(final java.sql.Timestamp declFlightdate) {
		this.declFlightdate = declFlightdate; 
	}
 
	@Override
	public String getDeclMwb() {
		return this.declMwb;
	}
 
	@Override
	public void setDeclMwb(final String declMwb) {
		this.declMwb = declMwb; 
	}
 
	@Override
	public String getDeclExpbagno() {
		return this.declExpbagno;
	}
 
	@Override
	public void setDeclExpbagno(final String declExpbagno) {
		this.declExpbagno = declExpbagno; 
	}
 
	@Override
	public BigDecimal getDeclPiece() {
		return this.declPiece;
	}
 
	@Override
	public void setDeclPiece(final BigDecimal declPiece) {
		this.declPiece = declPiece; 
	}
 
	@Override
	public String getImpContainer() {
		return this.impContainer;
	}
 
	@Override
	public void setImpContainer(final String impContainer) {
		this.impContainer = impContainer; 
	}
 
	@Override
	public String getImpFlightno() {
		return this.impFlightno;
	}
 
	@Override
	public void setImpFlightno(final String impFlightno) {
		this.impFlightno = impFlightno; 
	}
 
	@Override
	public String getImpExpbagno() {
		return this.impExpbagno;
	}
 
	@Override
	public void setImpExpbagno(final String impExpbagno) {
		this.impExpbagno = impExpbagno; 
	}
 
	@Override
	public BigDecimal getImpChkpiece() {
		return this.impChkpiece;
	}
 
	@Override
	public void setImpChkpiece(final BigDecimal impChkpiece) {
		this.impChkpiece = impChkpiece; 
	}
 
	@Override
	public BigDecimal getImpGcipiece() {
		return this.impGcipiece;
	}
 
	@Override
	public void setImpGcipiece(final BigDecimal impGcipiece) {
		this.impGcipiece = impGcipiece; 
	}
 
	@Override
	public BigDecimal getImpDiffpiece() {
		return this.impDiffpiece;
	}
 
	@Override
	public void setImpDiffpiece(final BigDecimal impDiffpiece) {
		this.impDiffpiece = impDiffpiece; 
	}
 
	@Override
	public String getImpInputmode() {
		return this.impInputmode;
	}
 
	@Override
	public void setImpInputmode(final String impInputmode) {
		this.impInputmode = impInputmode; 
	}
 
	@Override
	public java.sql.Timestamp getImpChkdate() {
		return this.impChkdate;
	}
 
	@Override
	public void setImpChkdate(final java.sql.Timestamp impChkdate) {
		this.impChkdate = impChkdate; 
	}
 
	@Override
	public java.sql.Timestamp getImpGcidate() {
		return this.impGcidate;
	}
 
	@Override
	public void setImpGcidate(final java.sql.Timestamp impGcidate) {
		this.impGcidate = impGcidate; 
	}
 
	@Override
	public java.sql.Timestamp getImpGcodate() {
		return this.impGcodate;
	}
 
	@Override
	public void setImpGcodate(final java.sql.Timestamp impGcodate) {
		this.impGcodate = impGcodate; 
	}
 
	@Override
	public BigDecimal getImpPiece() {
		return this.impPiece;
	}
 
	@Override
	public void setImpPiece(final BigDecimal impPiece) {
		this.impPiece = impPiece; 
	}
 
	@Override
	public String getRepno() {
		return this.repno;
	}
 
	@Override
	public void setRepno(final String repno) {
		this.repno = repno; 
	}
 
}
