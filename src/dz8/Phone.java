package dz8;

public class Phone  implements Cloneable {
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

    @Override // добавляем операцию клонирования + implements Cloneable
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void info() {

    }
}
