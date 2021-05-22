package com.syntel.test;


import java.util.Vector;

import com.qoppa.pdf.form.CheckBoxField;
import com.qoppa.pdf.form.ComboField;
import com.qoppa.pdf.form.FormField;
import com.qoppa.pdf.form.ListField;
import com.qoppa.pdf.form.RadioButtonGroupField;
import com.qoppa.pdf.form.SignatureField;
import com.qoppa.pdf.form.TextField;
import com.qoppa.pdfFields.PDFFields;

public class pdf_form_filler {
	
	public static FormField field=null;
	
	public static String  name=null;
	public static String businessName=null;
	public static String address=null;
	public static String zipCode=null;
	public static String accountNum=null;

	
        // Load the document
		
		public static  String GetEditableValue(String path)
		{
			
			
      try
      {
		
        PDFFields pdfDoc = new PDFFields ( path, null);
        
        // get list of fields
        Vector<FormField> fields = pdfDoc.getFieldList();
        
        //System.out.println("fields");
         
        // loop through the fields
        for (int count = 0; count < fields.size(); ++count) 
        {
          // get field
           field = fields.get(count);
          
          // field name
          System.out.println("Field Name " + field.getFieldName());
          
          // field type description
          System.out.println("Field Type " + field.getFieldTypeDesc());
         
          // text field
          if (field instanceof TextField) 
          {
          //  System.out.println("Value " + ((TextField) field).getValue());
            if(field.getFieldName().contentEquals("f1_1[0]"))
            {
            	name=((TextField) field).getValue();
            // System.out.println(name);
            }
            
            else if(field.getFieldName().contentEquals("f1_2[0]"))
            {
            	businessName=((TextField) field).getValue();
            //	System.out.println(businessName);
            	
            }
            
            else if(field.getFieldName().contentEquals("f1_7[0]"))
            {
            	address=((TextField) field).getValue();
            //	System.out.println(address);
            	
            }
            
            else if(field.getFieldName().contentEquals("f1_8[0]"))
            {
            	zipCode=((TextField) field).getValue();
            	//System.out.println(zipCode);
            	
            }
            
            
            else if(field.getFieldName().contentEquals("f1_10[0]"))
            {
            	accountNum=((TextField) field).getValue();
            	//System.out.println(accountNum);
            	
            }
            
            	
          }
          // radio button field
          else if (field instanceof RadioButtonGroupField) 
          {
            System.out.println("Value " + ((RadioButtonGroupField) field).getValue());
            System.out.println("Default Value " + ((RadioButtonGroupField) field).getDefaultValue());
          }
          // check box field
          else if (field instanceof CheckBoxField) 
          {
            System.out.println("Value " + ((CheckBoxField) field).getValue());
            
            System.out.println("status " + ((CheckBoxField) field).isNoExport());
            System.out.println("Default Value " + ((CheckBoxField) field).getDefaultValue());
          }
          // combo box field
          else if (field instanceof ComboField) 
          {
            System.out.println("Value " +((ComboField) field).getValue());
            System.out.println("Options " +((ComboField) field).getExportOptions());
            System.out.println("Default Value " + ((ComboField) field).getDefaultValue());
          }
          // list field
          else if (field instanceof ListField) 
          {
            System.out.println("Value " + ((ListField) field).getValues());
            System.out.println("Options " + ((ListField) field).getExportOptions());
            System.out.println("Default Values " +((ListField) field).getDefaultValue());
          }
          // signature field
          else if (field instanceof SignatureField) 
          {
            System.out.println("Signature Name " + ((SignatureField) field).getSignName());
            System.out.println("Signature Date " + ((SignatureField) field).getSignDateTime());
          }
        }
    }
    
    catch (Throwable t)
    {
        t.printStackTrace();
    }
			
			return  null;
			
  }
    
}


