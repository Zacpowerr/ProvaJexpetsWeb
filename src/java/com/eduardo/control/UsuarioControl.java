/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduardo.control;

import com.eduardo.dao.UsuarioDao;
import com.eduardo.model.Endereco;
import com.eduardo.model.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eduardo
 */
@WebServlet(name = "UsuarioControl", urlPatterns = {"/UsuarioControl"})
public class UsuarioControl extends HttpServlet {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private Usuario usuario;
    private Endereco endereco;
    private RequestDispatcher rd;
    private UsuarioDao usuarioDao;

    protected void processRequest()
            throws ServletException, IOException {
        String cmd = request.getParameter("cmd");
        switch (cmd) {
            case "salvar":
                salvar();
                break;
        }

        rd.forward(request, response);
    }

    public void salvar() {
        usuario = new Usuario();
        endereco = new Endereco();

        usuario.setNome(request.getParameter("Nome"));
        usuario.setCpf(request.getParameter("Cpf"));
        usuario.setEmail(request.getParameter("Email"));
        usuario.setCargo(request.getParameter("Cargo"));
        usuario.setSuperior(request.getParameter("Superior"));
        usuario.setCargo(request.getParameter("Cargo"));
        usuario.setSenha(request.getParameter("Senha"));
        usuario.setLogin(request.getParameter("Login"));
        usuario.setTelefone((request.getParameter("Telefone")));
        //Endereco
        endereco.setRua(request.getParameter("Rua"));
        endereco.setBairro(request.getParameter("Bairro"));
        endereco.setNumero(Integer.parseInt(request.getParameter("Numero")));
        endereco.setComplemento(request.getParameter("Complemento"));
        endereco.setCidade(request.getParameter("Cidade"));
        endereco.setCep(Integer.parseInt(request.getParameter("Cep")));
        endereco.setEstado(request.getParameter("Estado"));
        usuario.setEndereco(endereco);

        try {
            usuarioDao = new UsuarioDao();
            usuarioDao.cadastrar(usuario);

            request.setAttribute("msg", "Cadastro efetuado");
            mostrarDados();
        } catch (Exception e) {
        }

    }

    private void mostrarDados() {
        List<Usuario> usuarios = usuarioDao.listar();
        rd = request.getRequestDispatcher("listagem.jsp");
        request.setAttribute("usuarios", usuarios);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.request = request;
        this.response = response;
        processRequest();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.request = request;
        this.response = response;
        processRequest();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
