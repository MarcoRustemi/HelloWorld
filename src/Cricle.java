import java.util.Scanner;

public class Cricle {
    public static void main(String[] args) {
        int radius;
        double area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie einen Radius ein: ");
        radius = scanner.nextInt();
        if(radius > 0)
        {
            area = radius * radius * Math.PI;
            System.out.println("Ihr gewählter Radius beträgt: " + radius);
            System.out.println("Die Fläche beträgt: " + area);
        }
        else{
            System.out.println("Radius muss positiv sein");
        }
    }
}
