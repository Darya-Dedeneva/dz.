package dz7;

public class Main {
    public static void main(String[] args){
      Phone phone = new SamsungPhone ();
      phone.setModel("Samsung E900");
      phone.setNumber(999);
      phone.info();

      XiaomiPhone phone1 = new XiaomiPhone();
      phone1.setModel("Xiaomi 8");
      phone1.setNumber(888);
      phone1.info();

      ApplePhone phone2 = new ApplePhone();
      phone2.setModel("Apple 15");
      phone2.setNumber(111);
      phone2.info();


      Callable unit = phone;
      System.out.println("Calling Valery");// можно так вызвать интерфейс Callable
      phone1.receiveCall("Darya"); // или так
      phone2.receiveCall("Marina");


      phone.call();
      System.out.println("Hello");
      phone1.call();
      System.out.println("Hello");
      phone2.call();
      System.out.println("Hello");












    }




}
