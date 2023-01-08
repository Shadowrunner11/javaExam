package dto;

import java.io.Serializable;

public class CarsModelsInfoDTO implements Serializable{
  private String nombre;
  private String[] versiones;

  public void setNombre(String modelName){
    this.nombre = modelName;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setVersiones(String[] versions){
    this.versiones = versions;
  }

  public String[] getVersiones(){
    return this.versiones;
  }
}
