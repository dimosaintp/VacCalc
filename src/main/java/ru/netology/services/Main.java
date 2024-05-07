package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        VacCalcService service = new VacCalcService();

        //готовим данные
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        //вычисляем результат

        int count = service.calculate(income, expenses, threshold);

        System.out.println("Вам понадобится " + count + " месяцев");
    }
}