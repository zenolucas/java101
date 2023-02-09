import java.util.Scanner;

public class basicrandom {
    public static void main(String[] args) {
     String[] names = {"Zen", "Eron", "Gilbert", "Marc", "Andrei", "Dave"};
     int rand = (int) (Math.random() * 6) - 1;
     System.out.println(names[rand]);
    }
}
