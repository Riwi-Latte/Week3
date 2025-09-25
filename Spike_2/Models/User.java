package Spike_2.Models;

public class User implements Storable{
    
    private String Id;
    private String Name;


    public User(String id, String name){
        this.Id = id;
        this.Name = name;
    }

    @Override
    public String Key() {
        
        return Id;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }
}
