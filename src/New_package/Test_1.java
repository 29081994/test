package New_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Test_1 {

	
@Test	
public void demo(){
ArrayList<String> names =new ArrayList<String>();
names.add("Ashish");
names.add("Pritesh");
names.add("Aditya");
names.add("Nitin");
names.add("Ani");
int count=0;
for(int i=0;i<names.size();i++)
{
   String howmany=names.get(i);
   if(howmany.startsWith("A")) {
	   
	  count++;
   }
}

System.out.println(count);
}

@Test	
public void stream(){
ArrayList<String> names =new ArrayList<String>();
names.add("Ashish1");
names.add("Pritesh");
names.add("Aditya");
names.add("Nitin");
names.add("Ani");
Long m=names.stream().filter(s ->s.startsWith("A")).count();
System.out.println(m);


  long d=Stream.of("Ashish","Pritesh","Aditya","Nitin","Ani").filter(s->
  {
	  
	 s.startsWith("A");
	 return true;
    }).count();
  
   System.out.println(d);
  // names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));
   names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
  } 

    @Test
    public void streamMap() {
    	
    	ArrayList<String> names =new ArrayList<String>();
    	names.add("Manan");
    	names.add("Roshan");
    	names.add("Floyd");
    	names.add("Xenio");
    	
     Stream.of("Ashish","Pritesh","Aditya","Radhika","sahil").filter(d->d.endsWith("a")).map(d->d.toUpperCase()).
     forEach(d->System.out.println(d));
     
     List<String>names1=Arrays.asList("Ashish","Pritesh","Aditya","Radhika","Anmol");
     names1.stream().filter(w->w.startsWith("A")).sorted().map(w->w.toUpperCase()).forEach(w->System.out.println(w));
     //Merging to streams
     Stream<String>newStream=Stream.concat(names.stream(), names1.stream());
    // newStream.sorted().forEach(s->System.out.println(s));
     boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Anmol"));
     System.out.println(flag);
     Assert.assertTrue(flag);
    }
   
    
    @Test
    public void streamCollection()
    {
    	List<String>ls=Stream.of("Ashish","Pritesh","Aditya","Radhika","sahil").filter(d->d.endsWith("a")).map(d->d.toUpperCase())
    	.collect(Collectors.toList());
    	System.out.println(ls.get(0));
    	
    	
    	
    	
    	List<Integer>Numbers=Arrays.asList(2,4,3,2,5,4,7,8,7,9);
    	List<Integer> ts=Numbers.stream().distinct().sorted().collect(Collectors.toList());
    	System.out.println(ts.get(2));
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

