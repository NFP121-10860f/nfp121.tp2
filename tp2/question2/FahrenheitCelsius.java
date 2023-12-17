package question2;
public class FahrenheitCelsius{
    public static void main(String[] args){
        int fahrenheit;
        float celsius;
        try{
            for(int i = 0; i < args.length; i++){
                fahrenheit = Integer.parseInt(args[i]);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
            }
        }
        catch(NumberFormatException e){
            System.out.println("error: " + e.getMessage());
        }
    }
    
    public static float fahrenheitEnCelsius(int f) {
        float x = 5;
        float y = 9;
        float z = (x/y * (f - 32));
        z = z * 10;
        z = (float)Math.floor(z);
        z = z / 10;
        return z;
    }
}