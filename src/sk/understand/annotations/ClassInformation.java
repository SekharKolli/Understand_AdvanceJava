/**
 * Purpose : Create an user defined annotation.
 * 
 * Here we are creating an annotation called ClassInformation where we are going
 * to store 4 things 1\ author 2\ version 3\ dateModified 4\ reviewers
 *
 * Date: 31-December-2018
 */

package sk.understand.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(TYPE)
public @interface ClassInformation {
	 String Author() default "SK Team"; // Annotations can have default values using the default keyword
	 float version() default 0.0f; 
	 String DateModified();
	 String[] Reviewers(); // or One dimensional arrays

	 //Only primitive type, String, Class, annotation, enumeration are permitted or 1-dimensional arrays thereof when declaring a user-defined annotation
} 
