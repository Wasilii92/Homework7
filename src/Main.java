public class Main {
    public static void main(String[] args) {
        long sum=0;
        int month=0;
        while (sum<2459000)
        {
            month++;
            sum=sum+15000;
            System.out.println("Месяц "+month+", сумма накоплений равна"+sum);
        }
        int a=0;
        while (a<10) {
            a++;
           System.out.print(a);
        }
        System.out.println();
        System.out.print(a);
        for(int i=10;a>1;i--){
            a--;
        System.out.print(a);}
        System.out.println();
        int y = 12000000;
        int birth = 17;
        int mortality = 8;
        int on = 1000;
        int year = 1;
        while (year <= 10) {
            y = (birth - mortality) * on + y;
            System.out.println("Год " + year + ", численность населения составляет " + y);
            year++;
        }
System.out.println();
        int deposit = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12000000;
        int numberMonth = 1;

        while (deposit <= totalAmount) {
            deposit += deposit * monthlyPercent;
            System.out.printf("Месяц %d, сумма накоплений: %d%n", numberMonth, deposit);
            numberMonth++;
        }
        int newDeposit = 15000;
        double newMonthlyPercent = 0.07;
        int newTotalAmount = 12000000;
        int newNumberMonth = 1;

        while (newDeposit <= newTotalAmount) {
            newDeposit += newDeposit * newMonthlyPercent;
            if(newNumberMonth%6==0){
            System.out.printf("Месяц %d, сумма накоплений: %d%n", newNumberMonth, newDeposit);}
            newNumberMonth++;
        }
int secondDeposit=15000;
        double secondMonthlyPercent=0.07;
        int years=9;
        int secondNumberOfMonth=1;
        int totalMonth=years*12;
        while(secondNumberOfMonth<=totalMonth){
            secondDeposit += secondDeposit * secondMonthlyPercent;
            if(secondNumberOfMonth%6==0){
                System.out.printf("Месяц %d, сумма накоплений: %d%n", secondNumberOfMonth, secondDeposit);
            }
            secondNumberOfMonth++;
        }
        int daysInMonth = 31;
        int firstFriday = 5;
        System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        int currentFriday = firstFriday + 7;
        while (currentFriday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет.");
            currentFriday += 7;
        }
        int cometCycle = 79;
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
                int newYear = 0;
        while (newYear <= currentYear) {
            if (newYear >= startYear) {
                System.out.println(newYear);
            }
            newYear += cometCycle;
        }
        int nextCometYear = 0;
        do {
            nextCometYear += cometCycle;
        } while (nextCometYear <= currentYear);
        if (nextCometYear <= endYear) {
            System.out.println(nextCometYear);
        }
    }
}