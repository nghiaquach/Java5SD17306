package com.fpoly.config;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.fpoly.model.Account;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Service
public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    HttpSession session;

    @Autowired
    HttpServletRequest httpRequest;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String uri = request.getRequestURI();
        Account user = (Account) session.getAttribute("user");
        String error = "";
        if (user == null) {
            error = "Please login!";
        } else if (!user.isAdmin() && uri.startsWith("/admin")) {
            error = "Access denied!";
        }

        if (error.length() > 0) {
            session.setAttribute("security-uri", uri);
            response.sendRedirect("/errorpage?error=" + error);
            return false;
        }
        return true;
    }
}
