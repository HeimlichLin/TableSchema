package com.doc.common.po.impl; 
 
public class MenuinfPo implements IMenuinfPo {
 
	public enum COLUMNS {
		MENUID("ID
"), //
		ROOTID("上層選單(最上層:-,否則輸入MENUID
"), //
		MENUNAME("名稱"), //
		URL("路徑"), //
		IS_HIDE("是否隱藏"), //
		MENU_SORT("排序"), //
		IS_COMMON("是否功能
") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String menuid;
	private String rootid;
	private String menuname;
	private String url;
	private String isHide;
	private String menuSort;
	private String isCommon;

	@Override
	public String getMenuid() {
		return this.menuid;
	}
 
	@Override
	public void setMenuid(final String menuid) {
		this.menuid = menuid; 
	}
 
	@Override
	public String getRootid() {
		return this.rootid;
	}
 
	@Override
	public void setRootid(final String rootid) {
		this.rootid = rootid; 
	}
 
	@Override
	public String getMenuname() {
		return this.menuname;
	}
 
	@Override
	public void setMenuname(final String menuname) {
		this.menuname = menuname; 
	}
 
	@Override
	public String getUrl() {
		return this.url;
	}
 
	@Override
	public void setUrl(final String url) {
		this.url = url; 
	}
 
	@Override
	public String getIsHide() {
		return this.isHide;
	}
 
	@Override
	public void setIsHide(final String isHide) {
		this.isHide = isHide; 
	}
 
	@Override
	public String getMenuSort() {
		return this.menuSort;
	}
 
	@Override
	public void setMenuSort(final String menuSort) {
		this.menuSort = menuSort; 
	}
 
	@Override
	public String getIsCommon() {
		return this.isCommon;
	}
 
	@Override
	public void setIsCommon(final String isCommon) {
		this.isCommon = isCommon; 
	}
 
}
