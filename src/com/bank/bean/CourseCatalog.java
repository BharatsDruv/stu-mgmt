package com.bank.bean;

public class CourseCatalog {

	public int getCatalog_id() {
		return catalog_id;
	}
	public void setCatalog_id(int catalog_id) {
		this.catalog_id = catalog_id;
	}
	public int getCatalog_course_id() {
		return catalog_course_id;
	}
	public void setCatalog_course_id(int catalog_course_id) {
		this.catalog_course_id = catalog_course_id;
	}
	public String getCatalog_name() {
		return catalog_name;
	}
	public void setCatalog_name(String catalog_name) {
		this.catalog_name = catalog_name;
	}
	public int getCatalog_type() {
		return catalog_type;
	}
	public void setCatalog_type(int catalog_type) {
		this.catalog_type = catalog_type;
	}
	public int getCatalog_desc() {
		return catalog_desc;
	}
	public void setCatalog_desc(int catalog_desc) {
		this.catalog_desc = catalog_desc;
	}
	private int catalog_id;
	private int catalog_course_id;
	private String catalog_name;
	private int catalog_type;
	private int catalog_desc;
	
}
