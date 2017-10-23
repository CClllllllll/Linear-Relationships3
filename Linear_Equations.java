/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_equations;

import java.util.Scanner;

public class Linear_Equations {
    
    //attributes
    private int slope;
     private int y_intercept;
    
    //default constructor
    public Linear_Equations() {
    
    }
    
    //constructor
    public Linear_Equations(int _slope, int _yIntercept) {
        slope = _slope;
        y_intercept = _yIntercept;
    }
    
    //Methods
    //find y coordinate
    public int CalculateY (int x){
        int y = slope * x + y_intercept;
        return y;
    }
    public int CalculateY (double x){
        int y = slope * (int)x + y_intercept;
        return y;
    }
    public int CalculateY (){
        int x = 0;
        int y = slope * x + y_intercept;
        return y;
    }
         
    //find x coordinate
    public int CalculateX (int y){
        int x = (y - y_intercept)/slope;
        return x;
    }
    public int CalculateX (){
        int y = 0;
         int x = (y - y_intercept)/slope;
        return x;
    }
    
     //get Slope
    public void getSlope (int s){
        slope = s;
    }
    
     //get Slope
    public void getY_intercept (int yi){
        y_intercept = yi;
    }
    
    
    public static void main(String[] args) {
     
       try { 
            
        Linear_Equations my_Linear_Equations = new Linear_Equations();
        
        String ans;
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Please enter the slope: ");       
         int userInputSlope = Integer.parseInt(in.next());
         my_Linear_Equations.getSlope(userInputSlope);
        
         System.out.println ("Please enter the y - intercept: "); 
         int userInputYintercept = Integer.parseInt(in.next());
         my_Linear_Equations.getY_intercept(userInputYintercept);
         
         System.out.println("Please enter \n x if you would like to solve for the x value \n or \n y if you would like to solve for the y value");
         String userOption = in.next();
                
         if (null == userOption){
             System.out.println("wrong options");
         }
         else switch (userOption) {
            case "x":
                System.out.println("To find the x value, please enter the y value:");               
                String userInput = in.next();
                int x;
                if (userInput.length() != 0){
                   int userInput_Y = Integer.parseInt(userInput);
                   x = my_Linear_Equations.CalculateY(userInput_Y);
                   System.out.println("The final coordinates are: (" + x  +"," + userInput_Y +")");
                } else {
                   x = my_Linear_Equations.CalculateX();
                   System.out.println("User did not enter y value, use defult value 0. The final coordinates are: (" + x +",0)");
                }
                
                break;
            case "y":
                System.out.println("To find the y value, please enter the x value:");               
                userInput = in.next();
                int y;
                if (userInput.length() != 0){
                   int userInput_X = Integer.parseInt(userInput);
                   y = my_Linear_Equations.CalculateY(userInput_X);
                   System.out.println("The final coordinates are: (" + userInput_X  +"," + y +")");
                } else {
                   y = my_Linear_Equations.CalculateY();
                   System.out.println("User did not enter x value, use defult value 0. The final coordinates are: (0," + y +")");
                }
                
                break;
            default:
                System.out.println("Wrong opitions");
                break;
        } 
         
      } catch (Exception ex) {
          System.out.println("Exception occurred: " + ex.getMessage());
        }   
    }
    
}
