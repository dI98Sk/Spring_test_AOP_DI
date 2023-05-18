package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку пытаются вернуть книгу");

        //long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: Было поймано исключение: " + e);
            throw e;
        }


        //targetMethodResult = "Преступление и наказание";
        //long end = System.currentTimeMillis();
        //long res = end - begin;



        System.out.println("aroundReturnBookLoggingAdvice:  В библиотеку успешно вернули книгу");
        //System.out.println("Метод returnBook выполнил работу за: " + res + " Милесекунд");
        return targetMethodResult;
    }
}
