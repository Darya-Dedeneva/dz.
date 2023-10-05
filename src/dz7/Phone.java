package dz7;

public abstract class Phone implements Callable, Informable { //  implements - связывает итерфейс с классом Phone
    //(прописываем через ",")/ добовляем через Generate

    private String model;
    private int number;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public abstract void info();


    @Override
    public void receiveCall(String name) {
        System.out.printf("Calling %s\n", name);
    }


    @Override
    public String call() {
        return Informable.super.call();

    }
}



