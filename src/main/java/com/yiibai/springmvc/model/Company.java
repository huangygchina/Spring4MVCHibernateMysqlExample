package com.yiibai.springmvc.model;

public class Company {

	private long id;
	
	private String companyName;
	
	private String address;
	
	private String email;
	
	public Company(){
		id=0;
	}
	
	public Company(long id, String companyName, String address, String email){
		this.id = id;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyname(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Company))
			return false;
		Company other = (Company) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "company [id=" + id + ", companyName=" + companyName + ", address=" + address
				+ ", email=" + email + "]";
	}
	

	
}
