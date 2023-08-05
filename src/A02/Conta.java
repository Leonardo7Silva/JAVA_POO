package A02;

import java.util.Objects;

public class Conta {
    Cliente cliente;
    String nConta;
    double saldo = 0;


    Conta(Cliente cliente, String nConta){
        this.nConta = nConta;
        this.cliente = cliente;
    }

    public void depositar(double deposito){
        saldo+=deposito;
    }

    public void sacar(double saque){
        if(saque < this.saldo){
            saldo-=saque;
        }else {
            saldo = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta conta)) return false;
        return ((Conta) o).nConta.equals(this.nConta);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", nConta='" + nConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
