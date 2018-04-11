package com.yiibai.springmvc.service;

import java.util.List;

import com.yiibai.springmvc.model.Company;



public interface CompanyService {
	
	Company findById(long id);
	
	Company findByName(String name);
	
	void saveCompany(Company company);
	
	void updateCompany(Company company);
	
	void deleteCompanyById(long id);

	List<Company> findAllCompanys(); 
	
	void deleteAllCompanys();
	
	public boolean isCompanyExist(Company company);
	
}
