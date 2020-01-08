package ec.edu.espe.jwt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import ec.edu.espe.jwt.exception.ResourceNotFoundException;
import ec.edu.espe.jwt.models.UserDTO;
import ec.edu.espe.jwt.payload.UserSummary;
import ec.edu.espe.jwt.repository.UserRepository;
import ec.edu.espe.jwt.security.CurrentUser;
import ec.edu.espe.jwt.security.UserPrincipal;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(), currentUser.getName());
        return userSummary;
    }

    @GetMapping("/users/{username}")
    public UserDTO getUserProfile(@PathVariable(value = "username") String username) {
        UserDTO user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
        return user;
    }
}