import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double pi,r,a,alan;
        pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap girin: ");
        r=input.nextDouble();
        System.out.println("Merkez açısını girin: ");
        a=input.nextDouble();
        alan=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+alan);
    }

}