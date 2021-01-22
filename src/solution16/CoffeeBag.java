package solution16;

public class CoffeeBag {
    double pricePerLb;
    int numberOfBags;
    int bagWeight;

    public double getPricePerLb() {
        return pricePerLb;
    }

    public void setPricePerLb(double pricePerLb) {
        this.pricePerLb = pricePerLb;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public int getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }
    public double getTotalPrice()
    {
         return getBagWeight() * getNumberOfBags() * getPricePerLb();
    }
    public double getTotalPriceWithTax(double taxRate)
    {
        return getTotalPrice() + (getTotalPrice() * taxRate);
    }
}
