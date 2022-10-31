package ru.shamin.VacationPayCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import ru.shamin.VacationPayCalculator.service.ClientService;

import java.util.stream.Stream;

@SpringBootTest
class VacationPayCalculatorApplicationTests {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(120000,30,122867),
                Arguments.of(90000,14,43003),
                Arguments.of(50000,20,34130)
        );
    }
    @ParameterizedTest
    @MethodSource("data")
    @DisplayName("Тест метода расчета суммы отпускных")
    void testCalculate(int averageSalary, int vacationDays, double vacationPay){
       ClientService clientService = new ClientService();
        Assertions.assertEquals(vacationPay, clientService.calculateVacationPay(averageSalary,vacationDays));
    }

}
