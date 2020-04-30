import java.util.*;
import java.io.*;

class type3
{
public static void main(String arg[])

{
String str = "int a,b,c";
  
  //BufferedReader br = new BufferedReader(new FileReader(file)); 
  
 
String[] splited = str.split(",");
System.out.println(splited[0]+";");
System.out.println("int "+splited[1]+";");
System.out.println("int "+splited[2]+";");

}
}