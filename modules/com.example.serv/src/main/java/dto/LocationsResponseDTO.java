package dto;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
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

  public Map<String, String> getSurcursals(){
     Map <String, String> sucursalsWithDepartament = new HashMap<>(); 

     System.out.println("paso 1");

    for (LocationinfoDTO locationinfoDTO : items) {
      String departament = locationinfoDTO.getDepartamento();
      String surcursal = locationinfoDTO.getSucursal();

      boolean isAlreadyInHashMap = sucursalsWithDepartament.get(departament) != null && 
        sucursalsWithDepartament.get(departament).equals(surcursal);
      System.out.println("isAlreadyInHashMap: " + isAlreadyInHashMap);

      if(!isAlreadyInHashMap)
        sucursalsWithDepartament.put(departament,surcursal);
      
    }

    System.out.println(sucursalsWithDepartament);

    return sucursalsWithDepartament;
  } 
}
