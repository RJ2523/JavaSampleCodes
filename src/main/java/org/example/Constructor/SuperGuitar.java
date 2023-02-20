package org.example.Constructor;

public class SuperGuitar extends Guitar{
    private Boolean electric;

    public SuperGuitar(Boolean electric){
        super();
        this.electric = electric;
    }
    public SuperGuitar(){
        super();
        new SuperGuitar(false);
    }

    public Boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }
}
