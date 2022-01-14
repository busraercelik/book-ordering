package java101.classes.salary_calculator;

import java.time.LocalDate;

public class Employee {
    String name;
    int salary;
    int workHours;
    int startingYear;

    public Employee(String name, int salary, int workHours, int startingYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startingYear = startingYear;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", workHours=").append(workHours);
        sb.append(", hireYear=").append(startingYear);
        sb.append('}');
        return sb.toString();
    }

    void run() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Starting Year : " + this.startingYear);
        System.out.println("Tax: " + calcTax());
        System.out.println("Bonus: " + payBonus());
        System.out.println("Salary increase: " + raiseSalary());
        System.out.println("Tax and Bonus Included Salary: " + taxAndBonusIncluded());
        System.out.println("Total salary : " + totalSalary());
    }

    int calcTax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return (int) (salary * 0.03);
        }
    }

    int payBonus() {
        int overTime = this.workHours - 40;

        if (this.workHours > 40) {
            overTime *= 30;
            return overTime;
        } else{
            return 0;
        }
    }

    int taxAndBonusIncluded() {
        return (this.salary - calcTax() + payBonus());
    }

    int totalSalary() {
        return taxAndBonusIncluded() + raiseSalary();
    }

    int raiseSalary() {
        int experienceYear = LocalDate.now().getYear() - this.startingYear;

        if (experienceYear > 19) {
            return (int) (this.salary * 0.15);
        } else if (experienceYear > 10) {
            return (int) (this.salary * 0.10);
        } else {
            return (int) (this.salary * 0.05);
        }
    }

}
