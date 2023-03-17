public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    public static void task1() {

        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4;
        float e = 5.5f;
        double f = 6.6d;
        System.out.println("Задача 1");
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        float b = 987678965549F;
        double c = 2.786D;
        short d = 569;
        int  e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Проинициализировал и присвоил значения переменным");
        System.out.println("float a = 27.12F, float b = 987678965549F, double c = 2.786D, short d = 569,");
        System.out.println("int  e = -159, short f = 27897, byte g = 67");
    }
    public static void task3() {
        int numberStudentsFirstTeacher = 23;
        int numberStudentsSecondTeacher = 27;
        int numberStudentsThirdTeacher = 30;
        int totalNumberSheetsPaper = 480;
        int numberOfSheetsForEachStudent = totalNumberSheetsPaper / (numberStudentsFirstTeacher + numberStudentsSecondTeacher + numberStudentsThirdTeacher);
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + numberOfSheetsForEachStudent + " листов бумаги.");
    }

    public static void task4() {
        int bottlePerformanceInTwoMinutes = 16;
        int bottlePerformanceInOneMinutes = bottlePerformanceInTwoMinutes / 2;
        int bottlePerformanceInTwentyMinutes = bottlePerformanceInOneMinutes * 20;
        int bottlePerformanceInDay = bottlePerformanceInOneMinutes * 60 * 24;
        int bottlePerformanceInThreeDay = bottlePerformanceInOneMinutes * 60 * 24 * 3;
        int bottlePerformanceInThirtyDay = bottlePerformanceInDay * 30;
        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + bottlePerformanceInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlePerformanceInDay+ " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlePerformanceInThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlePerformanceInThirtyDay + " штук бутылок");
    }

    public static void task5() {
        int totalNumberOfPaintCans = 120;
        int whitePaintForOneClass = 2;
        int brownPaintForOneClass = 4;
        int numberOfClassesInTheSchool = totalNumberOfPaintCans / (whitePaintForOneClass + brownPaintForOneClass);
        System.out.println("Задача 5");
        System.out.println("В школе, где " + numberOfClassesInTheSchool + " классов, нужно " + (whitePaintForOneClass * numberOfClassesInTheSchool) + " банок белой краски и " + (brownPaintForOneClass * numberOfClassesInTheSchool) + " банок коричневой краски");
    }
    public static void task6() {
        /*Бананы — 5 штук (1 банан — 80 грамм).
                Молоко — 200 мл (100 мл = 105 грамм).
                Мороженое-пломбир — 2 брикета по 100 грамм.
                Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        banana milk ice cream eggs weight quantity
        */
        float bananaOneWeight = 0.08f;
        float milkOneWeight = 0.105f;
        float iseOneWeight = 0.1f;
        float eggsOneWeight = 0.07f;
        int bananaQuantity = 5;
        float milkQuantity = 0.2f;
        int iseQuantity = 2;
        int eggsQuantity = 4;
        float totalWeightGram = (bananaOneWeight * bananaQuantity + milkOneWeight * milkQuantity + iseOneWeight * iseQuantity + eggsOneWeight * eggsQuantity) * 100;
        float totalWeghtKg = totalWeightGram / 100;
        System.out.println("Задача 6");
        System.out.println("Общий вес в граммах = " + totalWeightGram);
        System.out.println("Общий вес в килограммах = " + totalWeghtKg);
    }

    public static void task7 () {
        float excessWeight = 7;
        float minWeightLossPerDay = 0.25f;
        float maxWeightLossPerDay = 0.5f;
        float minDaysToLoseWeight = excessWeight / minWeightLossPerDay;
        float maxDaysToLoseWeight = excessWeight / maxWeightLossPerDay;
        float averageDaysToLoseWeight = (minDaysToLoseWeight + maxDaysToLoseWeight) / 2;
        System.out.println("Зфдча 7");
        System.out.println("Нужно пожудеть на 7 кг.");
        System.out.println("Если худеть по " + minWeightLossPerDay + ", то можно уложиться в " + minDaysToLoseWeight + " дней");
        System.out.println("Если худеть по " + maxWeightLossPerDay + ", то можно уложиться в " + maxDaysToLoseWeight + " дней");
        System.out.println("В средней ппонадобится " + averageDaysToLoseWeight + " дней");
    }

    public static void task8 () {
        float monthlySalaryMasha = 67760.0f;
        float monthlySalaryDen = 83692.0f;
        float monthlySalaryKristina = 76230.0f;
        float newMonthlySalaryMasha = (float) (monthlySalaryMasha * 1.1);
        float newMonthlySalaryDen = (float) (monthlySalaryDen * 1.1);
        float newMonthlySalaryKristina = (float) (monthlySalaryKristina * 1.1);
        System.out.println("Задча 8");
        System.out.println("Трём сотрудникам повысили зарплату на 10%.");
        System.out.println("Маша теперь получает " + newMonthlySalaryMasha + " рублей.");
        System.out.println("Годовой доход вырос на " + (newMonthlySalaryMasha - monthlySalaryMasha)*12);
        System.out.println("Денис теперь получает " + newMonthlySalaryDen + " рублей.");
        System.out.println("Годовой доход вырос на " + (newMonthlySalaryDen - monthlySalaryDen) * 12);
        System.out.println("Кристина теперь получает " + newMonthlySalaryKristina + " рублей.");
        System.out.println("Годовой доход вырос на " + (newMonthlySalaryKristina - monthlySalaryKristina)*12);
    }

}
