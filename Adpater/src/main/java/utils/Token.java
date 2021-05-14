package utils;

public class Token {

    private String token;

    public Token() {
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoibGVvIiwicGFzcyI6MTIzNDV9.B08jMAz_44AbTTdCljD3kKa3AVRwehnQcmiLQY7-bM4";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                '}';
    }
}
