
public class Main{
  public static void main(String[] args){
    String nome = "Maria";
    String conta = "Corrente";
    double saldo = 800;

    System.out.println("****************************");
    System.out.println("");
    System.out.println("Nome: " + nome);
    System.out.println("");
    System.out.println("Dados do cliente");
    System.out.println("");
    System.out.println("Tipo conta: " + conta);
    System.out.println("");
    System.out.println("Saldo atual: R$ " + saldo);
    System.out.println("");
    System.out.println("****************************");
    
    System.out.println("");
    System.out.println("");

    System.out.println("Operações");
    System.out.println("");
    
    System.out.println("1- Consultar saldos");
    System.out.println("2- Receber valor");
    System.out.println("3- Transferir valor");
    System.out.println("4- Sair");
    System.out.println("");
    System.out.println("");

    int operacao = Integer.parseInt(System.console().readLine("Digite a opção desejada: ")); //converteo tipo de dado STRING para INT já que o .readLine() sempre lerá uma String, e a variável deve armazenar um INT

    while (operacao > 4){
      System.out.println("Reinicie o programa e escolha uma opção compatível com o menu de operações");
    }

    if (operacao == 1){
      System.out.println("Saldo: R$ " + saldo);
    } else if (operacao == 2){
      double valor = Double.parseDouble(System.console().readLine("Quanto irá receber? "));
      saldo += valor;
      System.out.println("Saldo atual: R$ " + saldo);
    } else if (operacao == 3){
      double valor = Double.parseDouble(System.console().readLine("Quanto irá transferir? "));
      saldo -= valor;
      System.out.println("Saldo atual: R$ " + saldo);
        if (valor > saldo){
          System.out.println("Não há saldo disponível para a transferência");
        }
    } else{
      System.out.println("Obrigado por usar nossos serviços");
    }
  }
}