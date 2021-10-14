package Task2;public class Controller {
    public static void runController() {
        double userIn = Dialog.doDiag();
        double moms = CalculateVat.doVAT(userIn);
        View.doView(moms,Main.MSG);
    }
}
