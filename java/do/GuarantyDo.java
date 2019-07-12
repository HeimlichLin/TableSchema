package com.doc.common.bean; 
 
public class GuarantyDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		GRNTAMT("null"), 
		GRNTAMTI("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bondno; 
	private BigDecimal grntamt; 
	private BigDecimal grntamti; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public BigDecimal getGrntamt() { 
		return grntamt; 
	} 
 
	public void setGrntamt(BigDecimal grntamt) { 
		this.grntamt = grntamt; 
	} 
 
	public BigDecimal getGrntamti() { 
		return grntamti; 
	} 
 
	public void setGrntamti(BigDecimal grntamti) { 
		this.grntamti = grntamti; 
	} 
 
} 
