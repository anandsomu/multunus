import java.io.*;

/** 
Main Class to Call the Member Classes
Author : Anand
Java Version: 1.7
*/
/**
Problem Statement:
A treaty of friendship has been signed between Aliens and Humans. 
The aliens are now welcome on Earth and can stay as long as they wish with the Humans.
You are the person responsible to register the aliens.

Part A: 
Create a console based application that accepts alien details like Code Name, Blood Color, No.of Antennas, No. of Legs and Home Planet and then export
these details into one of the 2 formats, depending on user’s choice -".txt" or ",PDF".
*/

//This Part Conatins The Solution to Part A
public class Main{

public static void main(String args[])throws IOException
{
String ch="n";

System.out.println("Welcome To Aliens and Human Program");
System.out.println("Enter Your  Choice:\n 1-->To save to Text Format(.txt) \n2-->To save to Text Format(.pdf)");

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
ch=br.readLine();

//Calling Class for text Output
if(ch.equalsIgnoreCase("1"))
{
WriteTxt wt=new WriteTxt();
wt.writeText();
}
//Calling Class for PDf Output
else if(ch.equalsIgnoreCase("2"))
{
WritePdf wp=new WritePdf();
wp.writePdf();
}
else
System.out.println("No Such Choice \n Exiting...");

}
}
