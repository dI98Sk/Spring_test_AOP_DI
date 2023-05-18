package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
/*
    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void allMethodsFromUniLibrary(){
        //
    }
    @Pointcut("execution(*aop.UniLibrary.*())")
    private void returnMagazineFromUniLibrary(){
        //
    }
    @Pointcut("AllMethodsFromUniLibrary() && ! ReturnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){
        //
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
    }

    @Pointcut("execution(*aop.UniLibrary.get*())")
    private void AllGetsMethodsFromUniLibrary(){
        //
    }
    @Pointcut("execution(*aop.UniLabrary.return*())")
    private void AllReturnMethodsFromUniLibrary(){
        //
    }

    @Pointcut("AllReturnMethodsFromUniLibrary() || AllGetsMethodsFromUniLibrary()")
    private void AllReturnAndGetsMethodsFromUniLibrary(){
    }

    @Before("AllGetsMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("Advise before Get Logging Advice: Log #1");
    }

    @Before("AllReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("Advise before Return Logging Advice: Log #2");
    }
    @Before("AllReturnAndGetsMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: Log #3");
    }
    */


    @Before("aop.aspects.MyPoincuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method Signature :" + methodSignature);
        System.out.println("methodSignature.getMethod() :" + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() :" + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() :" + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for (Object obj: arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: Название книги" +
                            myBook.getName() + ", Автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет - " + obj);

                }
            }
        }
        System.out.println("beforeGetBookAdvice:Logging  - try to get book/magazine");
        System.out.println("____________________");
    }

    /*
    @Before("execution(* returnBook())")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnBookAdvice: - try to comeback book");
    }

     */




}
