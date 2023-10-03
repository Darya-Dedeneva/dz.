package dz6;

public class Main {
    public static void main (String[]args){
        Phone phone = new  Phone();
        Phone phone1 = new Phone(111,"Bladberry 10");
        Phone phone2 = new Phone(333,"Samsung E900");
        SamsungPhone SamsungPhone =  new SamsungPhone ( 444, "SamsungPhone");
        XiaomiPhone XiaomiPhone = new XiaomiPhone (555,"XiaomiPhone");
        ApplePhone ApplePhone = new ApplePhone(777, "ApplePhone");




        phone.info();
        phone1.info();
        phone2.info();
        SamsungPhone.info();
        XiaomiPhone.info();
        ApplePhone.info();


        System.out.println(phone.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(SamsungPhone.getNumber());
        System.out.println(XiaomiPhone.getNumber());
        System.out.println(ApplePhone.getNumber());

        phone.receiveCall("Valery");
        phone1.receiveCall("Darya");
        phone2.receiveCall("Marina");
        SamsungPhone.receiveCall("Svetlana");
        XiaomiPhone.receiveCall("Irina");
        ApplePhone.receiveCall("Dmitry");


    }
}
