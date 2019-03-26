/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduardo.dao;

import com.eduardo.model.Endereco;
import com.eduardo.model.Usuario;
import com.eduardo.factory.Conexao;
import com.eduardo.factory.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class UsuarioDao extends Dao {

    public boolean cadastrar(Usuario obj) {
        EnderecoDao enderecoDao = new EnderecoDao();
        enderecoDao.cadastrar(obj.getEndereco());
        String sql = "insert into usuario(nome,email,telefone,cargo,login,senha,cpf,superior,idEndereco) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getCargo());
            stmt.setString(5, obj.getLogin());
            stmt.setString(6, obj.getSenha());
            stmt.setString(7, obj.getCpf());
            stmt.setString(8, obj.getSuperior());
            stmt.setInt(9, obj.getEndereco().getId());
            System.out.println("Teste: " + obj.getEndereco().getId());

            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

    public List<Usuario> listar() {
        String sql = "select u.nome,u.cargo,u.telefone,u.email,u.cpf,u.login,u.senha,e.rua,e.numero,e.complemento,e.cep from usuario as u "
                + "inner join endereco as e on u.idEndereco = e.id; ";

        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            List<Usuario> listUsuario = new ArrayList<>();

            while (result.next()) {
                Usuario u = new Usuario();
                u.setEndereco(new Endereco());
                u.setNome(result.getString("nome"));
                u.setEmail(result.getString("email"));
                u.setTelefone(result.getString("telefone"));
                u.setCargo(result.getString("cargo"));
                u.setLogin(result.getString("login"));
                u.setSenha(result.getString("senha"));
                u.setCpf(result.getString("cpf"));

                u.getEndereco().setRua((result.getString("e.rua")));
                u.getEndereco().setNumero((result.getInt("e.numero")));
                u.getEndereco().setComplemento((result.getString("e.complemento")));
                u.getEndereco().setCep((result.getInt("e.cep")));

                listUsuario.add(u);

            }

            return listUsuario;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Erro ao cadastrar: " + e.getMessage());
            return null;
        }
    }

    public List<Usuario> listarFiltro(String string, int i) {
        String sql = "select u.nome,u.cargo,u.telefone,u.email,u.cpf,u.login,u.senha,e.rua,e.numero,e.complemento,e.cep from usuario as u "
                + "inner join endereco as e on u.idEndereco = e.id where superior = ? and  u.id <> ?; ";

        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, string);
            stmt.setInt(2, i);
            ResultSet result = stmt.executeQuery();
            List<Usuario> listUsuario = new ArrayList<>();

            while (result.next()) {
                Usuario u = new Usuario();
                u.setEndereco(new Endereco());
                u.setNome(result.getString("nome"));
                u.setEmail(result.getString("email"));
                u.setTelefone(result.getString("telefone"));
                u.setCargo(result.getString("cargo"));
                u.setLogin(result.getString("login"));
                u.setSenha(result.getString("senha"));
                u.setCpf(result.getString("cpf"));

                u.getEndereco().setRua((result.getString("e.rua")));
                u.getEndereco().setNumero((result.getInt("e.numero")));
                u.getEndereco().setComplemento((result.getString("e.complemento")));
                u.getEndereco().setCep((result.getInt("e.cep")));

                listUsuario.add(u);

            }

            return listUsuario;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

}
