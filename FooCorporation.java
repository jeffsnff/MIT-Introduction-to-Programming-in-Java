import java.util.Scanner;

class FooCorporation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double employeeTotal = 0.0;
        double minimumWage = 8.00;
        int maxHours = 60;

        System.out.print("Employee ID: ");
        String employeeID = scanner.nextLine();
        System.out.print("Employee Base Pay: ");
        double employeeBasepay = Double.valueOf(scanner.nextLine());
        System.out.print("Employee Hours Worked: ");
        int employeeHours = Integer.valueOf(scanner.nextLine());
        scanner.close();

        if(employeeBasepay < minimumWage || employeeHours > maxHours){
            System.err.println("Employee needs a minimum of $8.00 an hour and max 60 hours per pay period");
            return;
        }
            
        employeeTotal = calculatepay(employeeBasepay, employeeHours);
        System.out.println("Emplyee "+employeeID+" total pay before taxes: "+employeeTotal);
    }

    public static double calculatepay(double basePay, int hoursWorked){
        double totalPay = 0.0;
        int overTime = hoursWorked - 40;

        // Calculates basepay without overtime
        totalPay = (hoursWorked - overTime) * basePay;


        return totalPay;
    }
}