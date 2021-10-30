package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        int i = 2;
        while (number % i != 0) {
            i++;
            if (i == number) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
