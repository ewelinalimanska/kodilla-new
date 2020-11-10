package com.kodilla.kodillapatterns2.adapter.company;

import com.kodilla.kodillapatterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary(){

        //given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //when
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());

        //then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }

}
