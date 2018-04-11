package com.yiibai.springmvc.dao;

import java.util.List;

import com.yiibai.springmvc.model.Company;

public interface CompanyDao {

	Company findById(int id);

	void saveCompany(Company company);
	
	void deleteCompanyBySsn(String ssn);
	
	List<Company> findAllCompanys();

	Company findCompanyBySsn(String ssn);

}
