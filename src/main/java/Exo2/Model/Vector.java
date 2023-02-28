package Exo2.Model;

public class Vector {

    private int[] values;

    //Constructeur
    public Vector() {
        this.values = new int[0];
    }

    public Vector(int[] values) {
        this.values = values;
    }

    //Getters & Setters
    public int[] getValues() {
        return values;
    }
    public void setValues(int[] values) {
        this.values = values;
    }
}