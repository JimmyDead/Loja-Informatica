/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loja.informatica.CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azazel
 */
public class ConexaoMYSQL implements InterfaceConexao {

    public static String STATUS = "Não conectado";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static String SERVER = "localhost";
    public static String DATABASE = "lojaInformaticaCrud";

    public static String LOGIN = "root";
    public static String SENHA = "Bemvindo1";

    public static String URL = "";

    public static Connection CONEXAO = null;

    @Override
    public Connection abrirConexao() {
        //To change body of generated methods, choose Tools | Templates.

        URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";

        if (CONEXAO == null) {
            try {

                
                Class.forName(DRIVER);
                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);

                if (CONEXAO != null) {
                    STATUS = "Conexão realizada com sucesso!";
                } else {
                    STATUS = "Não foi possivel realizar a conexão";
                }

            } catch (ClassNotFoundException e) {
                try {
                    

                    throw new ClassNotFoundException("O driver expecificado nao foi encontrado.");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConexaoMYSQL.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException e) {
                try {
                    
                    throw new SQLException("Erro ao estabelecer a conexão (Ex: login ou senha errados).");
                } catch (SQLException ex) {
                    Logger.getLogger(ConexaoMYSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            try {
                
                if (CONEXAO.isClosed()) {
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
                }
            } catch (SQLException ex) {
                try {
                    throw new SQLException("Falha ao fechar a conexão.");
                } catch (SQLException ex1) {
                    Logger.getLogger(ConexaoMYSQL.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }
        return CONEXAO;

    }

    @Override
    public String getStatusConexao() {
        return STATUS;
    }

    @Override
    public boolean fecharConexao() {
        boolean retorno = false;

        try {
            if (CONEXAO != null) {
                if (!CONEXAO.isClosed()) {
                    CONEXAO.close();
                }
            }

            STATUS = "Não conectado";
            retorno = true;

        } catch (SQLException e) {
            retorno = false;
        }

        return retorno;
    }

}
