package ru.shamin.vacancionpaycalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculateVacationPay(int averageSalary, int vacationDays) {
        return Math.round((averageSalary / 29.3) * vacationDays);
    }

}
