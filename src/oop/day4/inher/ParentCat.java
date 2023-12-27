package oop.day4.inher;

public class ParentCat {
    private String breed;
    ParentCat(){
    }
    ParentCat(String breed){
        this.breed = breed;
    }
    public void eat(){
        System.out.println("냠냠 먹이를 먹다");
    }
    public String getBreed(){ //alt insert
        return breed;
    }
}
