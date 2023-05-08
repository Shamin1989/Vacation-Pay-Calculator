package ru.shamin.VacationPayCalculator.models;

import org.springframework.stereotype.Component;

public class Client {
    private int averageSalary;
    private int numberOfVacationDay;

    public Client(int averageSalary, int numberOfVacationDay) {
        this.averageSalary = averageSalary;
        this.numberOfVacationDay = numberOfVacationDay;
    }

    public int getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(int averageSalary) {
        this.averageSalary = averageSalary;
    }

    public int getNumberOfVacationDay() {
        return numberOfVacationDay;
    }

    public void setNumberOfVacationDay(int numberOfVacationDay) {
        this.numberOfVacationDay = numberOfVacationDay;
    }
}
