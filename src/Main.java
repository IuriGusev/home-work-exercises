public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte bird = 1;
        short airPlane = 3;
        int rocket = 5;
        long startrek = 1000L;
        float weightPotato = 1.7f;
        double distanceToMoon = 1000.99;
        boolean flyingBird = bird < 1;
        char bar = 36;
        System.out.println(bar);
        System.out.println(flyingBird);

        // Задание 2
        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;
        double weightAllBoxers = weightBoxer1 + weightBoxer2;
        double weightDiff = weightBoxer2 - weightBoxer1;
        System.out.println("Общий вес боксеров " + weightAllBoxers + " кг");
        System.out.println("Разница в весе боксеров " + weightDiff + " кг");

        // Задание 3
        int bananasAmount = 5;
        int weightOneBananaGr = 80;
        int milkAmountMl = 200;
        double wight1MlMilkGr = 1.05;
        int iceCreamAmount = 2;
        int weightOneIceCreamGr = 100;
        int eggAmount = 4;
        int weightOneEggGr = 70;
        double allweightGr = bananasAmount * weightOneBananaGr + iceCreamAmount * weightOneIceCreamGr + eggAmount * weightOneEggGr + milkAmountMl * wight1MlMilkGr;
        int grPerKg = 1000;
        System.out.println("Вес спорт завтрака " + allweightGr + " гр");
        System.out.println("Вес спорт завтрака " + allweightGr / (float) grPerKg + " кг");

        // Задание 4
        int weightGoalKg = 7;
        int weightGoalGr = 7000;
        int weightLoseIn1DayVer1Gr = 250;
        int weightLoseIn1DayVer2Gr = 500;
        int averageLoseWeightIn1DayGr = 375;
        System.out.println("Количество дней при потере веса 250 гр в день " + weightGoalGr / weightLoseIn1DayVer1Gr + " дней");
        System.out.println("Количество дней при потере веса 500 гр в день " + weightGoalGr / weightLoseIn1DayVer2Gr + " дней");
        System.out.println("Количество дней при средней потере веса 375 гр в день " + weightGoalGr / averageLoseWeightIn1DayGr + " дней");

        // Задание 5
        int mashaMonthSalaryBefore = 67_760;
        double mashaMonthSalaryUp = mashaMonthSalaryBefore * 0.1;
        double mashaMonthSalaryAfter = mashaMonthSalaryBefore + mashaMonthSalaryUp;
        double mashaYearSalaryUp = mashaMonthSalaryUp * 12;
        int denisMonthSalaryBefore = 83_690;
        double denisMonthSalaryUp = denisMonthSalaryBefore * 0.1;
        double denisMonthSalaryAfter = denisMonthSalaryBefore + denisMonthSalaryUp;
        double denisYearSalaryUp = denisMonthSalaryUp * 12;
        int cristinaMonthSalaryBefore = 76_230;
        double cristinaMonthSalaryUp = cristinaMonthSalaryBefore * 0.1;
        double cristinaMonthSalaryAfter = cristinaMonthSalaryBefore + cristinaMonthSalaryUp;
        double cristinaYearSalaryUp = cristinaMonthSalaryUp * 12;
        System.out.println("Маша после повышения теперь получает " + mashaMonthSalaryAfter + " рублей в месяц. Годовой доход вырос на " + mashaYearSalaryUp + " рублей.");
        System.out.println("Денис после повышения теперь получает " + denisMonthSalaryAfter + " рублей в месяц. Годовой доход вырос на " + denisYearSalaryUp + " рублей.");
        System.out.println("Кристина после повышения теперь получает " + cristinaMonthSalaryAfter + " рублей в месяц. Годовой доход вырос на " + cristinaYearSalaryUp + " рублей.");
    }
}