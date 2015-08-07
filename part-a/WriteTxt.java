import java.io.*;

/**
Author: Anand
Program to write the Input Info into Text format. 
The Output is Saved in : OutputTxt.txt file 

 */



public class WriteTxt
{

//Function to output Details in Text Format
public void writeText()throws IOException
{
String ch;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//String Input=br.readLine();

FileWriter fw=new FileWriter("OutputTxt.txt",false); // Overwriting Existing contents
PrintWriter pw =new PrintWriter(fw);

System.out.println("Enter the Details");
pw.println("Code Name \t Blood Color \t No. of Antennas \t No. Of Legs \t Home Planet");

do{
System.out.println("Enter Code Name");
pw.print(br.readLine()+" \t ");

System.out.println("Enter Blood Color");
pw.print(br.readLine()+" \t ");

System.out.println("Enter No. of Antennas");
pw.print(br.readLine()+" \t ");

System.out.println("Enter No. Of Legs");
pw.print(br.readLine()+" \t ");

System.out.println("Enter Home Planet");
pw.print(br.readLine()+" \t ");

pw.println();
System.out.println("Do you want to Enter Details for Another Alien(Y/N)");
ch=br.readLine();
}while(ch.equalsIgnoreCase("Y"));

System.out.println("Thank You for Using the Alien Registration Program!\n Exiting...");
br.close();
pw.close();
fw.close();

}

}
