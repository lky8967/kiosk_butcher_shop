package com.spring.kiosk_butcher_shop.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public void registerUser(UserRequestDto userRequestDto) {

        String username = userRequestDto.getUsername();
        String phoneNum = userRequestDto.getPhoneNum();
        Long reservesPoint = userRequestDto.getReservesPoint();

        User.save(username, phoneNum , reservesPoint);

    }
}
