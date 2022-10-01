/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifmt.maromba2b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List; 

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDB { 
    //private final String url = "jdbc:postgresql://localhost/aulas";
    private final String url = "jdbc:sqlite:maromba1-0.db";
  //  private final String user = "postgres";
    //private final String password = "123456";
    Connection conn = null;
    
    public void connect() { 
        try {
            conn = DriverManager.getConnection(url, null, null);
            System.out.println("Conectado com Sucesso."); 

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
    }
    
    public void inserir(String descricao, String unid, 
            String valprot, String valcal) {
       
        Statement stmt;
        try {
            //stmt = conn.createStatement(); 
            String SQL_INSERT = "insert into alimentos(descricao, unidade, "
                    + "valproteina, valcalorias) "
                    + "  values(?, ?, ?, ?);"; 
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
             preparedStatement.setString(1, descricao);
             preparedStatement.setString(2, unid);
             preparedStatement.setString(3, valprot);
              preparedStatement.setString(4, valcal);
   
              int row = preparedStatement.executeUpdate(); 
            // rows affected
            System.out.println(row); //1 
            } catch (SQLException ex) {
            System.out.println("Erro");
        }
    }
    
    public void remover(String id) { 
        
        String SQL_DELETE = "delete from alimentos where id=?;";
        
        try {
             
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE);
             preparedStatement.setString(1, id); 
   
              int row = preparedStatement.executeUpdate(); 
            // rows affected
            System.out.println(row); //1 
            } catch (SQLException ex) {
            System.out.println("Erro");
        }
    }
    
    public int atualizar(String descricao, String unid, 
            String valprot, String valcal, String id) {
       
        Statement stmt;
        try {
            //stmt = conn.createStatement(); 
            String SQL_INSERT = "update alimentos set descricao=?, unidade=?, "
                    + "valproteina=?, valcalorias=? where id=?;"; 
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
             preparedStatement.setString(1, descricao);
             preparedStatement.setString(2, unid);
             preparedStatement.setString(3, valprot);
              preparedStatement.setString(4, valcal);
              preparedStatement.setString(5, id);  
              int row = preparedStatement.executeUpdate(); 
              return 0; //AQUI
            // rows affected
            } catch (SQLException ex) {
            return 1; // ERRO
        }
    }
    
    public void Listar() {
           Statement stm; 
        try {
            stm = conn.createStatement();
        

                ResultSet rs = stm.executeQuery("select descricao, unidade, "
                        + "valproteina, valcalorias  from alimentos;"); 
                int cont = 0; 
                while (rs.next()){
                    String nome = rs.getString("descricao"); 
                    String unidade = rs.getString("unidade"); 
                    String valproteina = rs.getString("valproteina"); 
                    String valcalorias = rs.getString("valcalorias"); 
                    System.out.println("Nome: "+nome+
                            " unidade: "+unidade+ " valproteina: "+valproteina
                                    + " valcalorias: "+valcalorias);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
        }           
    }
    
     public List<Object []> ListarAlimentos() { // copie aqui
           Statement stm;  
           List<Object []> lista =   new ArrayList<Object []> ();   // copie aqui
        try {
            stm = conn.createStatement(); // copie aqui id, - abaixo
                ResultSet rs = stm.executeQuery("select id, descricao, unidade, "
                        + "valproteina, valcalorias  from alimentos;"); 
                int cont = 0; 
                while (rs.next()){
                    String nome = rs.getString("descricao"); 
                    String unidade = rs.getString("unidade"); 
                    String valproteina = rs.getString("valproteina"); 
                    String valcalorias = rs.getString("valcalorias"); 
                    
                    Object[] data = {rs.getString("id"), // Copie aqui
                        nome, unidade, valproteina, valcalorias};
                    System.out.println(nome);
                    lista.add(data); // copie aqui
                   
                }
                return lista; // copie aqui
            } catch (SQLException ex) {
                ex.printStackTrace(); 
        }       
        return lista; // copie aqui 
    }
     
     
    public static void main(String[] args) {
        ConexaoDB con = new ConexaoDB();
        con.connect();
        
        while(true) {
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Sair");
            Scanner ler = new Scanner(System.in); 
            int opc = ler.nextInt();
            
            if (opc == 1) {
                ler.nextLine();
                System.out.println("Descrição: ");
                String descricao = ler.nextLine();
                System.out.println("Unidade: ");
                String unidade = ler.nextLine();
                 System.out.println("Calorias: ");
                String calorias = ler.nextLine();
                System.out.println("Proteinas: ");
                String proteinas = ler.nextLine();
                
                con.inserir(descricao, unidade,  calorias, proteinas); 
                
            } else if(opc==2) {
                ler.nextLine(); 
                System.out.println("ID para remover: ");
                String idr = ler.nextLine(); 
                con.remover(idr);
            } else if(opc ==3) { 
                con.Listar();
            } else if (opc == 4) {
                ler.nextLine();
                System.out.println("Descrição: ");
                String descricao = ler.nextLine();
                System.out.println("Unidade: ");
                String unidade = ler.nextLine();
                 System.out.println("Calorias: ");
                String calorias = ler.nextLine();
                System.out.println("Proteinas: ");
                String proteinas = ler.nextLine();
                System.out.println("ID: ");
                String ID = ler.nextLine();                
                con.atualizar(descricao, unidade,  calorias, proteinas, ID); 
                
            }  else if(opc ==5) { 
                System.exit(0);
            }
            
            
            
        }
    }

    
    
    
    

}
