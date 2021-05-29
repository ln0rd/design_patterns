package br.com.ln0rd;

import br.com.ln0rd.middlewares.CheckPermissionMiddleware;
import br.com.ln0rd.middlewares.CheckUserMiddleware;
import br.com.ln0rd.middlewares.Middleware;
import br.com.ln0rd.server.Server;

public class Main {

    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("admin@admin.com", "124543");
        server.registerUser("user@user.com", "123");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) {
        init();
        server.login("admin@admin.com", "124543");
    }
}
