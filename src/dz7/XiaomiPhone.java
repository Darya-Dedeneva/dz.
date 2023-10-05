package dz7;

public  class XiaomiPhone extends Phone{


    @Override
    public void info() {
        System.out.println("Xiaomi Phone:"+ getModel()+" "+ getNumber());
    }
}
