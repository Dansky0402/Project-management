import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}