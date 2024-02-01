package de.telran.task1;
//       1. Напишите утилитный класс, в котором реализованы методы
//       получения среднего значения AVG, максимального MAX и
//       минимального значения MIN из следующих наборов данных:
//
//
//        пары целых чисел
//
//        пары дробных чисел
//
//        одного целого и одного дробного числа
//
//        массива целых чисел
//
//        массива дробных чисел
//        Используйте механизм перегрузки.


public class DataProcessor {
    // Методы для пары целых чисел
    public static double avg(int a, int b) {
        return (a + b) / 2.0;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    // Методы для пары дробных чисел
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    // Методы для одного целого и одного дробного числа
    public static double avg(int a, double b) {
        return (a + b) / 2.0;
    }

    public static double max(int a, double b) {
        return Math.max(a, b);
    }

    public static double min(int a, double b) {
        return Math.min(a, b);
    }

    // Методы для массива целых чисел
    public static double avg(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / (double) array.length;
    }

    public static int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static int min(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    // Методы для массива дробных чисел
    public static double avg(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double max(double[] array) {
        double maxValue = Double.MIN_VALUE;
        for (double num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static double min(double[] array) {
        double minValue = Double.MAX_VALUE;
        for (double num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }
}