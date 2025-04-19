public class Main{
    public static void main(String[] args){
        boolean[][] schedule = new boolean [8][60];
        for (int i = 10; i < 15; i++){
            schedule[1][i] = true;
        }
        for (int i = 30; i < 45; i++){
            schedule[1][i] = true;
        }
        for (int i = 50; i < 60; i++){
            schedule[1][i] = true;
        }
        AppointmentBook a = new AppointmentBook(schedule);
        a.printPeriod(2);
        System.out.println(a.findFreeBlock(2, 10));
        System.out.println(a.findFreeBlock(2, 5));
        System.out.println(a.findFreeBlock(2, 20));

        schedule = new boolean [8][60];
        for (int i = 25; i < 30; i++){
            schedule[1][i] = true;
        }
        for (int i = 0; i < 15; i++){
            schedule[2][i] = true;
        }
        for (int i = 41; i < 60; i++){
            schedule[2][i] = true;
        }
        for (int i = 5; i < 30; i++){
            schedule[3][i] = true;
        }
        for (int i = 44; i < 60; i++){
            schedule[3][i] = true;
        }
        AppointmentBook b = new AppointmentBook(schedule);
        int period = 2;
        while (period < 5){
            System.out.print(period);
            period++;
            
        b.printPeriod(4);
        System.out.println("Test 1: makeAppointment(2, 4, 22)");
        boolean result1 = b.makeAppointment(2, 4, 22);
        System.out.println("Result: " + result1); // expect true
        b.printPeriod(4);

        System.out.println("\nTest 2: makeAppointment(3, 4, 3)");
        boolean result2 = b.makeAppointment(3, 4, 3);
        System.out.println("Result: " + result2);
        b.printPeriod(3);

        System.out.println("\nTest 3: makeAppointment(2, 4, 30)");
        boolean result3 = b.makeAppointment(2, 4, 30);
        System.out.println("Result: " + result3);

        System.out.println("\nFinal state of period 2:");
        b.printPeriod(2);
        System.out.println("\nFinal state of period 3:");
        b.printPeriod(3);
        System.out.println("\nFinal state of period 4:");
        b.printPeriod(4);
        }
    }
}