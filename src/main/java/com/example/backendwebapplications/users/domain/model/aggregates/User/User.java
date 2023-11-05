package com.example.backendwebapplications.users.domain.model.aggregates.User;

import com.example.backendwebapplications.profile.domain.model.valueobjects.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user",uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class User  implements UserDetails {
    @Id
    @GeneratedValue
    Integer id;

    @Column(nullable = false)

   String username;

    String password;

    @Embedded
    public LastName lastName;
    @Embedded
    public FirstName firstName;
    @Embedded
    public BirthDate birthDate;
//    Long phonenumber;

    @Embedded
    public PhoneNumber phoneNumber;


    String country;


    @Enumerated(EnumType.STRING)
    Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
