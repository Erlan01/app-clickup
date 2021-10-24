package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pdp.uz.enums.SystemRoleName;
import pdp.uz.template.AbsUUIDEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User extends AbsUUIDEntity implements UserDetails {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

    @Column
    private String color;

    @Column
    private String initialLetter;

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatar;

    private boolean enabled;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;


    @Enumerated(value = EnumType.STRING)
    private SystemRoleName systemRoleName;

    private String emailCode;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(this.systemRoleName.name());
        return Collections.singletonList(simpleGrantedAuthority);
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    public User(String fullName, String email, String password, SystemRoleName systemRoleName) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.systemRoleName = systemRoleName;
    }


}
