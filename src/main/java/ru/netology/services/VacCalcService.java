package ru.netology.services;

public class VacCalcService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха.
        int money = 0; // количество денег на счету.

        for (int month = 0; month < 12; month++) {

            if (money < threshold) {
                money = money + income - expenses; // работаем.
            } else {
                money = (money - expenses) / 3; // отдыхаем.
                count++;
            }
        }
        return count; // 1-я задача 3, 2-я задача 2.
    }
}