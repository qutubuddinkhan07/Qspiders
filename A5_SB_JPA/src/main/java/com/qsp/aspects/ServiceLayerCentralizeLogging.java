package com.qsp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class ServiceLayerCentralizeLogging {

	@Around("execution(* com.qsp.serviceimpl.*.*(..))")
	public Object loggingAndTimeChecking(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		try {
			Object res = joinPoint.proceed();
			log.info("Method executed " + joinPoint.getSignature().getDeclaringTypeName() + " "
					+ joinPoint.getSignature().getName());
			log.warn("Execution time " + joinPoint.getSignature().getDeclaringTypeName() + " "
					+ joinPoint.getSignature().getName() + " " + (System.currentTimeMillis() - start)); // commit
			return res;
		} catch (Throwable e) {
			log.error("Error occured " + joinPoint.getSignature().getDeclaringTypeName() + " "
					+ joinPoint.getSignature().getName() + " " + e.getMessage());
			log.warn("Execution time " + joinPoint.getSignature().getDeclaringTypeName() + " "
					+ joinPoint.getSignature().getName() + " " + (System.currentTimeMillis() - start)); // rollback
			throw e;
		}
	}
}
