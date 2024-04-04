package example.com.ifelse;
import java.util.*;
public class EggSizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter the size of the EGG Weigth in ounces (oz)");
		Scanner sc=new Scanner(System.in);
		int Weigth=sc.nextInt();
		String size;
		 if (Weigth>= 15 && Weigth < 18) {size = "Peewee eggs";
		
		  }else if (Weigth>= 18 && Weigth < 21) {size = "Small eggs";
		
	        }else if (Weigth>= 21 && Weigth < 24) {size = "Medium eggs";
	
	          }else if (Weigth>= 24 && Weigth < 27) {size = "Large eggs";
	
	           }else if (Weigth>= 27 && Weigth < 30) {size = "Extra-large eggs";
	
	   	        }else if (Weigth>= 30 ) {size = "Jumbo eggs";
	
	   }else {
           size = "Too small";
	   }
		 System.out.println("Egg Classified as = " +size);
	      }
	}


