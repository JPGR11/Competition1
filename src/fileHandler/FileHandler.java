import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class FileHandler {
  public static String getPasswordHash(String filePath, int index) {
    try {
      String[][] passData = loadData(filePath);
      if (passData != null) {
        return passData[0][index];
      } else {
        return "-1";
      }

    } catch (Exception e) {
      return "-1";
    }
  }

  private static void saveData(String[][] currentData, String filePath) throws IOException {
    FileOutputStream fileStream = new FileOutputStream(filePath);
    PrintWriter outFS = new PrintWriter(fileStream);

    for (int i = 0; i < currentData.length; i++) {
      for (int j = 0; j < currentData[i].length; i++) {
        outFS.printf("%s, ", currentData[i][j]);
      }
      outFS.printf("%n");
    }

    fileStream.close();
  }

  private static String[][] loadData(String filePath) throws IOException {
    int i = 0;
    int columns;
    int rows;
    FileInputStream fileByteStream = new FileInputStream(filePath);
    Scanner inFS = new Scanner(fileByteStream);
    String line;
    String[] tokens;
    String[][] fileData = null;

    // Check max colomns
    // first row of csv is the size of 2d arrays
    if (inFS.hasNext()) {
      line = inFS.nextLine();
      tokens = line.split(",");
      columns = Integer.parseInt(tokens[0]);
      rows = Integer.parseInt(tokens[1]);
      fileData = new String[columns][rows];
    }

    try {
      if (inFS.hasNext()) {
        do {
          line = inFS.nextLine();
          tokens = line.split(",");
          fileData[i] = tokens;
          i++;
        } while (inFS.hasNext() && i < fileData.length);
      }
    } catch (Exception e) {
    }
    inFS.close();
    return fileData;
  }
}
