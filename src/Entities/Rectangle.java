package Entities;

public class Rectangle {

		public double width;
		public double height;

		public double area() {
			return width * height;
		}
		
		 /* 2(b + h)*/
		public double perimeter() {
			return 2 * (width + height);
		}
		
		public double diagonal () {
			return Math.sqrt(width * width + height * height);
		}
		
}
