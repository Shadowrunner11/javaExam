package dto;

import java.io.Serializable;
import java.util.stream.Stream;

public class CarsResponseDTO implements Serializable{
  private CarsModelsInfoDTO[] modelos;

  public CarsModelsInfoDTO[] getModelos(){
    return this.modelos;
  }

  public void setModelos(CarsModelsInfoDTO[] modelos){
    this.modelos = modelos;
  }

  public String[] getNombres(){
    return Stream.of(this.modelos)
      .map(CarsModelsInfoDTO::getNombre)
      .toArray(String[]::new);
  }
}
