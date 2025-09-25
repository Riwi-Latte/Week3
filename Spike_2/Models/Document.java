package Spike_2.Models;

public abstract class Document {
    
    String Title;

    abstract int pages();

    public String getTitle(){
        return Title;
    }
}
