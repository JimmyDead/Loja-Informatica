/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loja.informatica.DAO;

import com.loja.informatica.CONEXAO.ConexaoMYSQL;
import com.loja.informatica.MODEL.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Azazel
 */
public class ProdutosDAO {

    public void inserirProdutos(Produtos produtos) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
            conexao = conexaoSQL.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produtosInformatica (computador, armazenamento, processador, memoria_ram, gabinete, cooler, mouse, teclado, headSet) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setString(1, produtos.getComputador());
            instrucaoSQL.setString(2, produtos.getArmazenamento());
            instrucaoSQL.setString(3, produtos.getProcessador());
            instrucaoSQL.setString(4, produtos.getMemoriaRAM());
            instrucaoSQL.setString(5, produtos.getGabinete());
            instrucaoSQL.setString(6, produtos.getCooler());
            instrucaoSQL.setString(7, produtos.getMouse());
            instrucaoSQL.setString(8, produtos.getTeclado());
            instrucaoSQL.setString(9, produtos.getHeadSet());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    produtos.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do produto");
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

    public static ArrayList<Produtos> consultarProdutos() {

        ResultSet resultado = null;
        PreparedStatement instrucaoSQL = null;
        Connection conexao = null;

        ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
        conexao = conexaoSQL.abrirConexao();

        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        try {

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produtosInformatica");

            resultado = instrucaoSQL.executeQuery();

            while (resultado.next()) {
                Produtos produtos = new Produtos();
                produtos.setId(resultado.getInt("id"));
                produtos.setComputador(resultado.getString("computador"));
                produtos.setArmazenamento(resultado.getString("armazenamento"));
                produtos.setProcessador(resultado.getString("processador"));
                produtos.setMemoriaRAM(resultado.getString("memoria_ram"));
                produtos.setGabinete(resultado.getString("gabinete"));
                produtos.setCooler(resultado.getString("cooler"));
                produtos.setMouse(resultado.getString("mouse"));
                produtos.setTeclado(resultado.getString("teclado"));
                produtos.setHeadSet(resultado.getString("headSet"));
                listaProdutos.add(produtos);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexaoSQL.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaProdutos;
    }

    public void atualizarProduto(Produtos produto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
            conexao = conexaoSQL.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("UPDATE produtosInformatica SET computador = ?, armazenamento = ?, processador = ?, memoria_ram = ?, "
                    + "gabinete = ?, cooler = ?, mouse = ?, teclado = ?, headSet = ? WHERE id = ?");

            instrucaoSQL.setString(1, produto.getComputador());
            instrucaoSQL.setString(2, produto.getArmazenamento());
            instrucaoSQL.setString(3, produto.getProcessador());
            instrucaoSQL.setString(4, produto.getMemoriaRAM());
            instrucaoSQL.setString(5, produto.getGabinete());
            instrucaoSQL.setString(6, produto.getCooler());
            instrucaoSQL.setString(7, produto.getMouse());
            instrucaoSQL.setString(8, produto.getTeclado());
            instrucaoSQL.setString(9, produto.getHeadSet());
            instrucaoSQL.setInt(10, produto.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
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
    
    public void excluirProduto(int ID){
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
        try {
            ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
            
            conexao = conexaoSQL.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM produtosInformatica WHERE id = ?");
            instrucaoSQL.setInt(1, ID);
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
        if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
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

    public static ArrayList<Produtos> buscarProduto(String produto) {

        ResultSet resultado = null;
        PreparedStatement instrucaoSQL = null;
        Connection conexao = null;

        ConexaoMYSQL conexaoSQL = new ConexaoMYSQL();
        conexao = conexaoSQL.abrirConexao();

        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        try {

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produtosInformatica WHERE id = ? OR computador = ? OR armazenamento = ? OR processador = ? OR "
                    + "memoria_ram = ? OR gabinete = ? OR cooler = ? OR mouse = ? OR teclado = ? OR headSet = ?");

            instrucaoSQL.setString(1, produto);
            instrucaoSQL.setString(2, produto);
            instrucaoSQL.setString(3, produto);
            instrucaoSQL.setString(4, produto);
            instrucaoSQL.setString(5, produto);
            instrucaoSQL.setString(6, produto);
            instrucaoSQL.setString(7, produto);
            instrucaoSQL.setString(8, produto);
            instrucaoSQL.setString(9, produto);
            instrucaoSQL.setString(10, produto);

            resultado = instrucaoSQL.executeQuery();

            while (resultado.next()) {
                Produtos produtos = new Produtos();
                produtos.setId(resultado.getInt("id"));
                produtos.setComputador(resultado.getString("computador"));
                produtos.setArmazenamento(resultado.getString("armazenamento"));
                produtos.setProcessador(resultado.getString("processador"));
                produtos.setMemoriaRAM(resultado.getString("memoria_ram"));
                produtos.setGabinete(resultado.getString("gabinete"));
                produtos.setCooler(resultado.getString("cooler"));
                produtos.setMouse(resultado.getString("mouse"));
                produtos.setTeclado(resultado.getString("teclado"));
                produtos.setHeadSet(resultado.getString("headSet"));
                listaProdutos.add(produtos);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexaoSQL.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaProdutos;
    }

}
