package dz7;

public class SamsungPhone extends Phone{


    @Override
    public void info() {
        System.out.println("Samsung Phone:" + getModel()+" "+ getNumber());
    }

}
