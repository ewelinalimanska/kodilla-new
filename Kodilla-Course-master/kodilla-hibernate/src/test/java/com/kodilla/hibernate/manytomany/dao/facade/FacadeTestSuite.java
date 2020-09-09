package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyEmployeeFacade;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyEmployeeFacade companyEmployeeFacade;

    @Test
    public void testCompanySearch(){

        //given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //when

        List<Company> companies = companyEmployeeFacade.searchCompanyByName("tter");

        //then

        Assert.assertEquals(1, companies.size());

        try{
            companyDao.deleteAll();
        } catch (Exception e){

        }
    }

    @Test
    public void testEmployeeSearch(){

       // given

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee stevenClarckson = new Employee("Steven", "Clarckson");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(stevenClarckson);

        //when

        List<Employee> employees = companyEmployeeFacade.searchEmployeeByName("rck");

        //then

      Assert.assertEquals(2, employees.size());

        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
        }
    }
}
