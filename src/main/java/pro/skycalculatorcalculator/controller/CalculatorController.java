package pro.skycalculatorcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.skycalculatorcalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "<h1>Добро пожаловать в калькулятор.</h1>";
    }

    @GetMapping("/plus")
    public String sumNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не корректные данные запроса";
        }
        int result = calculatorService.sum(num1, num2);
        return generateMessage(num1, num2, '+', result);
    }

    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не корректные данные запроса";
        }
        int result = calculatorService.subtract(num1, num2);
        return generateMessage(num1, num2, '-', result);
    }

    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не корректные данные запроса";
        }
        int result = calculatorService.multiply(num1, num2);
        return generateMessage(num1, num2, '*', result);
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не корректные данные запроса";
        } else if (num2 == 0) {
            return "<h1>Второй аргумент равер 0. Деление на 0 не возможно.</h1>";
        }
        int result = calculatorService.divide(num1, num2);
        return generateMessage(num1, num2, '/', result);
    }

    private String generateMessage(int num1, int num2, char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }

}
