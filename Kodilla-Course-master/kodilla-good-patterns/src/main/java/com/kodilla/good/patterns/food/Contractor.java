package com.kodilla.good.patterns.food;

public class Contractor implements ContractorProcess {

    private String contractorName;

    public Contractor(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getContractorName() {
        return contractorName;
    }

    @Override
    public boolean process() {
        System.out.println("Order from " + getContractorName() + " is completed");
        return true;
    }

    @Override
    public String toString() {
        return contractorName;
    }
}
