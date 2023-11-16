package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel3
{
  private int Rabits;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel3()
  {
	 Rabits = 500;
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

	Rabits = Rabits / 2;
	
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    Rabits = 500;
  }
}
