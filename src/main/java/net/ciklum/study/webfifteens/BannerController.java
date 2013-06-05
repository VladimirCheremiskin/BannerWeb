package net.ciklum.study.webfifteens;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;


public class BannerController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("BannerView.jsp");
        BannerStorage storage = new BannerStorage();
        if("Fixed".equals(request.getParameter("displayType"))){
           BannerPrepare fixedBannerPrepare = new FixedBannerPrepare();
            List listToDisplay =  fixedBannerPrepare.getPreparedBanners(Integer.parseInt(getServletContext().getInitParameter("bannersAmount").toString())
                    ,storage.getBannerList());
            getServletContext().setAttribute("listToDisplay",listToDisplay);
        }  else {
            BannerPrepare randomBannerPrepare = new RandomBannerPrepare();
            List listToDisplay =  randomBannerPrepare.getPreparedBanners(Integer.parseInt(getServletContext().getInitParameter("bannersAmount").toString())
                    ,storage.getBannerList());
            getServletContext().setAttribute("listToDisplay",listToDisplay);
        }
        dispatcher.forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("InitialPage.html");
        dispatcher.forward(request,response);
    }
}
