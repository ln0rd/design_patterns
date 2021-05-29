package br.com.ln0rd.middlewares;

import br.com.ln0rd.server.Server;

public class CheckUserMiddleware extends Middleware {

    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.printf("email invalido");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.printf("Email ou senha incorreta");
            return false;
        }

        return checkNext(email, password);
    }
}
