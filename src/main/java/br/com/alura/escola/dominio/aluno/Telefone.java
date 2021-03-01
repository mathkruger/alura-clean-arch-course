package br.com.alura.escola.dominio.aluno;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || ddd.length() != 2) {
            throw new IllegalArgumentException("O DDD deve ter 2 digitos!");
        }

        if(numero == null || !numero.matches("^?[\\s-]?[\\s9]?\\d{4}-?\\d{4}$")) {
            throw new IllegalArgumentException("O número do telefone é inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}