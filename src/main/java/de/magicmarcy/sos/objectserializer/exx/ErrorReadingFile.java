package de.magicmarcy.sos.objectserializer.exx;

/**
 * Custom exception if there is an error while writing the file
 */
public class ErrorReadingFile extends Throwable {
  public ErrorReadingFile(String message) {
    super(message);
  }
}
