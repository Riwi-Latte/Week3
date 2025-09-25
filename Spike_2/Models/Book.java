package Spike_2.Models;

public class Book extends Document {
    
    int Pages;

    public Book(String title, int pages){
        this.Title = title;
        this.Pages = pages;
    }

    @Override
    int pages() {
        return Pages;
    }
}
