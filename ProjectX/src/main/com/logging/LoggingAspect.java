package main.com.logging;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@Aspect
public class LoggingAspect {
	

    
public LoggingAspect() {
System.out.println("This is logging aspect");
}


@AfterReturning(pointcut = "execution(* main.com.hibernateDao.SuperHeroDAO.*(..))", returning="retVal")
public void afterReturningAdvice(JoinPoint jp ,Object retVal){
    System.out.println("After returning from  method:"+jp.getSignature().getName());
   System.out.println("Returning  : " + retVal);
}

@After("execution(* main.com.hibernateDao.SuperHeroDAO.*(..))")
public void printAfter(JoinPoint jp){
	System.out.println("After calling method:"+jp.getSignature().getName());
}

@Before("execution(* main.com.hibernateDao.SuperHeroDAO.*(..))")
public void printBefore(JoinPoint jp ){
	System.out.println("Before calling method:"+jp.getSignature().getName());
	
}

@AfterThrowing(
          pointcut = "execution(* main.com.hibernateDao.SuperHeroDAO.getSuperHeroDetails(..))",
          throwing= "error")
public void afterThrowingException(JoinPoint joinPoint, Throwable error){
    System.out.println("The exception is thrown is : "+error);
}

	
}
