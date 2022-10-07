package com.spring.kiosk_butcher_shop.user;

import com.spring.kiosk_butcher_shop.exception.ApiResponseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/api/user/register")
    public ResponseEntity<ApiResponseMessage> userRegister(@RequestBody UserRequestDto userRequestDto) throws InterruptedException {
        userService.registerUser(userRequestDto);
        ApiResponseMessage message = new ApiResponseMessage("Success", "회원가입이 완료되었습니다", "", "");
        return new ResponseEntity<ApiResponseMessage>(message, HttpStatus.OK);
    }
}
