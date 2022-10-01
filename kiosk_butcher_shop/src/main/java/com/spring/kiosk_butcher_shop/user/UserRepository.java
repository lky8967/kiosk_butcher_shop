package com.spring.kiosk_butcher_shop.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {

    void save();
}
