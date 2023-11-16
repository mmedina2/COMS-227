package lab3;
import balloon4.Balloon;

import static org.junit.Assert.*;

import org.junit.Test;
public class BalloonTests {
	
	private static final double EPSILON = 10e-07;
	
	@Test
	public void testBalloon()
	{
		Balloon b = new Balloon(5);
		assertEquals(false, b.isPopped());
	}
	
	@Test
	public void testblow()
	{
		Balloon b= new Balloon(5);
		b.blow(5);
		assertEquals(false, b.isPopped());
	}
	
	@Test 
	public void testdeflate()
	{
		Balloon b = new Balloon(5);
		b.blow(5);
		assertEquals(5.0, b.getRadius(), EPSILON);
		b.deflate();
		assertEquals(0.0, b.getRadius(), EPSILON);
	}
	@Test
	public void testdeflate2()
	{
		Balloon b = new Balloon(5);
		b.deflate();
		assertEquals(false, b.isPopped());
		
	}

	@Test
	public void testgetRadius()
	{
		Balloon b = new Balloon(5);
		b.blow(5);
		assertEquals(5.0, b.getRadius(), EPSILON);
	}
	@Test
	public void testgetRadius2()
	{
		Balloon b = new Balloon(5);
		b.blow(5);
		b.blow(5);
		assertEquals(0.0, b.getRadius(), EPSILON);
	}
	
	@Test
	public void testisPopped()
	{
		Balloon b = new Balloon(5);
		b.pop();
		assertEquals(true, b.isPopped());
	}
	@Test
	public void testpop()
	{
		Balloon b = new Balloon(5);
		b.pop();
		assertEquals(0.0, b.getRadius(), EPSILON);
	}
	
	@Test
	public void testpop2()
	{
		Balloon b = new Balloon(5);
		b.pop();
		b.blow(5);
		assertEquals(0.0, b.getRadius(), EPSILON);
	}
	
}
