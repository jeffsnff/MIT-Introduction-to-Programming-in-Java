import java.util.Scanner;

class FooCorporation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee ID: ");
        String employeeID = scanner.nextLine();
        System.out.print("Employee Base Pay: ");
        double employeeBasepay = Double.valueOf(scanner.nextLine());
        System.out.print("Employee Hours Worked: ");
        int employeeHours = Integer.valueOf(scanner.nextLine());

        System.out.println("ID "+ employeeID +" Pay "+ employeeBasepay +" Hours "+employeeHours);

    }

    public static int calculatepay(double basePay, int hoursWorked){
        int totalPay = 0;
        int overTime = hoursWorked - 40;


        return totalPay;
    }
}