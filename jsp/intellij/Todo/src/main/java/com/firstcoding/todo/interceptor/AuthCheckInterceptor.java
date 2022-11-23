package com.firstcoding.todo.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {

        log.info(" >>>>>>> 회원 로그인 여부 체크...");

        // 회원 로그인 상태 체크
        HttpSession httpSession = httpServletRequest.getSession(false);

        // 회원이 로그인 상태이다!!!
        if(httpSession != null && httpSession.getAttribute("loginInfoDTO") != null) {
            // 로그인 상태!!
            log.info("로그인 상태!!!");
            return true;
        }

        log.info("비 로그인 상태!!!");
        httpServletResponse.sendRedirect("/login");
        return false;
    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(httpServletRequest, httpServletResponse, handler, modelAndView);
    }


    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(httpServletRequest, httpServletResponse, handler, ex);
    }
}
