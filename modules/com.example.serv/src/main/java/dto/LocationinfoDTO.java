package dto;

import java.io.Serializable;

public class LocationinfoDTO implements Serializable {
  private String departamento;
  private String sucursal;
  private String provincia;

  public String getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getSucursal() {
    return this.sucursal;
  }

  public void setSucursal(String sucursal) {
    this.sucursal = sucursal;
  }

  public String getProvincia() {
    return this.provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }
}
