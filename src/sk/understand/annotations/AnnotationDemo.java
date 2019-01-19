/**
 * Purpose : shows us how to use the user-defined annotation class
 * 
 * !! May need to spend more time understanding this and using examples. For now moving on !! 
 *
 * Date: 31-December-2018
 */

package sk.understand.annotations;

import java.lang.annotation.Annotation;

// Default Author attribute of the above annotation filled automatically
@ClassInformation(version = 0.1f, DateModified = "31-Dec-2018", Reviewers = { "Awesome Person", "Nature", "Proactor" })

public class AnnotationDemo {

	public static void main(String[] args) {
		
		//TODO Write a better Annotation example
		
		System.out.println("-----Program Starts-----");

		Class<AnnotationDemo> cls = AnnotationDemo.class;
		Annotation[] annoList = cls.getAnnotations(); // Getting the list of annotations. Remember this is the annotation superclass
		
		System.out.println(annoList);// checking what is being received

		for (Annotation a : annoList) { 
			System.out.println(a);
			ClassInformation ci = (ClassInformation) a;
			System.out.println(ci.Author());
			System.out.println(ci.version());
			System.out.println(ci.DateModified());
			System.out.println(ci.Reviewers().toString());
		}
		
		System.out.println("-----Program Ends-----");
	}

}
