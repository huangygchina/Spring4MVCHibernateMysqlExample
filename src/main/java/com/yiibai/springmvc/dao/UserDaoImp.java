package com.yiibai.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.yiibai.springmvc.model.User;

@Repository("userDao")
public class UserDaoImp extends AbstractDao<Integer, User> implements UserDao {

	public User findById(int id) {
		return getByKey(id);
	}

	public void saveUser(User user) {
		persist(user);
	}

	public void deleteUserBySsn(String id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setString("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	public User findUserBySsn(String ssn) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("ssn", ssn));
		return (User) criteria.uniqueResult();
	}
}