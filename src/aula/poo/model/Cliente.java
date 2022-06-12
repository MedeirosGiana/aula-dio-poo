package aula.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    public String numCartao;
    private List<Endereco> enderecos;
    public void adicionarEndereco(Endereco endereco){
        //se o endereço for nulo lança uma excessão
        if (endereco == null){
            throw new NullPointerException ("Endereco não pode ser nulo.");
        }
        //se o cep for nulo lanca uma excessão
        if (endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo");
        }

        //validação
        getEnderecos().add(endereco);
    }
//o getEndereço está privado para poder passar pela validação que
//o endereço e cep não pode ser nulos.
    private List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
