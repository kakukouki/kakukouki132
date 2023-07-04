package com.dreaMTank.polyparameter;

public class worker extends Employee{
    public worker(String name, double score) {
        super(name, score);
    }
    public void work(){
        System.out.println("员工： "+ getName() + "正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
