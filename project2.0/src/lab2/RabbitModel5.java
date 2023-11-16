package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel5
{
  private int Rabits;
  private int Lastyearpop;
  private int Lastyearpop2;

  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel5()
  {
	 Rabits = 0;
	 Lastyearpop = 1;
	 Lastyearpop2 = 0;
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
	 Rabits = Lastyearpop2 + Lastyearpop;
	 Lastyearpop2 = Lastyearpop;
	 Lastyearpop = Rabits;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    Rabits = 0;
    Lastyearpop = 1;
    Lastyearpop2 = 0;
  }
}
