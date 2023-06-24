package de.magicmarcy.sos.objectserializer.exampledto;

import java.io.Serializable;
import java.util.Map;

public class DemoComplexDto implements Serializable {
  private String name;
  private DemoDtoOne anotherComplexDto;
  private Map<String, DemoDtoTwo> stringJustAnotherDtoMap;
  private DemoDtoThree thisIsAnotherDto;

  public DemoComplexDto(String name, DemoDtoOne anotherComplexDto, Map<String, DemoDtoTwo> stringJustAnotherDtoMap, DemoDtoThree thisIsAnotherDto) {
    this.name = name;
    this.anotherComplexDto = anotherComplexDto;
    this.stringJustAnotherDtoMap = stringJustAnotherDtoMap;
    this.thisIsAnotherDto = thisIsAnotherDto;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DemoDtoOne getAnotherComplexDto() {
    return anotherComplexDto;
  }

  public void setAnotherComplexDto(DemoDtoOne anotherComplexDto) {
    this.anotherComplexDto = anotherComplexDto;
  }

  public Map<String, DemoDtoTwo> getStringJustAnotherDtoMap() {
    return stringJustAnotherDtoMap;
  }

  public void setStringJustAnotherDtoMap(Map<String, DemoDtoTwo> stringJustAnotherDtoMap) {
    this.stringJustAnotherDtoMap = stringJustAnotherDtoMap;
  }

  public DemoDtoThree getThisIsAnotherDto() {
    return thisIsAnotherDto;
  }

  public void setThisIsAnotherDto(DemoDtoThree thisIsAnotherDto) {
    this.thisIsAnotherDto = thisIsAnotherDto;
  }

  @Override
  public String toString() {
    return "DemoComplexDto{" +
        "name='" + name + '\'' +
        ", anotherComplexDto=" + anotherComplexDto +
        ", stringJustAnotherDtoMap=" + stringJustAnotherDtoMap +
        ", thisIsAnotherDto=" + thisIsAnotherDto +
        '}';
  }
}
