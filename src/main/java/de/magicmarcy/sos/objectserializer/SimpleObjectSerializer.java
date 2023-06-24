package de.magicmarcy.sos.objectserializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.io.FileUtils;
import de.magicmarcy.sos.objectserializer.exx.ErrorReadingFile;
import de.magicmarcy.sos.objectserializer.exx.ErrorWritingFile;

/**
 * SimpleObjectSerializator (SOS)
 * This simple serialiser can be used to persist any object to a file on the local file system. You will be able to read the object at any time
 * once it has been serialised, but it is necessary to cast your object to the type it has been serialised to. Your object must implement
 * the Serializable interface.
 *
 * @author magicmarcy
 * @version 0.17.1
 */
public final class SimpleObjectSerializer {

  /**
   * Private constructor to hide the public one
   */
  private SimpleObjectSerializer() {
    super();
  }

  /**
   * Tries to read the file and returns the entire contents as an object. You must cast this object to the type it was serialised to!
   * The object must implement the Serialisable interface!
   *
   * @param fileSource the full qualified name of the file, for example "c:\\tmp\\mydata.sos"
   * @return object of the file contents or raise an exception
   */
  public static Object readFromFileAndDeserialize(String fileSource) throws ErrorReadingFile {
    try {
      final ByteArrayInputStream bais = new ByteArrayInputStream(FileUtils.readFileToByteArray(new File(fileSource)));
      final ObjectInputStream ois = new ObjectInputStream(bais);

      return ois.readObject();

    } catch (Exception e) {
      throw new ErrorReadingFile("Could not read file!");
    }
  }

  /**
   * Writes an arbitrary object to the specified file. It is essential that the object you want to serialise implements the Serializable interface!
   *
   * @param o the object you want to serialize
   * @param fileSource the full qualified name of the file, for example "c:\\temp\\mydata.sos"
   */
  public static void serializeAndWriteToFile(final Object o, final String fileSource) throws ErrorWritingFile {
    try {
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      final ObjectOutputStream oos = new ObjectOutputStream(baos);

      oos.writeObject(o);

      FileUtils.writeByteArrayToFile(new File(fileSource), baos.toByteArray());

    } catch (Exception ewf) {
      throw new ErrorWritingFile("File could not be written!");
    }
  }

  /**
   * Checks if the file is available in the specified fileSource
   *
   * @param fileSource the full qualified name of the file, for example "C:\\temp\\mydata.sos
   * @return true if the file exists, false if not
   */
  public static boolean existsFile(final String fileSource) {
    return FileUtils.getFile(new File(fileSource)).exists();
  }
}
