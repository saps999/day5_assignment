import java.util.Scanner;

public class wind_chill {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit (t>50) : ");
        int t = ref.nextInt();

        System.out.print("Enter the velocity of wind in miles/hr (v>120/v<3) : ");
        int v = ref.nextInt();
        if (t>50 && (v>120 || v<3)) {

            double w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75 * Math.pow(v, 0.16)));

            System.out.println("wind chill=" + w);
        } else {
            System.out.println("Enter correct values of the Temperature & Wind speed.");
        }
    }
}
