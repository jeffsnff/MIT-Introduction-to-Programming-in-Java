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

        if(employeeBasepay < minimumWage || employeeHours > maxHours){
            System.err.println("Employee needs a minimum of $8.00 an hour and max 60 hours per pay period");
            return;
        }else{
            employeeTotal = calculatepay(employeeBasepay, maxHours);
        }
        System.out.println("Emplyees total pay before taxes: "+employeeTotal);

    }

    public static int calculatepay(double basePay, int hoursWorked){
        int totalPay = 0;
        int overTime = hoursWorked - 40;


        return totalPay;
    }
}