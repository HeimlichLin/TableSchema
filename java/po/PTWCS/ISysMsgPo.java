package com.doc.common.po; 
 
public interface ISysMsgPo {
 
	String getMsgId();
 
	void setMsgId(final String msgId);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	String getDevToken();
 
	void setDevToken(final String devToken);
 
	String getMsgTitle();
 
	void setMsgTitle(final String msgTitle);
 
	String getMsgContent();
 
	void setMsgContent(final String msgContent);
 
	String getSendFlag();
 
	void setSendFlag(final String sendFlag);
 
}
