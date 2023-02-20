package org.example.Constructor;

public class Guitar {
    private String name;
    private String model;
    private int volume;

    public Guitar(String name, String model) {
       this(name,model,50);
    }
    public Guitar(){
        this("Jbass","Accoustic",100);
        System.out.println(this);
    }
    public Guitar(String name, String model, int volume){
        this.name = name;
        this.model = model;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
