import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int valor = scan.nextInt();

        boolean par = valor % 2 == 0;
        if(par == true){
            if(valor > 1 && valor < 6)
                System.out.println("A");
            else if(valor > 5 && valor < 21)
                System.out.println("B");
            else
                System.out.println("C");
        }
        else
            System.out.println("Impar");
    }
}