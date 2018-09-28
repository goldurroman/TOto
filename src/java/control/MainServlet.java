/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modele.Artisans;
import Modele.Gestionnaire;
import Modele.Produits;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.jasper.tagplugins.jstl.ForEach;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author 1895066
 */
public class MainServlet extends HttpServlet {

    private String url;
    private ServletContext sc;
    private RequestDispatcher rd;
    private HttpSession session;
    private Artisans artisan;
    Gestionnaire gs;

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
        response.setContentType("application/json");
        session = request.getSession();
        if (session == null) {
            response.sendRedirect("http://localhost:82/error.html");
        }

        gs = new Gestionnaire();
        gs.setDetails();
        session.setAttribute("lastProducts", gs.getListeProduits());

        String choix = request.getParameter("choix");
        
        
        
         List<Produits> mesProduits = new ArrayList<Produits>();
            mesProduits = gs.findAll();
            ArrayList<String> mesNomDeProduits = new ArrayList<>();

            for (Produits elem : mesProduits) {
                mesNomDeProduits.add(elem.getCodeProduit());
            }

            //Creation d'un objet GSON apres avoir importe la librerie gson-2.8.8.jar
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //Conversion au format JSON des donnes du MaP
            //Conversion au format JSON des donnes du MaP
            String json = gson.toJson(mesNomDeProduits);

           session.setAttribute("json", json);
        
        
     
        if (choix == null) {
            sortByArtisanAndParPage(request, response);
        }
//        else {
//            List<Produits> mesProduits = new ArrayList<Produits>();
//            mesProduits = gs.getProductsByCaracter(choix);
//            ArrayList<String> mesNomDeProduits = new ArrayList<>();
//
//            for (Produits elem : mesProduits) {
//                mesNomDeProduits.add(elem.getCodeProduit());
//            }
//
//            //Creation d'un objet GSON apres avoir importe la librerie gson-2.8.8.jar
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            //Conversion au format JSON des donnes du MaP
//            String json = gson.toJson(mesNomDeProduits);
//            //renvoi d'objet JSON obtenu
//            response.getWriter().write(json);
//        }
    }

    private void sortByArtisanAndParPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String artisanId = request.getParameter("artisanId");
        String pageId = request.getParameter("pageId");

        if (artisanId == null && pageId == null) {
            session.setAttribute("productsPerPage", gs.getListe12Produits());
            sc = getServletContext();
            rd = sc.getRequestDispatcher("/categories.jsp");
            rd.forward(request, response);
        }
        if (artisanId != null) {
            artisan = gs.findArtisanById(artisanId);
            session.setAttribute("artisan", artisan);
        }

        if (pageId != null && artisanId != null) {
            artisan = (Artisans) session.getAttribute("artisan");
            artisanId = artisan.getIdArtisan();
            switch (pageId) {
                case "01":
                    session.setAttribute("productsPerPage", gs.getGroupProductsByArtisansId(artisanId, 0, 12));
                    break;
                case "02":
                    session.setAttribute("productsPerPage", gs.getGroupProductsByArtisansId(artisanId, 11, 12));
                    break;
                case "03":
                    session.setAttribute("productsPerPage", gs.getGroupProductsByArtisansId(artisanId, 23, 12));
                    break;
            }

        }
        if (pageId != null && artisanId == null) {
            switch (pageId) {
                case "01":
                    session.setAttribute("productsPerPage", gs.getGroupProducts(0, 12));
                    break;
                case "02":
                    session.setAttribute("productsPerPage", gs.getGroupProducts(11, 12));
                    break;
                case "03":
                    session.setAttribute("productsPerPage", gs.getGroupProducts(23, 12));
                    break;
            }
        }

        sc = getServletContext();
        rd = sc.getRequestDispatcher("/newjsp.jsp");
        rd.forward(request, response);
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
