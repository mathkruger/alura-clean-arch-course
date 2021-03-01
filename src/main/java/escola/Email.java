package escola;

public class Email {

    private String endereco;

    public Email(String endereco) {
        if(endereco == null ||
            endereco == "" ||
            !endereco.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$")) {
            throw new IllegalArgumentException("E-mail inválido");
        }

        this.endereco = endereco;
    }
}