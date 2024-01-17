package isil.java_quiz_server.controller;


import isil.java_quiz_server.modal.User;
import isil.java_quiz_server.repository.UserRepository;
import isil.java_quiz_server.requests.LoginRequest;
import isil.java_quiz_server.response.LoginResponse;
import isil.java_quiz_server.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LoginService loginService;

    @PostMapping("/register")
    User newUser( @RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = loginService.authenticateUser(loginRequest);

        if (loginResponse.isAuthenticated()) {
            return ResponseEntity.ok(loginResponse);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginResponse);
        }
    }


}
