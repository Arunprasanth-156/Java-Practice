package com.wipro.automobile.ship;

public class Compartment {
	private int height;
    private int width;
    private double breadth;


    public Compartment(int height,int width,double breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	 public double getHeight() {
	        return height;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public double getBreadth() {
	        return breadth;
	    }
	    public double getVolume() {
	        return height * width * breadth;
	    }
		
	
		
	public void displayDetails(){
		System.out.println(height);
		System.out.println(width);
		System.out.println(breadth);
	}
	}

