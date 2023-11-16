package lab3;

public class Basketball {
	
	private boolean isInflated; 
	private double Diameter;
	 public Basketball(double givenDiameter)
	  {
		 Diameter = givenDiameter;
		 isInflated = false;
	  }

	  public boolean isDribbleable()
	  {
	    return isInflated;
	  }

	  public double getDiameter()
	  {
	    return Diameter;
	  }

	  public double getCircumference()
	  {
	    double result = Math.PI * Diameter;
	    return result;
	  }

	  public void inflate()
	  {
		  isInflated = true;
	  }
}
