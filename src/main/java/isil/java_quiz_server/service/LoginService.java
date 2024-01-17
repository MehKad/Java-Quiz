package isil.java_quiz_server.service;

import isil.java_quiz_server.modal.User;
import isil.java_quiz_server.repository.UserRepository;
import isil.java_quiz_server.requests.LoginRequest;
import isil.java_quiz_server.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public LoginResponse authenticateUser(LoginRequest loginRequest) {
        User user = userRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        boolean isAuthenticated = user != null;

        return new LoginResponse(user, isAuthenticated);
    }
}
