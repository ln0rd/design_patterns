package br.com.ln0rd.middlewares;

public class CheckPermissionMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@admin.com")) {
            System.out.printf("Welcome adm");
            return true;
        }

        System.out.println("Bem vindo");
        return checkNext(email, password);
    }
}
