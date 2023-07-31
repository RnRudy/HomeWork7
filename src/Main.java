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
        System.out.println("\n" + "Задача 1" + "\n");
        int salary = 15000;
        int i = 0;
        int total = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + "—й, сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println(" ");
        for (count = 10; count > 0; count--) {
            System.out.print(count + " ");
        }
    }

    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");
        int population = 12_000_000;
        int deathCount = 8;
        int birthCount = 17;
        int populationGrow = birthCount - deathCount;
        for (int i = 0; i < 10; i++) {
            population = population + populationGrow + (population / 1000);
            System.out.println("Год " + i + "-й, численность населения состаляет " + population + " человек.");
        }


    }

    public static void task4() {
        System.out.println("\n" + "Задача 4" + "\n");
        int deposit = 15_000;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 7 / 100;
            i++;
            System.out.println("Месяц " + i + "-й, сумма накоплений " + deposit + " рублей.");
        }
    }

    public static void task5() {
        System.out.println("\n" + "Задача 5" + "\n");
        int deposit = 15_000;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 7 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + "-й, сумма накоплений " + deposit + " рублей.");
            }
        }


    }

    public static void task6() {
        System.out.println("\n" + "Задача 6" + "\n");
        int deposit = 15_000;
        int i = 0;
        // Василий хочет копить 9 лет. 9 лет == 108 мес. —>
        while (i < 108) {
            deposit = deposit + deposit * 7 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + "-й, сумма накоплений " + deposit + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println("\n" + "Задача 7" + "\n");
        int friday = 4;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчёт.");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("\n" + "Задача 8" + "\n");
        int currentYear = 2023;
        int futureYear = currentYear + 100;
        int pastYear = currentYear - 200;

        for (currentYear = pastYear; currentYear <= futureYear; currentYear++) {
            if (currentYear % 79 == 0) {
                System.out.println(currentYear);
            }
        }
    }
}