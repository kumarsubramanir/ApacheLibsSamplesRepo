package com.examples.apache.BeanUtilsExamples.copyproperty.data;

import java.io.Serializable;

public class BeanOne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int m_iId = 0;
	public String m_sName = "";
	public String m_sCompany = "";

	public int getId() {
		return m_iId;
	}

	public void setId(int id) {
		this.m_iId = id;
	}

	public String getName() {
		return m_sName;
	}

	public void setName(String name) {
		this.m_sName = name;
	}

	public String getCompany() {
		return m_sCompany;
	}

	public void setCompany(String company) {
		this.m_sCompany = company;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//sb.append(this.getClass().getName() + "{");
		sb.append(this.getClass().getSimpleName() + "{");
		sb.append("id: " + m_iId + ",");
		sb.append("name: " + m_sName + ",");
		sb.append("company: " + m_sCompany + ",");
		sb.append("}");
		return sb.toString();
	}

}
