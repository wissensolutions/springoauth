package com.myorg.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * AppController
 * SpringOAuth
 * <p>
 */
@RestController
@RequestMapping("/api")
public class AppController {

    @RequestMapping("/hello")
    public Map<String, Object> hallo() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);
        result.put("page", "hallo");

        return result;
    }

    @RequestMapping("/admin")
    public Map<String, Object> admin(Principal user) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);
        result.put("page", "admin");
        result.put("user", user.getName());

        return result;
    }

    @RequestMapping("/staff")
    public Map<String, Object> staff(Principal user) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);
        result.put("page", "staff");
        result.put("user", user.getName());

        return result;
    }

    @RequestMapping("/client")
    public Map<String, Object> client(Principal user) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);
        result.put("page", "client");
        result.put("user", user.getName());

        return result;
    }

    @RequestMapping("/state/new")
    public Map<String, Object> newState(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);

        String state = UUID.randomUUID().toString();
        result.put("state", state);
        session.setAttribute("state", state);

        return result;
    }

    @RequestMapping("/state/verify")
    public Map<String, Object> verify(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);

        String state = (String) session.getAttribute("state");
        result.put("state", state);
        session.removeAttribute("state");

        return result;
    }
}
