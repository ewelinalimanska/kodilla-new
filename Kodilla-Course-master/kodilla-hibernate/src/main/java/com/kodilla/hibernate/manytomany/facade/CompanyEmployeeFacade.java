package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeFacade.class);


    public List<Company> searchCompanyByName(String lettersCompany) {
        LOGGER.info("Searching companies has been started");

        List<Company> companies = companyDao.retrieveCompaniesContainingLetters(lettersCompany);

        LOGGER.info("Result: " + companies);

        return companies;
    }

    public List<Employee> searchEmployeeByName(String lettersEmployee) {
        LOGGER.info("Searching employees has been started");

        List<Employee> employees = employeeDao.retrieveEmployeeContainingLetters(lettersEmployee);

        LOGGER.info("Result: " + employees);

        return employees;
    }
}
