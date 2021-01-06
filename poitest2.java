package collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class poitest2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
 FileOutputStream fos=new FileOutputStream("poiexcel.csv",true);
 PrintWriter pw = new PrintWriter(fos);
String name="raja";
int age=40;
double weight=80;
 
 pw.println("name,age,weight");
 pw.println("sumi,16,50");
 pw.println(name+","+ age + "," +weight);  
 pw.close();
 
 System.out.println("poiexcel.csv file was successfully opened");
	}

}
