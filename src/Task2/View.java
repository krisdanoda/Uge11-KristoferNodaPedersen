package Task2;

public class View {
    public static void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,Main.CURRENCY,Main.MSG);
    }


}
