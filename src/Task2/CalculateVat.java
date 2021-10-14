package Task2;

public class CalculateVat {
    public static double doVAT(double number){
        double VAT = number / 100 * Main.PRCVAT;
        return VAT;
    }
}
