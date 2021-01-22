package solution14;

public class WeightConverter {
    int weight;
    double moonGravity;

    public WeightConverter(double moonGravity) {
        this.moonGravity = moonGravity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getMoonWeight(double earthGravity)
    {
        return (getWeight()/earthGravity)*moonGravity;
    }
}
