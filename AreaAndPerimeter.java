/*here in this program we are showing that how to implement an abstract class
 * In this program by using abstract class and abstract methods we printing the area and perimeter
 * of circle ,rectangle and triangle
*/
package assignment9;//here created package assignment9
    
  abstract class Figure {          //A class that is declared as abstract is known as abstract class.
	       double area,perimeter;       //we taking double data type of variables 
	       abstract void findArea();          //A method which is declared and not  implemented is known as abstract method
	       abstract void findPerimeter();
	       
  }
         class Circle extends Figure{      // here this class extended the abstract 
        	    
        	     double pi=3.141, radius =5;//taking pi,radius values
        	               void  findArea(){     //and implemented the methods of abstract class
        	            	                    //void as no return type
        	    
					area = pi*radius*radius;                  // here we are showing area of circle
					System.out.println("Area of circle : "+area);
					//systemm is used to return code
					//out is a static member
					//Println is used to print text area of circle and gives output
        	     }
		
				void findPerimeter() {
					perimeter = 2*pi*radius;
					System.out.println("Perimeter of circle : "+perimeter);
					
				} 
         }
        	
         class Rectangle  extends Figure {     //here another subclass extended the  abstract class
        	 
        	 double width=60,height=30;//taking double values
        	             void findArea(){  //here we are implementing the method 
        	            	 area = width * height;//formuala for area of rectangle
        	            	 System.out.println("Area of Rectangle : "+area);
        	            	
        	            	 
        	             }
        	         void findPerimeter(){//void as no return type
        	        	 perimeter = 2*(width + height);
        	        	 System.out.println("Perimeter of Rectangle : "+perimeter);
        	        	//systemm is used to return code
        	     		//out is a static member
        	     		//Println is used to print text perimeter of rectangle and gives output
        	        	 
        	             }
         }
           
         class Triangle extends Figure {       //here another subclass extended the Figure class which is abstract     
        	   
        	 double  side1=10,side2=20,side3=15;//taking side values
        	 double  base = 20,height = 15;//taking base,height values
        	            void findArea(){//void as return type
        	            	area = (base * height)/2;
        	            	System.out.println("Area of Triangle : "+area); 
        	        
        	            	
        	            }
        	          void findPerimeter(){
        	        	   perimeter = side1 + side2 +side3;
        	        	   System.out.println("Perimeter of Triangle : "+perimeter);
        	      
        	        	    
        	           }
         }
                                                   //here we have created the main class
           public class AreaAndPerimeter {//created class AreaAndPerimeter
        	                              //classes is the basics of opps(object oriented pogram)
        	   public static void main(String[]args){ 
        		   
        		   Circle circle = new Circle();            //here we cannot instantiate the object of an abstract class
        		   Rectangle rectangle = new Rectangle();   //so we created the objects of subclasses which defined methods in it 
        		   Triangle triangle = new Triangle();//taking new rectangle,triangle
        		   
        	circle.findArea(); //here it display the details
        	circle.findPerimeter();//finding perimeter of circle
        	rectangle.findArea();//finding area of rectangle
        	rectangle.findPerimeter();//finding perimeter of rectangle
        	triangle.findArea();//finding area of triangle
        	triangle.findPerimeter();//finding perimeter of triangle
        		   
        	   }

}