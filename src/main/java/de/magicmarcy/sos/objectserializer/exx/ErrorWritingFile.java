package de.magicmarcy.sos.objectserializer.exx;

/**
 * Custom exception if there is an error while writing the file
 */
public class ErrorWritingFile extends Throwable {
  public ErrorWritingFile(String message) {
    super(message);
  }
}
