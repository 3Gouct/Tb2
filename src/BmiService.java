public class BmiService {
    public float calculate(float weight, float growth) {
        float growth2 = (float) (growth / 100);
        float growth3 = (float) (weight / Math.pow (growth2, 2));
        return (float) growth3;
    }
}

