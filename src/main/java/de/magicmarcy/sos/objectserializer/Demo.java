package de.magicmarcy.sos.objectserializer;

import de.magicmarcy.sos.objectserializer.exampledto.DemoComplexDto;
import de.magicmarcy.sos.objectserializer.exampledto.DemoDtoCreator;
import de.magicmarcy.sos.objectserializer.exx.ErrorReadingFile;
import de.magicmarcy.sos.objectserializer.exx.ErrorWritingFile;

/**
 * This is an example of using the SOS (SimpleObjectSerializer)
 * First, we define our destination file, where we will store our complex dto.
 * If the file doesn't exist, we'll create one - otherwise we'll restore our complex dto from that file,
 * so you don't have to create that dto every time you want to use it.
 */
public class Demo {
  public static void main(String[] args) throws ErrorWritingFile, ErrorReadingFile {
    final String fileSource = "c:\\temp\\ComplexDto.dat";

    if (!SimpleObjectSerializer.existsFile(fileSource)) {
      final DemoComplexDto complexDto = DemoDtoCreator.createDto();

      SimpleObjectSerializer.serializeAndWriteToFile(complexDto, fileSource);
    }

    final DemoComplexDto demoComplexDtoFromFile = (DemoComplexDto) SimpleObjectSerializer.readFromFileAndDeserialize(fileSource);

    System.out.println(demoComplexDtoFromFile);
  }
}
