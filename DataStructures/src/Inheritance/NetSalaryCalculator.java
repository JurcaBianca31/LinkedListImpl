package Inheritance;

public class NetSalaryCalculator {

    private double bruteSalary;
    private double netSalary;

    public void setBruteSalary(double bruteSalary) {
        this.bruteSalary = bruteSalary;
    }

    public double getNetSalary() {
        return netSalaryCalc();
    }

    private double netSalaryCalc(){
         this.netSalary = this.bruteSalary / 25;
         return this.netSalary;
    }
}
