package aula.poo.model;

import java.util.IllegalFormatCodePointException;

public class Pessoa {
    public enum tipoPessoa {FISICA,JURIDICA}

    private static final int DOCUMENTO_CPF = 11;
    private static final int DOCUMENTO_CNPJ = 14;

    public Integer cod;
    public String nome;
    private String documento;
    public tipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw  new RuntimeException("Documento nao pode ser nulo nem vazio.");
        }
        if (documento.length() == DOCUMENTO_CPF){
            setDocumento(documento,tipo = tipoPessoa.FISICA);
        } else if (documento.length() == DOCUMENTO_CNPJ) {
            setDocumento(documento, tipo = tipoPessoa.JURIDICA);
        } else {
            throw  new RuntimeException("Documento invalido para pessoa fisica ou juridica.");
        }
        this.documento = documento;
    }

    private void setDocumento(String documento, tipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;

    }

    public tipoPessoa getTipo() {
        return tipo;
    }
}
