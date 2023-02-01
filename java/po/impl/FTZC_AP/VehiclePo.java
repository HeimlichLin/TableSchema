package com.doc.common.po.impl; 
 
public class VehiclePo implements IVehiclePo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
		VEHICLE_NO("車輛號碼"), //
		VEHICLE_OUT("畫面上需要的欄位值,由報單程式寫入,相同項次下不得重覆"), //
		ENGINE_NO("引擎號碼"), //
		TRANS_ID("資料來源提供的識別碼,唯一,不得修改") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String declNo;
	private BigDecimal itemNo;
	private String vehicleNo;
	private String vehicleOut;
	private String engineNo;
	private String transId;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getVehicleNo() {
		return this.vehicleNo;
	}
 
	@Override
	public void setVehicleNo(final String vehicleNo) {
		this.vehicleNo = vehicleNo; 
	}
 
	@Override
	public String getVehicleOut() {
		return this.vehicleOut;
	}
 
	@Override
	public void setVehicleOut(final String vehicleOut) {
		this.vehicleOut = vehicleOut; 
	}
 
	@Override
	public String getEngineNo() {
		return this.engineNo;
	}
 
	@Override
	public void setEngineNo(final String engineNo) {
		this.engineNo = engineNo; 
	}
 
	@Override
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
}
