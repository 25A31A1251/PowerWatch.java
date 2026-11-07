import java.util.Scanner;

public class PowerWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== POWER WATCH ===");

        System.out.print("Enter electricity usage (kWh): ");
        double units = sc.nextDouble();

        System.out.print("Enter cost per unit: ");
        double rate = sc.nextDouble();

        double bill = units * rate;

        System.out.println("\n--- ELECTRICITY REPORT ---");
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: Rs. " + bill);

        if (units > 300) {
            System.out.println("Warning: High Electricity Usage!");
            System.out.println("Suggestion: Reduce unnecessary usage.");
        } else if (units > 150) {
            System.out.println("Moderate Electricity Usage.");
        } else {
            System.out.println("Good! Low Electricity Usage.");
        }

        sc.close();
    }
}
