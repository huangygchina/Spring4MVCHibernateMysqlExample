package com.yiibai.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.yiibai.springmvc.model.Company;
import com.yiibai.springmvc.model.Employee;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDao<Integer, Company> implements CompanyDao {

	public Company findById(int id) {
		return getByKey(id);
	}

	public void saveCompany(Company company) {
		persist(company);
	}

	public void deleteCompanyBySsn(String id) {
		Query query = getSession().createSQLQuery("delete from Company where id = :id");
		query.setString("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Company> findAllCompanys() {
		Criteria criteria = createEntityCriteria();
		return (List<Company>) criteria.list();
	}

	public Company findCompanyBySsn(String ssn) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("ssn", ssn));
		return (Company) criteria.uniqueResult();
	}
}