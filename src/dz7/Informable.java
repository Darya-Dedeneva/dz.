package dz7;

public interface Informable  {
    default String call() {
        return ("Hello");
    }



}
