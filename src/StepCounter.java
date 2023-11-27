public class StepCounter {
    private int[][] steps = new int[12][];
    private int goal;

    public StepCounter() {
        steps[0] = new int[31];
        steps[1] = new int[28];
        steps[2] = new int[31];
        steps[3] = new int[30];
        steps[4] = new int[31];
        steps[5] = new int[30];
        steps[6] = new int[31];
        steps[7] = new int[31];
        steps[8] = new int[30];
        steps[9] = new int[31];
        steps[10] = new int[30];
        steps[11] = new int[31];
    }

    public void recordSteps(int month, int day, int stepsCount) {
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            steps[month - 1][day - 1] = stepsCount;
            System.out.println("Данные записаны!");
        } else {
            System.out.println("Ошибка!");
        }
        if (stepsCount > goal) {
            System.out.println("Поздравляем! Цель превышена!");
        }
    }

    public void setGoal(int stepsGoal) {
        goal = stepsGoal;
    }

    public void getStepsByMonth(int month) {
        if (month >= 1 && month <= 12) {
            System.out.println("Шагов в месяце " + month + ":");
            for (int i = 0; i < steps[month - 1].length; i++) {
                int stepsCount = steps[month - 1][i];
                System.out.println("день " + (i + 1) + ": " + stepsCount);
            }
        } else {
            System.out.println("неверный месяц!");
        }
    }
}

