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
import com.itextpdf.text.pdf.PdfWriter; /**
* This class is used to create a pdf file using iText jar.
* @author w3spoint
*/
public class GerarPDF {

    public GerarPDF() {
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
            PdfPTable pdfPTable = new PdfPTable(4);
            //Create cells
            PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Cell 1"));
            PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Cell 2"));
            PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("Cell 3"));
            PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("Cell 4"));
            //Add cells to table
            pdfPTable.addCell(pdfPCell1);
            pdfPTable.addCell(pdfPCell2);
            pdfPTable.addCell(pdfPCell3);
            pdfPTable.addCell(pdfPCell4); //Add content to the document using Table objects.
            document.add(pdfPTable);
            //Close document and outputStream.
            document.close();
            outputStream.close();
            System.out.println("Pdf created successfully.");
        } catch (Exception e) {
         e.printStackTrace();
        }
    
    }
    
    
    }}