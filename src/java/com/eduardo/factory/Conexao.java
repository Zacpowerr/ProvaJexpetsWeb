package com.eduardo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/bancousuario";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection conexao;

    /**
     * Chamada singlethon da conex�o
     *
     * @return
     */
    public static Connection getConexao() {
        if (conexao == null) {
            try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
                conexao = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Conectou...");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("Mensagem de erro " + e.getMessage());
            }
        }
        return conexao;
    }

}
