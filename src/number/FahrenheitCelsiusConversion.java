package number;
/*
A temperature difference of 1°F is the equivalent of a temperature difference 0.556°C.  You can use following formula to convert Fahrenheit temperature into Celsius temperature :

C = (F- 32) * 5 / 9

where F  is the temperature in Fahrenheit

For Celsius to Fahrenheit conversion you can  use

F = 9 * (C / 5) + 32;

where C is temperature on Celsius scale
Fahrenheit is a thermodynamic temperature scale, where the freezing point of water is 32 degrees Fahrenheit (°F) and the boiling point of water is 212°F (at standard atmospheric pressure). This puts the boiling and freezing points of water exactly 180 degrees apart. Therefore, a degree on the Fahrenheit scale is 1/180 of the interval between the freezing point and the boiling point of water. Absolute zero is defined as -459.67°F. If you know, in Celsius scale, freezing point of water is at 0ºC and boiling point of water is at 100ºC. By using these fact, you can easily deduce a formula to convert Fahrenheit temperature into Celsius.
*/import java.util.Arrays;
import java.util.Scanner;
 
/**
* Java program to convert Fahrenheit to Celsius (ºF to ºC) and vice-versa.
*
* @author Javin 
*/
public class FahrenheitCelsiusConversion {
	public static void main(String args[]) {
		 
        Scanner cmd = new Scanner(System.in);
 
        // Converting Fahrenheit to Celsius
        System.out.println("Enter temperature in Fahrenheit :");
        float temperatue = cmd.nextFloat();
        float celsius = toCelsius(temperatue);
        System.out.printf("%.02f degree fahrenheit temperature is equal to %.02f degree celsius %n", temperatue, celsius);
 
        // Converting Celsius to Fahrenheit
        System.out.println("Enter temperature in degree celsius :");
        temperatue = cmd.nextFloat();
        float fahrenheit = toFahrenheit(temperatue);
        System.out.printf("%.02f degree celsius is equal to %.02f degree fahrenheit %n", temperatue, fahrenheit);
    }
 
    /**
     * Method to convert temperature from celsius to fahrenheit
     *
     * @param celsius
     * @return
     */
    public static float toFahrenheit(float celsius) {
        float fahrenheit = 9 * (celsius / 5) + 32;
        return fahrenheit;
    }
 
    /**
    * Converts fahrenheit temperature to celsius
     *
     * @param fahrenheit
     * @return
     */
    public static float toCelsius(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
 
}