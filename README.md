# SimpleObjectSerializer

The SimpleObjectSerializer is a Java library designed to write complex DTOs (Data Transfer Objects) to and read them from disk. The main goal of this project is to provide a simple and efficient way to persist and restore data objects without requiring complex configuration or database connections.

### Functions
- Serialisation and deserialisation: The SimpleObjectSerializer library allows DTOs to be seamlessly written to disk and data objects to be restored to their original state. Objects are stored in a compact, space-efficient format.
- Support for complex data structures: The library provides the ability to serialise and deserialise complex data structures such as nested objects, lists, maps and custom classes. This allows even large data models to be handled with ease.
- Performance optimisation: The library has been designed with high performance in mind. Optimisations have been implemented to maximise serialisation and deserialisation speed and minimise resource consumption.

### Application scenarios
- Data Persistence: SimpleObjectSerializer is ideal for applications that need a quick and easy way to persistently store and retrieve data objects without relying on a database or complex file formats.
- Network communication: The library also allows easy transfer of data objects over the network. Serialisation allows complex objects to be converted to a byte-based representation and restored to their original state at the receiving end.
- Data caching: SimpleObjectSerializer can also be used for data caching. By serialising objects, they can be efficiently cached on disk and quickly restored when needed.

### Installation and use
1. Add the SimpleObjectSerializer library to your Java project.
2. Import the required classes into your code.
3. Create a SimpleObjectSerializer object and use the appropriate methods to serialise or deserialise DTOs.

### Sample Code

```java
public static void main(String[] args) throws ErrorWritingFile, ErrorReadingFile {
  final String fileSource = "c:\\temp\\ComplexDto.dat";

  if (!SimpleObjectSerializer.existsFile(fileSource)) {
    final DemoComplexDto complexDto = DemoDtoCreator.createDto();

    SimpleObjectSerializer.serializeAndWriteToFile(complexDto, fileSource);
  }

  final DemoComplexDto demoComplexDtoFromFile = (DemoComplexDto) SimpleObjectSerializer.readFromFileAndDeserialize(fileSource);

  System.out.println(demoComplexDtoFromFile);
}
```

The SimpleObjectSerializer library provides a simple and effective way to serialise and deserialise complex DTOs without requiring complex configuration or database connections. It provides efficient data persistence, network communication and caching. Its flexibility and performance optimisations make it a valuable addition to Java projects that need to work with large data models.
