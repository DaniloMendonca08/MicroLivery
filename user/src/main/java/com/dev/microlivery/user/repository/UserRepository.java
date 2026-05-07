package com.dev.microlivery.user.repository;

import com.dev.microlivery.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    @NonNull
    Optional<User> findById(@NonNull Long id);

    @NonNull
    Optional<User> findByIdAndEnabledTrue(@NonNull Long id);


}
