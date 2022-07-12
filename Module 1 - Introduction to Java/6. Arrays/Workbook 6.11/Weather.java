import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit;
        fahrenheit= celsiusToFahrenheit(celsius);
        printTemperatures(fahrenheit,"farenheit");
        System.out.println();
        printTemperatures(celsius,"celsius");


        //Task 2, call celsiusToFahrenheit and store the result in the fahrenheit array. 

        //Task 4, Call printTemperatures for celsius and fahrenheit.
    }
    public static void printTemperatures(double[] temp,String type){
        System.out.print(type+": ");
        for (int i = 0;i< temp.length;i++){

            System.out.format("% .2f",temp[i]);
        }
    }
    public static double[] celsiusToFahrenheit(double[] celsius){
        double[] fahrenheit = Arrays.copyOf(celsius,celsius.length);
        for(int i = 0; i<fahrenheit.length;i++){
            fahrenheit[i] = (fahrenheit[i]/5*9) + 32;


        }
        return fahrenheit;




    }




}
