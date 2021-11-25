package test.day3.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//whether it executes during runtime or after compiled
@Retention(RetentionPolicy.RUNTIME)
//the target where annotion is allowed, it can be method, or class, or variable
@Target(ElementType.METHOD)

public @interface MarkerAnnotation {
	int value();
}
