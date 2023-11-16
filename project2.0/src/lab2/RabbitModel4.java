package lab2;

import java.util.Random;
/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel4
{
  private int Rabits;

  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel4()
  {
	 Rabits = 2;
  }  
 
  /**`
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    return Rabits;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear() 
  {
	 Random rand = new Random();
	 Rabits = Rabits + rand.nextInt(9);
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    Rabits = 2;
  }
}
