package hamza.learning.com.springSecurityv2.controller;

import hamza.learning.com.springSecurityv2.entity.User;
import hamza.learning.com.springSecurityv2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/protected")
@RequiredArgsConstructor
public class ProtectedController {
    private final UserRepository userRepository;
    @GetMapping
    public String hello(){
        return "Hello I am protected.";
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
