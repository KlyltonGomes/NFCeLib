package br.com.nfcelib.core.dto;

public class DestinatarioDto {

    private String cpf; //Não obrigatorio
    private String nome; // Consumidor não identificado


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
