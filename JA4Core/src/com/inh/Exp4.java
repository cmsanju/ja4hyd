package com.inh;


class OverLoad
{
	public void add(int x)
	{
		System.out.println("single");
	}
	
	public void add(float x)
	{
		System.out.println("type of the argument");
	}
	
	public void add(int x, float y)
	{
		System.out.println("no of the arguments");
	}
	
	public void draw(float x, int y)
	{
		System.out.println("cle");
	}
	
	public void draw()
	{
		System.out.println("tle");
	}
}

public class Exp4 {
	
	public static void main(String[] args) {
		
		OverLoad ol = new OverLoad();
		ol.add(10);
		ol.add(23.46f);
		ol.add(23,90.3f);
	}

}
