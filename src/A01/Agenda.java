package A01;

public class Agenda {
    Contato[] contatos;

    public void deletar(Contato contato){

        Contato[] novaLista = new Contato[contatos.length];
        int aux = 0;

        for (int i =0; i < contatos.length; i++){
            String numeroAdeletar = contato.numero;

            String numeroAtualDoFor = contatos[i].numero;

            if(!numeroAdeletar.equals(numeroAtualDoFor)){
                novaLista[aux] = contatos[i];
            }
        }

        contatos = novaLista;
    }

    public Contato buscarPorNome(String nome){
        for (int i =0; i < contatos.length; i++){

            if(contatos[i].nome.equals(nome)){
                return contatos[i];
            }
        }
        return null;
    }
}
