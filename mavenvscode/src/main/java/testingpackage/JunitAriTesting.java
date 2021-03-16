package testingpackage;
import java.awt.Point;

public class JunitAriTesting {


    
    // public static void main(String[] args) {
    //     int[] intArray = new int[]  {1,2,3,4,5,6,7,8,9,10};
        
    //         printNumber(intArray);
        
    // }

  /*
    * @param int 
    * @return void - printing the number
    */
    public void printNumber (int[] numbers) {
        for (int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]);
            if (i != (numbers.length -1))
                System.out.print(",");
        }

    }

    /*
    * @param 3 points int 
    * @return int - calculating area of triangle with 3 vertices 
    */
    public int countTriangleArea (Point a, Point b, Point c) {
        int area = Math.abs(((a.x*b.y + b.x*c.y + c.x*a.y) - (b.x*a.y + c.x*b.y + a.x*c.y))/2);
        return area;
        
    }



}