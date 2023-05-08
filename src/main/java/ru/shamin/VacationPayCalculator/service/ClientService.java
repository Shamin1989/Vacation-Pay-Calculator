package ru.shamin.VacationPayCalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shamin.VacationPayCalculator.models.Client;

@Service
public class ClientService {

    public double calculateVacationPay(int averageSalary, int vacationDays) {
        Client client = new Client(averageSalary,vacationDays);
        return Math.round((client.getAverageSalary()/ 29.3) * client.getNumberOfVacationDay());
    }
}
