package dz7;

public class ApplePhone extends Phone{


    @Override
    public void info() {
        System.out.println("Apple Phone:"+getModel()+" "+ getNumber());
    }
}
