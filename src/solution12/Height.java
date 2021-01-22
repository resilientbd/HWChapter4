package solution12;

public class Height {
    double height;
    int age;

    public Height() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getRecommendedWeight()
    {
        return ((getHeight() - 100 + getAge() / 10) * 0.90);
    }
}
