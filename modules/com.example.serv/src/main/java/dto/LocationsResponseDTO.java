package dto;


import java.io.Serializable;

import java.util.stream.Stream;

public class LocationsResponseDTO implements Serializable {
  private LocationinfoDTO[] items;

  public void setItems(LocationinfoDTO[] data){
    this.items = data;
  }

  public LocationinfoDTO[] getItems(){
    return this.items;
  }

  public String[] getDepartamentos(){
   return Stream
    .of(this.items)
    .map(LocationinfoDTO::getDepartamento)
    .distinct()
    .toArray(String[]::new);
  }
}
