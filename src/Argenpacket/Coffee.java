package Argenpacket;

public class Coffee {
    private String name;
    private String CountyOfOrigin;
    private int AmountOfCoffee;
    private int AmountOfMilk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountyOfOrigin() {
        return CountyOfOrigin;
    }

    public void setCountyOfOrigin(String countyOfOrigin) {
        CountyOfOrigin = countyOfOrigin;
    }

    public int getAmountOfCoffee() {
        return AmountOfCoffee;
    }

    public void setAmountOfCoffee(int amountOfCoffee) {
        AmountOfCoffee = amountOfCoffee;
    }

    public int getAmountOfMilk() {
        return AmountOfMilk;
    }

    public void setAmountOfMilk(int amountOfMilk) {
        AmountOfMilk = amountOfMilk;
    }

    public void method(){
        System.out.println("sizdin kofeniz dayar");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", CountyOfOrigin='" + CountyOfOrigin + '\'' +
                ", AmountOfCoffee=" + AmountOfCoffee +
                ", AmountOfMilk=" + AmountOfMilk +
                '}';
    }
}
