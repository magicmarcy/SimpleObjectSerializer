package de.magicmarcy.sos.objectserializer.exampledto;

import java.io.Serializable;
import java.util.Arrays;

public class DemoDtoTwo implements Serializable {
  private String name;
  private int[] ints;

  public DemoDtoTwo(String name, int[] ints) {
    this.name = name;
    this.ints = ints;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int[] getInts() {
    return ints;
  }

  public void setInts(int[] ints) {
    this.ints = ints;
  }

  @Override
  public String toString() {
    return "DemoDtoTwo{" +
        "name='" + name + '\'' +
        ", ints=" + Arrays.toString(ints) +
        '}';
  }
}
