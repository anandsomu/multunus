import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;

import java.io.*;


/**
Author: Anand
Program to write the Input Info into PDf format. This Class uses Itext 5.5.6 to Save the document into PDf format.
The Output is Saved in : OutputInfo.pdf file 

 */
public class WritePdf {

   
	public void writePdf()throws IOException
	{
	String ch;
//New Document	
	Document document = new Document();
// Input Stream
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        try {
            PdfWriter.getInstance(document,new FileOutputStream("OutputInfo.pdf"));//Output File
            document.open();
//Table Creation
         PdfPTable table = new PdfPTable(5);

    
//Table header Rows
    PdfPCell c1 = new PdfPCell(new Phrase("Code Name"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Blood Color"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("No. of Antennas"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
	
	c1 = new PdfPCell(new Phrase("No. of Legs"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
	
	
	c1 = new PdfPCell(new Phrase("Home Planet"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
	
    table.setHeaderRows(1);
	
//Adding Info to the Table
    System.out.println("Enter the Details");
	
	do{
	
	System.out.println("Enter Code Name");
    table.addCell(br.readLine());
	
	System.out.println("Enter Blood Color");
    table.addCell(br.readLine());
	
	System.out.println("Enter No. Of Antennas");
    table.addCell(br.readLine());
	
	System.out.println("Enter No. Of Legs");
    table.addCell(br.readLine());
	
	System.out.println("Enter Home Planet");
    table.addCell(br.readLine());
	
    
	System.out.println("Do you want to Enter Details for Another Alien(Y/N)");
    ch=br.readLine();
	
	}while(ch.equalsIgnoreCase("Y"));
	
	System.out.println("Thank You for Using the Alien Registration Program!\n Exiting...");
	document.add(table);
	
    document.close();
        } catch(Exception e){}

        
		br.close();

  }

	
	
	
	
	
	
}
