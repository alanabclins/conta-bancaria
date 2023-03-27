
package Codes;
import java.util.Scanner;
public class Banco {
    public enum DiasDaSemana{
		Domingo,
		Segunda,
		Terça,
		Quarta,
		Quinta,
		Sexta,
		Sabado,
	}
    public static void menu(){
        System.out.println("1- Criar conta");
        System.out.println("2-Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Consultar conta");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int op=0,cont=0;
        System.out.println("Bem-vindo ao banco");
        while(cont>0){
            System.out.println("Qual sua opção");
            menu();
            
        }

        
    }

}