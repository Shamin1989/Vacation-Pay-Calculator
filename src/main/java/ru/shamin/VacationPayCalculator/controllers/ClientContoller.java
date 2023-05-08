package ru.shamin.VacationPayCalculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shamin.VacationPayCalculator.service.ClientService;

@Controller
public class ClientContoller {

    private final ClientService clientService;

    @Autowired
    public ClientContoller(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam(name = "averageSalary") int averageSalary, @RequestParam(name = "numberOfVacationDays") int numberOfVacationDays, Model model) {
        model.addAttribute("result",clientService.calculateVacationPay(averageSalary,numberOfVacationDays));
        return "result";
    }

}
