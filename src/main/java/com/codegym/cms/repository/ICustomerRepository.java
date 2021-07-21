package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface ICustomerRepository extends   IGeneralRepository<Customer> {
}
