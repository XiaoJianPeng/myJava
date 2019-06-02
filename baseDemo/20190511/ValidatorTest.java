/*
interface ValidationStrategy {
  boolean execute(String s);
}

class IsAllLowerCase implements ValidationStrategy {
  public boolean execute(String s){
    return s.matches("[a-z]+");
  }
}

class IsNumeric implements ValidationStrategy {
  public boolean execute(String s){
    return s.matches("\\d+");
  }
}
*/

class Validator{ 
  private final ValidationStrategy strategy;
  
  public Validator(ValidationStrategy v){
    this.strategy = v;
  }
  public boolean validate(String s){
    return strategy.execute(s);
  }
  
}

public class ValidatorTest {
  public static void main(String[] args) {
    Validator numericValidator = new Validator(new IsNumeric());
    boolean b1 = numericValidator.validate("aaaa");
    System.out.println(b1);
    Validator lowerCaseValidator = new Validator(new IsAllLowerCase ());
    boolean b2 = lowerCaseValidator.validate("bbbb");
    System.out.println(b2);
  }
}