package de.magicmarcy.sos.objectserializer.exampledto;

import java.io.Serializable;
import java.util.List;

public class DemoDtoOne implements Serializable {
  private int id;
  private List<String> stringList;

  public DemoDtoOne(int id, List<String> stringList) {
    this.id = id;
    this.stringList = stringList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<String> getStringList() {
    return stringList;
  }

  public void setStringList(List<String> stringList) {
    this.stringList = stringList;
  }

  @Override
  public String toString() {
    return "DemoDtoOne{" +
        "id=" + id +
        ", stringList=" + stringList +
        '}';
  }
}
