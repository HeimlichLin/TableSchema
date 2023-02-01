package com.doc.common.po.impl; 
 
public class WhApplyReasonPo implements IWhApplyReasonPo {
 
	public enum COLUMNS {
		WH_APPLY_SER_NO("參考：入倉申請"), //
		WH_REASON_TYPE("A.快遞貨物申請事項
B.一般倉特別准單事項
C.一般倉非特別准單事項
D.臨時申請事項"), //
		WH_REASON_ID("快遞貨物申請事項：
1.驗貨
2.(依性質及價格區分)貨物分類
3.貨物拆袋通關
4.(與原袋相同)補貼條碼或標籤
5.(與原袋不同)補貼條碼或標籤
6.未實名認證貨物拆袋
7.公證
8.抽樣
9.看樣
10.其他必要事項(需填寫原因)
一般倉特別准單事項：
1.公證
2.抽樣
3.看樣
4.(進口)補貼航空標籤號碼
5.(出口)補貼航空標籤號碼
6.(已報關)更正航空標籤號碼
7.(未報關)更正航空標籤號碼
8.加做或更正標記、箱號
9.出口貨物重新包裝、加裝、打件
10.其他必要事項(需填寫原因)
一般倉非特別准單事項：
1.驗貨
2.監盤
3.看貨
4.轉口貨
5.交付領貨文件
6.其他必要事項(需填寫原因)
臨時申請事項：
1.派遣人力
2.施工
3.清潔人員
4.設備維護
5.其他必要事項(需填寫原因)"), //
		WH_REASON_COMMENT("入倉事由補充說明") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whApplySerNo;
	private String whReasonType;
	private String whReasonId;
	private String whReasonComment;

	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
	@Override
	public String getWhReasonType() {
		return this.whReasonType;
	}
 
	@Override
	public void setWhReasonType(final String whReasonType) {
		this.whReasonType = whReasonType; 
	}
 
	@Override
	public String getWhReasonId() {
		return this.whReasonId;
	}
 
	@Override
	public void setWhReasonId(final String whReasonId) {
		this.whReasonId = whReasonId; 
	}
 
	@Override
	public String getWhReasonComment() {
		return this.whReasonComment;
	}
 
	@Override
	public void setWhReasonComment(final String whReasonComment) {
		this.whReasonComment = whReasonComment; 
	}
 
}
