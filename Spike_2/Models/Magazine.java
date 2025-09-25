package Spike_2.Models;

public class Magazine extends Document{
    
    int pagesPerEdition;

    public Magazine(String title, int pages){
        this.Title = title;
        this.pagesPerEdition = pages;
    }

    @Override
    int pages() {
        return pagesPerEdition;
    }
}
