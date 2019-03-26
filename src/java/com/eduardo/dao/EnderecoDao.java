/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduardo.dao;

import com.eduardo.model.Endereco;
import com.eduardo.factory.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eduardo
 */
public class EnderecoDao extends Dao {
    
    public boolean cadastrar(Endereco obj) {
		String sql = "insert into endereco(rua,numero,complemento,bairro,cidade,estado,cep) values(?,?,?,?,?,?,?);";
		try {
			PreparedStatement stmt;
			stmt = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, obj.getRua());
			stmt.setInt(2, obj.getNumero());
			stmt.setString(3, obj.getComplemento());
			stmt.setString(4, obj.getBairro());
			stmt.setString(5, obj.getCidade());
			stmt.setString(6, obj.getEstado());
			stmt.setInt(7, obj.getCep());

			stmt.executeUpdate();
			ResultSet res = stmt.getGeneratedKeys();
            res.next();
            obj.setId(res.getInt(1));
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
