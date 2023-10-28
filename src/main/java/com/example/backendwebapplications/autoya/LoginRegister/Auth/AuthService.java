package com.example.backendwebapplications.autoya.LoginRegister.Auth;

import com.example.backendwebapplications.autoya.LoginRegister.Jwt.JwtService;
import com.example.backendwebapplications.autoya.LoginRegister.User.Role;
import com.example.backendwebapplications.autoya.LoginRegister.User.User;
import com.example.backendwebapplications.shared.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private  final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private  final AuthenticationManager authenticationManager;
    public  AuthResponse login (LoginRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }
    public  AuthResponse register (RegisterRequest request){
        User user=User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .firstName(request.getFirstName())

                .birthDate(request.getBirthDate())

                .phoneNumber(request.getPhoneNumber())

//                .phonenumber(request.getPhonenumber())  no recors¡d
                .lastName(request.getLastName())
                .country(request.getCountry())
                .role(request.getRole())
//                .role(Role.USERTENANT)
                .build();
        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }
}
