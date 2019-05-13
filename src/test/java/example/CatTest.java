package test.java.example;
import main.java.example.*;
import org.junit.*;

public class CatTest {
  @Test
  public void testEat() {
    new Cat().eat();
  }

  @Test
  public void testSound() {
    new Cat().sound();
  }
}
