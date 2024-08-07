import java.util.Scanner;
public class atv{

public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    Float soma,sub,mut,div, n1,n2;
    System.out.print("Digite o primeiro número:");
    n1 = leia.nextFloat();
    System.out.print("Digite o segundo número:");
    n2= leia.nextFloat();
    soma = n1 + n2;
    sub = n1 - n2;
    mut = n1 * n2;
    div = n1 / n2;
    System.out.println("soma: " + soma);
    System.out.println("subtração: " + sub);
    System.out.println(" multiplicação: " + mut);
    System.out.println(" divisão: " + div);
}
}