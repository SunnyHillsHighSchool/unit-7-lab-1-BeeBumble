//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
    //Create a variable called sum that will store the sum as your code runs
    int sum = 0;
    //create a for each loop for the array
    for (int val: ray)
    {
      //inside of the for loop set sum equal to sum + the current value of the array val
      sum += val;
    }
    //return sum
    return sum;
 }
}