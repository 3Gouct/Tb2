public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        float weight = 65;
        float growth = 175;
        float bmi = (float) service.calculate (weight, growth);
        System.out.println (bmi);
    }
}
