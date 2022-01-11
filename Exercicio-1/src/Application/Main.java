package Application;

import entities.Rectangle;

public class Main {

	public static void main(String[] args){

		System.out.println("Enter rectangle width and height: ");

		Rectangle rectangle = new Rectangle();
		rectangle.width = 3.00;
		rectangle.height = 4.00;

		System.out.println("AREA: " + rectangle.Area());
		System.out.println("PERIMETER: " + rectangle.Perimeter());
		System.out.println("DIAGONAL: " + rectangle.Diagonal());

	}
}
