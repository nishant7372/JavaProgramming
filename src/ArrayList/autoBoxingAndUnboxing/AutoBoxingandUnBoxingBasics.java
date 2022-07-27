package ArrayList.autoBoxingAndUnboxing;

import java.util.ArrayList;

public class AutoBoxingandUnBoxingBasics {

	public static void main(String[] args)
	{
		//int, double ,float and char are primitive data types
		//Integer, Double, Float, Character are wrapper classes
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Double> dblList = new ArrayList<>();
		
		for(int i=0;i<10;i++)
			intList.add(i); 
		//at compile time it converted to intList.add(Integer.valueOf(i));(AutoBoxing)
		
		for(int i=0;i<intList.size();i++)
            System.out.println(intList.get(i)); 
		//at compile time it gets converted to intList.get(i).intValue();(UnBoxing)
		
		for(double i=0.0;i<=20.0;i+=0.5)
			dblList.add(i); 
		//at compile time it converted to dblList.add(Double.valueOf(i));(AutoBoxing)
		
		for(int i=0;i<dblList.size();i++)
            System.out.println(dblList.get(i)); 
		//at compile time it gets converted to dblList.get(i).doubleValue();(UnBoxing)
		
		Integer integer = Integer.valueOf(231); //AutoBoxing
		int a = integer.intValue(); //UnBoxing
		
		Long lng = Long.valueOf(24793274);   //AutoBoxing
		long l = lng.longValue();  //UnBoxing
		
		Double dbl = Double.valueOf(24.324d);  //AutoBoxing
		double d = dbl.doubleValue(); //UnBoxing
		
		Float flt = Float.valueOf(24.3f);  //AutoBoxing
		float f = flt.floatValue(); //UnBoxing
		
		Character character = Character.valueOf('a'); //AutoBoxing
		char ch = character.charValue(); //UnBoxing
		
		
		//Wrapper Classes
		System.out.println(integer.getClass());     //O/p - class java.lang.Integer
		System.out.println(lng.getClass());     //O/p - class java.lang.Long
		System.out.println(dbl.getClass());         //O/p - class java.lang.Double
		System.out.println(flt.getClass());         //O/p - class java.lang.Float
		System.out.println(character.getClass());   //O/p - class java.lang.Character
		
		System.out.println(integer);   //O/p - 231
		System.out.println(a);         //O/p - 231
		System.out.println(lng);       //O/p - 24793274
		System.out.println(l);         //O/p - 24793274
		System.out.println(dbl);       //O/p - 24.324
		System.out.println(d);         //O/p - 24.324    
		System.out.println(flt);       //O/p - 24.3
		System.out.println(f);         //O/p - 24.3
		System.out.println(character); //O/p - a
		System.out.println(ch);        //O/p - a
		
		//Deprecated Methods - has been deprecated since version 9 and marked for removal
		
		@SuppressWarnings("removal")
		Integer i1 = new Integer(12);
		@SuppressWarnings("removal")
		Long l1 = new Long(12342);
		@SuppressWarnings("removal")
		Double d1 = new Double(12.352d);
		@SuppressWarnings("removal")
		Float f1 = new Float(12.3f);
		@SuppressWarnings("removal")
		Character c1 = new Character('a');
		
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(c1);
	}
}
