package aop;

import aop.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    //@Override
    public void getBook(){
        System.out.println("We bring book from School Library!");
    }
}
