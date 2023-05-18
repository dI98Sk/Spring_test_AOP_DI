package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //@Override
    public void getBook(){
        System.out.println("We bring book from University library!");
        System.out.println("____________________");
    }

    public String returnBook(){
        int a = 10/0;

        System.out.println("We comeback book in University library!");
        return "Война и мир";
        //System.out.println("____________________");
    }

    public void getMagazine(){
        System.out.println("We bring magazine from University library!");
        System.out.println("____________________");
    }

    public void returnMagazine(){
        System.out.println("We comeback book in University library!");
        System.out.println("____________________");
    }

    public void addBook(String personName, Book book){
        System.out.println("We add book in University library!");

    }

    public void addMagazine(){
        System.out.println("We add magazine in University library!");
        System.out.println("____________________");
    }
}
