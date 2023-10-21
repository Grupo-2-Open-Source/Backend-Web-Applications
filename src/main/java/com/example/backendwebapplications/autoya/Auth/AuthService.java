package com.example.backendwebapplications.autoya.Auth;

import com.example.backendwebapplications.autoya.Jwt.JwtService;
import com.example.backendwebapplications.autoya.User.Role;
import com.example.backendwebapplications.autoya.User.User;
import com.example.backendwebapplications.shared.domain.model.entities.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private  final UserRepository userRepository;
    private final JwtService jwtService;
    public  AuthResponse login (LoginRequest request){
        return null;
    }
    public  AuthResponse register (RegisterRequest request){
        User user=User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .country(request.getCountry())
                .role(Role.USER)
                .build();
        userRepository.save(user);
        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }
}
