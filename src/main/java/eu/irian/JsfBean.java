package eu.irian;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class JsfBean implements Serializable {

  private Integer integerInput;
  private Double doubleInput;
  private String stringInput;

  public JsfBean() {
    System.out.println("jsf constructor called");
  }

  public String submit() {
    System.out.println("jsf submit called");
    return "/index.xhtml";
  }

  public Integer getIntegerInput() {
    return integerInput;
  }

  public void setIntegerInput(Integer integerInput) {
    this.integerInput = integerInput;
  }

  public Double getDoubleInput() {
    return doubleInput;
  }

  public void setDoubleInput(Double doubleInput) {
    this.doubleInput = doubleInput;
  }

  public String getStringInput() {
    return stringInput;
  }

  public void setStringInput(String stringInput) {
    this.stringInput = stringInput;
  }

  @Override
  public String toString() {
    return "JsfBean{" +
        "integerInput=" + toString(integerInput) +
        ", doubleInput=" + toString(doubleInput) +
        ", stringInput=" + toString(stringInput) +
        '}';
  }

  public static String toString(Object object) {
    return object == null ? "null" : "'" + object + "'";
  }
}
