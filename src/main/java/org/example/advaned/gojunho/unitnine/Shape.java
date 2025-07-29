package org.example.advaned.gojunho.unitnine;

public abstract class Shape implements Cloneable{
    private String color;

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    public abstract void draw();

    public Shape clone() {
        try{
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Clone not supported",e);
        }
    }
}
