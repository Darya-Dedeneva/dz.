package dz6;

public class SamsungPhone extends Phone{

    private int number;

    private String model;

    public SamsungPhone() {

    }

    public SamsungPhone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public SamsungPhone(int number, String model, int number1, String model1) {
        super(number, model);
        this.number = number1;
        this.model = model1;
    }

    @Override
    public String getModel() {
        return model;
    }


    public void info() {
        System.out.printf("Phone: model - %s, number - %d", getModel(), number);


    }
}
