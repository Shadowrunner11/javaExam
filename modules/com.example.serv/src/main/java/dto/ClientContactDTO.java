package dto;
import java.io.Serializable;

public class ClientContactDTO implements Serializable {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
