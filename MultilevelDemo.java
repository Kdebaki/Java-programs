//Learn and Understand Multilevel Inheritance and implement the same using java code.
package week8;

class Vehicle
{
	protected String vehicleType;
	private int maxSpeed;
	Vehicle(int mSpeed)
	{
		maxSpeed = mSpeed;
		}
	public void speed()
	{
		System.out.println("It can cruise up to maximum speed of "+maxSpeed+ "km/hour");
		}
	}
class Toyota extends Vehicle
{
	protected String brand;
	Toyota(int mSpeed)
	{
		super(mSpeed);
		}
	}
class Fortuner extends Toyota
{
	private String model;
	Fortuner(String vType, int ms, String br, String mod )
	{
		super(ms);
		vehicleType = vType;
		model = mod ;
		brand = br ;
		}
	public void display()
	{
		System.out.println("The name of the vehicle is "+model);
		System.out.println("It's brand is "+brand);
		System.out.println("The type of vehicle is "+vehicleType);
		this.speed();
		}
	}
public class MultilevelDemo
{
	public static void main(String args[])
	{
		Fortuner sigma = new Fortuner("Four Wheeler", 280,"Toyota","Fortuner");
		sigma.display();
		}
	}
