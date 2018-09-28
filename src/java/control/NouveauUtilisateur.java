/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modele.Clients;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ClientsService;


/**
 *
 * @author 1895066
 */
public class NouveauUtilisateur extends HttpServlet {

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
        String titre = request.getParameter("title");
        String nom = request.getParameter("name");
        String prenom = request.getParameter("last_name");
        String country = request.getParameter("country");
        String province = request.getParameter("province");
        String zip = request.getParameter("zipcode");
        String ville = request.getParameter("city");
        String adresse = request.getParameter("address");
        String tel = request.getParameter("phone");
        String email = request.getParameter("email");
        String mdp = request.getParameter("password");
        
       
        Clients nouveauClient = new Clients();
        nouveauClient.setTitre(titre);
        nouveauClient.setNom(nom);
        nouveauClient.setPrenom(prenom);
        //nouveauClient.setAdresse(country + ", "+province + ", " + zip +", " + ville +", " + adresse);
        nouveauClient.setEmail(email);
        nouveauClient.setMdp(mdp);
        
        ClientsService cs = new ClientsService();
        cs.save(nouveauClient);  
                                
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.include(request, response);
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
