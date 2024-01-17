package isil.java_quiz_server.response;

import isil.java_quiz_server.modal.User;

public class LoginResponse {
    private User user;
    private boolean isAuthenticated;

    public LoginResponse(User user, boolean isAuthenticated) {
        this.user = user;
        this.isAuthenticated = isAuthenticated;
    }

    public User getUser() {
        return user;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
