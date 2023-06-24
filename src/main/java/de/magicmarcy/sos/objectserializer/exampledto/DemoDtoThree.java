package de.magicmarcy.sos.objectserializer.exampledto;

import java.io.Serializable;
import java.util.Iterator;

public class DemoDtoThree implements Serializable {
  private String name;
  private transient Object demoObject;
  private transient Iterator<?> iterator;

  public DemoDtoThree(String name, Object demoObject, Iterator<?> iterator) {
    this.name = name;
    this.demoObject = demoObject;
    this.iterator = iterator;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getDemoObject() {
    return demoObject;
  }

  public void setDemoObject(Object demoObject) {
    this.demoObject = demoObject;
  }

  public Iterator<?> getIterator() {
    return iterator;
  }

  public void setIterator(Iterator<?> iterator) {
    this.iterator = iterator;
  }

  @Override
  public String toString() {
    return "DemoDtoThree{" +
        "name='" + name + '\'' +
        ", demoObject=" + demoObject +
        ", iterator=" + iterator +
        '}';
  }
}
