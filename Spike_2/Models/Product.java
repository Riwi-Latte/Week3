package Spike_2.Models;

public class Product {
    
    private String Id;
    private String Name;
    private Double Price;

    public Product(String id,String name, Double price){
        setId(id);
        setName(name);
        setPrice(price);
    }

    public String getId(){
        return Id;
    };

    public String getName(){
        return Name;
    };

    public Double getPrice(){
        return Price;
    }

    public void setId(String id){
        if(id == null){
            System.out.println("El id no puede ser null");
            return;
        }else if (id.isEmpty()){
            System.out.println("El id no puede estar vacio");
            return;
        }else if(id.length()>8){
            System.out.println("El id no puede tener mas de 6 caracteres");
            return;
        };

        this.Id = id;
    }

    public void setName(String name){

        if(name == null){
            System.out.println("El nombre no puede ser null");
            return;
        }else if (name.isEmpty()){
            System.out.println("El nombre no puede estar vacio");
            return;
        };

        this.Name = name;
    }

    public void setPrice(Double price){

        if(price == null){
            System.out.println("El id no puede ser null");
            return;
        }else if (price <= 0){
            System.out.println("El precio no puede ser negativo o igual a cero");
            return;
        };

        this.Price = price;
    }
}
