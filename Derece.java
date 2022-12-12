
package pkg2.derece;

import java.util.Scanner;
public class Derece {

   
    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        System.out.println("(ax2+bx+c), 2. dereceden bir denklemdir. Denklemdeki sabitleri giriniz.");
        System.out.print("a değeri:"); double a=veri.nextDouble();
        System.out.print("b değeri:"); double b=veri.nextDouble();
        System.out.print("c değeri:"); double c=veri.nextDouble();
        double delta=(b*b-4*a*c);
        if(delta>0){
            double x1=((-1*b)+(Math.sqrt(delta)))/(2*a);
            double x2=((-1*b)-(Math.sqrt(delta)))/(2*a);
            System.out.print("x1="+x1+"\tx2="+x2);
        }
        else if(delta==0){
            double x=(-1*b)/(2*a);
            System.out.println("Çakışık 2 kök var. x1=x2="+x);}
        else if(delta<0){
            System.out.println("Denklemin gerçel kökü yoktur.");
            }
    }
    
}
