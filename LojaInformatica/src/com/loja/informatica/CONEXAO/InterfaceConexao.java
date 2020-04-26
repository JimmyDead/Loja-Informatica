/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loja.informatica.CONEXAO;

import java.sql.Connection;

public interface InterfaceConexao {

    public Connection abrirConexao();

    public String getStatusConexao();

    public boolean fecharConexao();

}
