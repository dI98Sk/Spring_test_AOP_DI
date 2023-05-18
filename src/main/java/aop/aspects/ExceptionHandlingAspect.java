package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPoincuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvie(){
        System.out.println("beforeGetExceptionHandlingAdviсe: ловим исключение");
        System.out.println("____________________");
    }

}
