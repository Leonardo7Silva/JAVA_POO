package A02;

public class Banco {
    Conta[] contas = {};

    public void criarConta(Cliente cliente){
        String str = String.valueOf(this.contas.length);
        Conta novaConta = new Conta(cliente, str);
        Conta[] novaLista = new Conta[this.contas.length + 1];
        for(int i = 0; i< this.contas.length + 1; i++){
            if(i != this.contas.length){
                novaLista[i] = contas[i];
            }else{
                novaLista[i] = novaConta;
            }
        }
        contas = novaLista.clone();
    }

        public Conta buscarConta(String nConta){
            for(Conta c: contas){
                if(c.nConta.equals(nConta)){
                    return c;
                }
            }
            return null;
        }

        public void depositar(String nConta, double deposito){
            for(Conta c: contas){
                if(c.nConta.equals(nConta)){
                    c.depositar(deposito);
                }
            }
        }

    public void sacar(String nConta, double saque){
        for(Conta c: contas){
            if(c.nConta.equals(nConta)){
                c.sacar(saque);
            }
        }
    }

}
