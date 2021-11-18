package Assignment_8_annotations;


	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Info {
		String name();
		String supervisor()default "****";
		int version();
		int AuthorID();
		String Author() default "KIRTIK";
		String Date();
		String Time();
		String desp() default "hello its annotation program";
		
	}
