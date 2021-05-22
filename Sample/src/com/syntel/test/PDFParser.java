package com.syntel.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class PDFParser {

	public static void main(String[] args) {
		File file = new File("C:/Users/ARKA-PC/Desktop/w9pdf.pdf");
		String string = null;
		try {
			PDDocument document = null;
			try {
				document = PDDocument.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PDFTextStripper pdfTextStripper = new PDFLayoutTextStripper();
			string = pdfTextStripper.getText(document);
			System.out.println(string);
			
		
			
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String formType=null;
		
		
		 pdf_form_filler.GetEditableValue("C:/Users/ARKA-PC/Desktop/w9pdf.pdf");
	            
		Scanner scanner = new Scanner(string);
		while (scanner.hasNextLine()) {
		  String line = scanner.nextLine();
		 /* if(line.contains("Name (as shown on your income tax return)."))
		  {
			 
			  
			  name=scanner.nextLine();
		  }*/
		  
		   if(line.contains("Give  Form  to the"))
		  {
			  formType= line.substring(14,23).trim();
			  break;
			  
		  }
		  
			/*
			 * else if(line.contains("Address (number, street, and apt. or suite no.)")) {
			 * address=scanner.nextLine();
			 * while(!scanner.nextLine().contains("City, state, and ZIP")) {
			 * address=address+address; } }
			 * 
			 * else if(line.contains("City, state, and ZIP")) { zipcode=scanner.nextLine();
			 * }
			 */
		}
		scanner.close();
		
		
		
		System.out.println("Form Type" +formType);
		System.out.println("Name" +pdf_form_filler.name);
		System.out.println("Address" +pdf_form_filler.address);
		System.out.println("zipcode" +pdf_form_filler.zipCode);
		System.out.println("Account number" +pdf_form_filler.accountNum);
		
		pdf_form_filler.field=null;
	}

}