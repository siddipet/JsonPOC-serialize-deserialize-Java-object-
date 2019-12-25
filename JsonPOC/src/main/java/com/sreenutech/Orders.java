package com.sreenutech;

public class Orders {

	private String oid;
	private String name;
	private String desc;
	private boolean isDelivered;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", name=" + name + ", desc=" + desc + ", isDelivered=" + isDelivered + "]";
	}
	
	
	
}
