import java.io.IOException;
import java.net.ServerSocket;

class ExceptionDemo1 {
  ExceptionDemo1() {
  }

  public static void main(String[] args) throws IOException {
  //    ServerSocket ss = new ServerSocket(3306);
  //    try{
  //      ServerSocket ss = new ServerSocket(3306);
  //    } catch (IOException e) {
  //      e.printStackTrace();
  //    }
    writeFile();
  }

  public static void writeFile() throws FileNotFoundException {
    FileReader fw = new FileReader("d:\\aa.text");
  }

}