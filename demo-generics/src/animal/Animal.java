package animal;

import java.util.List;

public abstract class Animal {
  public static <T extends Animal & Runable> Animal run100m(List<T> animals){
    for (T animal: animals){
      animal.run();
    }
    return null;
  }
}
