package dz6;

public class ApplePhone extends Phone{
    private int number;

    private String model;

    public ApplePhone() {
    }

    public ApplePhone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getModel() {
        return model;
    }
    public void info(){
        System.out.printf("Phone: model - %s, number - %d", getModel(), number);
    }


}
