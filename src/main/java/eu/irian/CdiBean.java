package eu.irian;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class CdiBean implements Serializable {

  private Integer integerInput;
  private Double doubleInput;
  private String stringInput;

  public CdiBean() {
    System.out.println("cdi constructor called");
  }

  public String submit() {
    System.out.println("cdi submit called");
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
    return "CdiBean{" +
        "integerInput=" + toString(integerInput) +
        ", doubleInput=" + toString(doubleInput) +
        ", stringInput=" + toString(stringInput) +
        '}';
  }

  public static String toString(Object object) {
    return object == null ? "null" : "'" + object + "'";
  }
}
