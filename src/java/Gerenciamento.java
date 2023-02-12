/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import colecoespack.User;
import colecoespack.Albuns;
/**
 *
 * @author Iasmim
 */
@WebServlet(urlPatterns = {"/Gerenciamento"})
public class Gerenciamento extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            User u = new User();
            int operacao = Integer.parseInt(request.getParameter("operacao"));

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Gerenciamento</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Gerenciamento at " + request.getContextPath() + "</h1>");
            switch (operacao) {
                case 1:
                    String nome = request.getParameter("nome");
                    String email = request.getParameter("email");
                    String senha = request.getParameter("senha");

                    
                    u.setNome(nome);
                    u.setEmail(email);
                    u.setSenha(senha);
                    if (u.cadastraUser()) {
                        out.println("<div class=\"alert alert-success mt-5\" role=\"alert\">"
                                + "O usuário foi cadastrado com sucesso!"
                                + "</div>");
                    } else {
                        out.println("<div class=\"alert alert-danger mt-5\" role=\"alert\">"
                                + "Erro ao cadastrar usuário!"
                                + "</div>");
                    }
                    break;
            }

            out.print("<button type=\"button\" onclick=\"history.back()\" class=\"btn btn-outline-secondary mt-2\">"
                    + "<i class=\"bi bi-arrow-left-circle-fill\">" + "</i>"
                    + "Voltar"
                    + "</button>");
            out.print("</div>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
