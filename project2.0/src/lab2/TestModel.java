package lab2;

public class TestModel
{
  public static void main(String[] args)
  {
    RabbitModel7 model = new RabbitModel7();

    // Check that the initial population is 2
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");

    // A year goes by...
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 3");

    // Start over
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.reset();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
    
    model.simulateYear();
    System.out.println(model.getPopulation());
    System.out.println("Expected 2");
  }
}
