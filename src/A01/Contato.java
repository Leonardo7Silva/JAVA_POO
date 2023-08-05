package A01;

public class Contato {
    String numero;
    String nome;
    String cidade;

    public void ligar(){
        System.out.println("Ligando...");
    }

    public void detalhar(){
        System.out.printf("Número: %s \n Nome: %s \n Cidade: %s", numero, nome, cidade);
    }

    public void verNumero(){
        System.out.printf("Número: %s", numero);
    }
}
