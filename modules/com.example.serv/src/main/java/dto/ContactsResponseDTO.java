package dto;

import java.io.Serializable;
import java.util.stream.Stream;

public class ContactsResponseDTO implements Serializable {
    private ClientContactDTO[] contactos;

    public ClientContactDTO[] getContactos() {
        return contactos;
    }

    public void setContactos(ClientContactDTO[] contactos) {
        this.contactos = contactos;
    }
    
    public String[] getTipos(){
        return Stream.of(this.contactos)
          .map(ClientContactDTO::getTipo)
          .toArray(String[]::new);
      }
}
