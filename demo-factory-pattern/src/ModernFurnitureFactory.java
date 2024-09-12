

public class ModernFurnitureFactory implements FurnitureFactory{
  @Override
  public Chair createChair() {
    System.out.println("ModernFurnitureFactory creating Chair ...");
    return new ModernChair();
  }

  @Override
  public Sofa createSofa(){
    System.out.println("VictorianFurnitureFactory creating sofa ...");
    return new VictorianSofa();
  }
  
}
