package Assignment_8_annotations;

	import java.lang.annotation.*;
	public class Annotations_1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Information i=new Information("extra info");
			Class c = i.getClass();
			java.lang.annotation.Annotation an=c.getAnnotation(Info.class);
			Info in=(Info)an;
			System.out.println(in.Date());
			System.out.println(in.AuthorID());
			System.out.println(in.Time());
			System.out.println(in.version());
			
		}

	}
	@Info(name="malli",version=6,AuthorID=123,Author="kunchalamallikarjun",Date="1.12.1998",Time="12:30")
	class Information{
		String extrainfo;

		public Information(String extrainfo) {
			super();
			this.extrainfo = extrainfo;
		}
		
		
	}

