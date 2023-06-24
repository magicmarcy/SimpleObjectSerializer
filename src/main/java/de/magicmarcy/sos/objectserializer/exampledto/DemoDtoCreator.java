package de.magicmarcy.sos.objectserializer.exampledto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DemoDtoCreator {
  private DemoDtoCreator() {
    super();
  }

  public static DemoComplexDto createDto() {
    final int id = 1;
    final List<String> stringList = new ArrayList<>();
    stringList.add("String1");
    stringList.add("String2");
    stringList.add("String3");
    stringList.add("String4");

    final DemoDtoOne anotherComplexDto = new DemoDtoOne(id, stringList);

    final Map<String, DemoDtoTwo> stringJustAnotherDtoMap = new HashMap<>();
    stringJustAnotherDtoMap.put("Key1", new DemoDtoTwo("Name1", new int[]{ 0, 1, 2, 3, 4 }));
    stringJustAnotherDtoMap.put("Key2", new DemoDtoTwo("Name2", new int[]{ 9, 8, 7, 5, 1, 2 }));
    stringJustAnotherDtoMap.put("Key3", new DemoDtoTwo("Name3", new int[]{ 5, 7, 4, 1, 3, 6, 8, 5, 4, 1, 2, 5, 4 }));

    final DemoDtoThree thisIsAnotherDto = new DemoDtoThree("ThisIsAnotherDto", new Object(), null);

    return new DemoComplexDto("ComplexDTO", anotherComplexDto, stringJustAnotherDtoMap, thisIsAnotherDto);
  }
}
