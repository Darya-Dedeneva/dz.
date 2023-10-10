package dz8;



public class Main {
    public static void main (String[]args) throws CloneNotSupportedException {
        Phone phone = new Phone ();
        phone.setModel("Samsung E900");
        phone.setNumber(999);
        phone.info();


        System.out.println(phone.getModel());
        System.out.println(phone.getNumber());

        Phone phoneClone =(Phone) phone.clone(); // клонируем Phone
        System.out.println("Clone\n" + phoneClone.getModel()+"\n"+ phoneClone.getNumber());



    }
}