package dz6;
abstract class Phones{
    String model;
    public void calling(){
        System.out.println("Calling");
    }
}

public  class Phone {

    private int number;
    private String model;
    private double wight;

    public  Phone() {
    }

    public  Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public  Phone(int number, String model, double wight) {
        this.number = number;
        this.model = model;
        this.wight = wight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWight() {
        return wight;
    }
    public void info() {
        System.out.printf("Phone: model - %s, number - %d, wight - %.2f \n", getModel(), number, wight);

    }
    public void receiveCall(String name){
        System.out.printf("Calling %s\n", name);
    }



}





