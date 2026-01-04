// Declare a variable "temperature" and initialise it with a value of 25.5 (in Celsius) and 
// Print it in Celsius and Kelvin(add 273 to temperature in Celsius).
// Print the output in the same format as given below.(there is a single space around - (hyphen))



public class Ques6 {
    public static void main(String[] args) {
        double temperature = 25.5;

        double kelvin = temperature + 273;

        System.out.println("Celsius - " + temperature + "\n" + "Kelvin - " + kelvin);
    }
}

