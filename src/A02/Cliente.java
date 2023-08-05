package A02;

import java.util.Objects;

public class Cliente {
    String name;
    String CPF;
    String email;

    Cliente(){
    }
    Cliente(String name, String CPF, String email){
        this.name = name;
        this.CPF = CPF;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return ((Cliente) o).CPF.equals(this.CPF);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
