public class IsAllLowerCase implement ValidationStrategy {
  public boolean execute(String s){
    return s.matches("[a-z]+");
  }
}