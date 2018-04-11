package com.yiibai.springmvc.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yiibai.springmvc.dao.CompanyDao;
import com.yiibai.springmvc.model.Company;

@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyDao dao;
	private static List<Company> companys;
	
	public Company findById(int id) {
		return dao.findById(id);
	}

	public void saveCompany(Company company) {
		dao.saveCompany(company);
	}

	public List<Company> findAllCompanys() {
		return dao.findAllCompanys();
	}
	
	public Company findById(long id) {
		for(Company company : companys){
			if(company.getId() == id){
				return company;
			}
		}
		return null;
	}
	
	public Company findByName(String name) {
		for(Company company : companys){
			if(company.getCompanyName().equalsIgnoreCase(name)){
				return company;
			}
		}
		return null;
	}

	public void updateCompany(Company company) {
		int index = companys.indexOf(company);
		companys.set(index, company);
	}

	public void deleteCompanyById(long id) {
		
		for (Iterator<Company> iterator = companys.iterator(); iterator.hasNext(); ) {
		    Company company = iterator.next();
		    if (company.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isCompanyExist(Company company) {
		return findByName(company.getCompanyName())!=null;
	}
	
	public void deleteAllCompanys(){
		companys.clear();
	}

}
