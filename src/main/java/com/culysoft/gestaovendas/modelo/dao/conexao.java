/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.culysoft.gestaovendas.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author rafael
 */
public interface conexao {
    public Connection obterConexao() throws SQLException;
}
