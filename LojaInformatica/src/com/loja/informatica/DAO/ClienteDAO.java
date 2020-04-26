/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loja.informatica.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.loja.informatica.CONEXAO.ConexaoMYSQL;
import com.loja.informatica.MODEL.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Azazel
 */
public class ClienteDAO {

    public void cadastrarPessoa(Cliente cliente) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
            conexao = conexaoSQL.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO clientes (nome, idade, sexo, rg, cpf, telefone, email, rua, bairro, numero_casa, cep, cidade, senha) VALUES (?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            instrucaoSQL.setString(1, cliente.getNome());
            instrucaoSQL.setInt(2, cliente.getIdade());
            instrucaoSQL.setString(3, cliente.getSexo());
            instrucaoSQL.setInt(4, cliente.getRg());
            instrucaoSQL.setString(5, cliente.getCpf());
            instrucaoSQL.setString(6, cliente.getTelefone());
            instrucaoSQL.setString(7, cliente.getEmail());
            instrucaoSQL.setString(8, cliente.getRua());
            instrucaoSQL.setString(9, cliente.getBairro());
            instrucaoSQL.setInt(10, cliente.getNumeroCasa());
            instrucaoSQL.setInt(11, cliente.getCep());
            instrucaoSQL.setString(12, cliente.getCidade());
            instrucaoSQL.setString(13, cliente.getSenha_1());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    cliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } finally {

            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
                conexaoSQL.fecharConexao();

            } catch (SQLException ex) {
            }
        }

    }

    public boolean login(String emailUsuario, String senhaUsuario) {
        boolean autenticacao = false;
        String emailDB = null, senhaDB = null;
        ResultSet resultado = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Cliente cliente = new Cliente();
            
            ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
            conexao = conexaoSQL.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("SELECT email, senha FROM clientes where email = ? and senha = ?");

            instrucaoSQL.setString(1, emailUsuario);
            instrucaoSQL.setString(2, senhaUsuario); //tanto faz se é senha 1 ou 2 porque a validação da senha é feita antes

            resultado = instrucaoSQL.executeQuery();

            if (resultado.next()) {
                emailDB = resultado.getString("email");
                senhaDB = resultado.getString("senha");
                autenticacao = true;

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro com o banco de dados!", "Aviso", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException();
        } finally {

            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
                conexaoSQL.fecharConexao();

            } catch (SQLException ex) {
            }
        }
        return autenticacao;
    }

}
