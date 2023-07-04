package com.dreaMTank.polyparameter;

public class manager extends Employee{
    private double bonus;

    public manager(String name, double score, double bonus) {
        super(name, score);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理： " + getName() + "正在管理");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
}
