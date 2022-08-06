public class Main {
    public static void main(String[] args) {
        // задача 1
        byte a = 1;
        short b = 22;
        int c = 333;
        long d = 44444L;
        float e = 55.5f;
        double f = 666.66;
        boolean g = 11 >= 9;
        char j = 168;

        // задача 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double totalWeight;
        totalWeight = firstBoxer + secondBoxer;
        double weightDifference = Math.abs(secondBoxer - firstBoxer);
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        System.out.println("Разница в весе бойцов " + weightDifference);

        // задача 3
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200; // миллилитры, остальные продукты в штуках
        int milkWeight = 105 / 100; // вес одного мл в граммах
        int iceCream = 2;
        int iceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        int breakfastWeight = (bananaWeight * banana) + (milkWeight * milk) + (iceCreamWeight * iceCream) + (eggWeight * egg);
        int gramsPerKilogram = 1000;
        int breakfastWeightKg = breakfastWeight / gramsPerKilogram;
        System.out.println("Вес завтрака спортсмена " + breakfastWeightKg + " кг");
        // можно все упростить но так веселее

        // задача 4
        int needLoseWeightKg = 7;
        int needLoseWeightGr = needLoseWeightKg * gramsPerKilogram;
        int minLoseWeightDay = 250;
        int maxLoseWeightDay = 500;
        int minNeedDay = needLoseWeightGr / minLoseWeightDay;
        int maxNeedDay = needLoseWeightGr / maxLoseWeightDay;
        int averagedNedDay = (minNeedDay + maxNeedDay) / 2;
        System.out.println("Для потери 7 кг веса по 250 гр в день уйдет " + minNeedDay + " дней.");
        System.out.println("Для потери 7 кг веса по 500 гр в день уйдет " + maxNeedDay + " дней.");
        System.out.println("В среднем на потерю 7 кг уйдет " + averagedNedDay + " день.");


        // задача 5
        int salaryMascha = 67_760;
        int salaryDenis = 83_690;
        int salaryKris = 76_230;
        double increase = 0.10;
        double increaseMascha = salaryMascha * increase;
        double newSalaryMascha = increaseMascha + salaryMascha;
        System.out.println("Маша теперь получает " + newSalaryMascha + " рублей. Годовой доход вырос на " + (increaseMascha * 12) + " рублей");
        double increaseDenis = salaryDenis * increase;
        double newSalaryDenis = increaseDenis + salaryDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (increaseDenis * 12) + " рублей");
        double increaseKris = salaryKris * increase;
        double newSalaryKris = increaseKris + salaryKris;
        System.out.println("Кристина теперь получает " + newSalaryKris + " рубля. Годовой доход вырос на " + (increaseKris * 12) + " рубля");

    }
}