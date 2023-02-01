package com.doc.common.po.impl; 
 
public class TestUserDataPo implements ITestUserDataPo {
 
	public enum COLUMNS {
		ID("null"), //
		NAME("null"), //
		PASSWORD("null"), //
		AGE("null"), //
		UPDTIME("null"), //
		BAN("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String id;
	private String name;
	private String password;
	private BigDecimal age;
	private String updtime;
	private String ban;

	@Override
	public String getId() {
		return this.id;
	}
 
	@Override
	public void setId(final String id) {
		this.id = id; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public String getPassword() {
		return this.password;
	}
 
	@Override
	public void setPassword(final String password) {
		this.password = password; 
	}
 
	@Override
	public BigDecimal getAge() {
		return this.age;
	}
 
	@Override
	public void setAge(final BigDecimal age) {
		this.age = age; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
	}
 
}
