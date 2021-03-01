package escola;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd.length() != 2) {
            throw new IllegalArgumentException("O DDD deve ter 2 digitos!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }
}