package escola;

public class CPF {
    private String numero;

    public CPF(String numero) {
        if(numero == null || numero == "" || !numero.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
            throw new IllegalArgumentException("CPF com formato inválido!");
        }
        this.numero = numero;
    }
    
}