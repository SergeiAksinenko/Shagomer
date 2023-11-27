import java.util.Scanner;

public class Pedometer {
    public static void main(String[] args) {
        StepCounter stepCounter = new StepCounter();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            int choose;
            System.out.println("1. Записать данные о дне");
            System.out.println("2. Узнать шаги за месяц");
            System.out.println("3. Задать цель");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Введите месяц: ");
                    int month = scanner.nextInt();
                    System.out.print("Введите день: ");
                    int day = scanner.nextInt();
                    System.out.print("Введите количество шагов: ");
                    int stepsCount = scanner.nextInt();
                    stepCounter.recordSteps(month, day, stepsCount);
                    break;
                case 2:
                    System.out.print("Введите месяц: ");
                    month = scanner.nextInt();
                    stepCounter.getStepsByMonth(month);
                    break;
                case 3:
                    System.out.println("Введите цель,которую хотите достичь: ");
                    int goals = scanner.nextInt();
                    stepCounter.setGoal(goals);
                    System.out.println("Установленна новая цель: " + goals);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Выход.");
                    break;
                default:
                    System.out.println("Ошибка! Выберите правильное действие!");
                    break;
            }
        }
    }
}


