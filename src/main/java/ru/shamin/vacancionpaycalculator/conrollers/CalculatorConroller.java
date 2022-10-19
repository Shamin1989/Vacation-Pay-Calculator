package ru.shamin.vacancionpaycalculator.conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shamin.vacancionpaycalculator.service.CalculatorService;


@Controller
public class CalculatorConroller {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorConroller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(value = "/calculate/{averageSalary}/{vacationDays}")
    public String calculate(@PathVariable(name = "averageSalary") int averageSalary, @PathVariable(name = "vacationDays") int vacationDays, Model model) {
        model.addAttribute("result", calculatorService.calculateVacationPay(averageSalary, vacationDays));
        return "result";
    }
}
