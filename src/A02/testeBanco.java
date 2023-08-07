package A02;

import java.util.Scanner;

public class testeBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        int operacao;

        System.out.println("Olá! Seja bem-vindo(a)!");

        do{
        System.out.println("1-Criar uma conta \n2-Buscar uma conta\n3-Depositar \n4-Sacar \n5-Encerrar");
        System.out.println("Digite o numero de uma das opções:");
        operacao = sc.nextInt();



        if(operacao == 1){

            System.out.println("Criando uma conta");
            String nome = dataColect("nome");
            String CPF = dataColect("CPF");
            String email = dataColect("email");

            Cliente newClient = new Cliente(nome, CPF, email);
            Conta newConta = banco.criarConta(newClient);

            System.out.println("Conta criada!");
            System.out.println(newConta.toString());

            operacao = escolherEncerrar();
        }

        if(operacao == 2){

            System.out.println("Buscando uma conta");
            String nConta = dataColect("conta");

            Conta c = banco.buscarConta(nConta);
            if(c == null){
                System.out.println( "Conta não encontrada ou inexistente");
                operacao = escolherEncerrar();
            }else {
                System.out.println("Conta encontrada!");
                System.out.println(c.toString());
                operacao = escolherEncerrar();
            }
        }

        if(operacao == 3){

            System.out.println("Depositando");
            String nConta = dataColect("conta");

            System.out.println("Digite o Valor do depósito:");
            double deposito = sc.nextDouble();

            Conta c = banco.buscarConta(nConta);
            if(c == null){
                System.out.println( "Conta não encontrada ou inexistente");
                operacao = escolherEncerrar();
            }else{
                banco.depositar(nConta, deposito);

                System.out.println("Depósito efetuado!");

                System.out.println(c.toString());
                operacao = escolherEncerrar();
            }


        }

        if(operacao == 4){

             System.out.println("Sacando:");
             String nConta = dataColect("conta");


             System.out.println("Digite o Valor do saque:");
             double saque = sc.nextDouble();

             Conta c = banco.buscarConta(nConta);
             if(c == null){
                 System.out.println( "Conta não encontrada ou inexistente");
                 operacao = escolherEncerrar();
             }
             else {
                 banco.sacar(nConta, saque);
                 System.out.println("Saque efetuado!");
                 System.out.println(c.toString());
                 operacao = escolherEncerrar();
             }



        }
        }while (operacao != 5);


    }

    public static String dataColect(String dataName){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu " + dataName +":");
        return sc.nextLine();
    }

    public static int escolherEncerrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja continuar as operações? \nDigite 'S' para continuar ou 'N' para encerrar");
        String result = sc.nextLine();

        if(result.equalsIgnoreCase("N")){
            return 5;
        }

        return 0;
    }

}
