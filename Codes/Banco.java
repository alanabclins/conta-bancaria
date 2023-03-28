
package Codes;

import java.util.Scanner;

public class Banco {
    public enum DiasDaSemana {
        Domingo,
        Segunda,
        Terça,
        Quarta,
        Quinta,
        Sexta,
        Sabado,
    }

    public static void menu() {
        System.out.println("1- Criar conta");
        System.out.println("2-Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Consultar saldo");
    }

    public static void main(String[] args) {

        DiasDaSemana d1 = DiasDaSemana.Domingo;
        DiasDaSemana d2 = DiasDaSemana.Segunda;
        DiasDaSemana d3 = DiasDaSemana.Terça;
        DiasDaSemana d4 = DiasDaSemana.Quarta;
        DiasDaSemana d5 = DiasDaSemana.Quinta;
        DiasDaSemana d6 = DiasDaSemana.Sexta;
        DiasDaSemana d7 = DiasDaSemana.Sabado;

        Scanner s = new Scanner(System.in);
        double aux;
        int op = 0, cont = 1;
        int ag = 0, num = 0, cpf = 0;
        String nome = null, end = null;
        double saldo = 0, value;
        SistemaBanco conta = new SistemaBanco(ag, num, nome, cpf, end, saldo);
        System.out.println("Bem-vindo ao banco");
        while (cont > 0) {
            System.out.println("Qual sua opção");
            menu();
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o número da sua agência:");
                    ag = s.nextInt();
                    conta.setAgencia(ag);
                    num = (int) Math.random();
                    conta.setNumDaConta(num);
                    System.out.println("Digite seu cpf:");
                    cpf = s.nextInt();
                    conta.setCpf(cpf);
                    System.out.println("Digite o saldo da sua conta:");
                    saldo = s.nextDouble();
                    conta.setSaldo(saldo);
                    s.nextLine();
                    System.out.println("Digite seu nome:");
                    nome = s.nextLine();
                    conta.setNome(nome);
                    System.out.println("Digite seu endereço:");
                    end = s.nextLine();
                    conta.setEndereco(end);
                    System.out.println("Conta número " + conta.getNumDaConta() + " criada!");

                    break;
                case 2:
                    System.out.println("Digite o valor que vocé deseja depositar: ");
                    value = s.nextDouble();
                    conta.depositar(value);
                    System.out.println("Saldo=" + conta.getSaldo());
                    break;
                case 3:
                    System.out.println("Qual valor você deseja retirar?");
                    value = s.nextDouble();
                    aux = conta.sacar(value);
                    if (aux < 0) {
                        System.out.println(
                                "Com seu saldo atual de " + conta.getSaldo() + "não foi possível realizar o saque");
                    } else {
                        System.out.println("Saque efetuado. Novo saldo= " + conta.getSaldo());
                    }
                    break;
                case 4:
                    System.out.println("Saldo =" + conta.getSaldo());
                    break;
                default:
                    if (op < 0) {
                        System.out.println("Encerrado programa.");
                        cont = -1;
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;
            }

        }

    }

}