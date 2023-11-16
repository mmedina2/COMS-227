package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel7
{
  private int Rabits;
  private int Rabits2;


  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel7()
  {
	 Rabits = 0;
	 Rabits2 = 0;
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
	  Rabits2 += 1;
	  Rabits = Rabits2 % 5;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    Rabits = 0;
  }
}
