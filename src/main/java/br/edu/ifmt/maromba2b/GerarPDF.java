/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmt.maromba2b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter; 

import java.util.List;
 
 /**
* This class is used to create a pdf file using iText jar.
* @author w3spoint
*/
public class GerarPDF {

    public GerarPDF(List<Object []> alimentoslist) {
        try {
            //Create Document instance.
            Document document = new Document();
            //Create OutputStream instance.
            OutputStream outputStream =
            new FileOutputStream(new File("RelatorioPDF.pdf"));
            //Create PDFWriter instance.
            PdfWriter.getInstance(document, outputStream);
            //Open the document.
            document.open();
            //Create Table object, Here 4 specify the no. of columns
            PdfPTable pdfPTable = new PdfPTable(2);
            //Create cells
            PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("ID"));
            PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Nome"));
            
            pdfPTable.addCell(pdfPCell1);
            pdfPTable.addCell(pdfPCell2);
            
            String data="";
            for (Object[] al: alimentoslist) { 
                    /// data += al[0] +" "+al[1] +"\n"; 
                     
                    PdfPCell col1 = new PdfPCell(new Paragraph(al[0]+""));
                    PdfPCell col2 = new PdfPCell(new Paragraph(al[1]+""));

                    pdfPTable.addCell(col1);
                    pdfPTable.addCell(col2);
             }
            document.add(new Paragraph("LISTA DE ALIMENTOS"));
            document.add(new Paragraph(""));

           
            
            document.add(pdfPTable);
            //Close document and outputStream.
            document.close();
            outputStream.close();
            System.out.println("Pdf created successfully.");
            
            try {
                Process process; 
               process = Runtime.getRuntime()
               .exec(String.format("evince %s", "RelatorioPDF.pdf"));

           } catch (Exception e) {
               e.printStackTrace();
           }
            
        } catch (Exception e) {
         e.printStackTrace();
        }
    
    }
    
    
    }