package aula.poo.entrega;

import aula.poo.model.Cliente;
import aula.poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        //adicionar os dados do endereço
       // endereco.cep = "000000000";

        Cliente cliente = new Cliente();
        //adicionar os dados do cliente

        //força o tratamento e trata a excessão
        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        }catch (Exception e){
            System.err.println("Houve um erro ao adicionar o endereco: " + e.getMessage());
        };
        //para chamar o cliente e adicionar o endereco


    }
}
