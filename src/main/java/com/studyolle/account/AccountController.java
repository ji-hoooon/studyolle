package com.studyolle.account;

import com.studyolle.account.dto.AccountInDTO.SignUpInDTO;
import com.studyolle.account.dto.AccountOutDTO;
import com.studyolle.core.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
//"/", "/login", "/sign-up", "/check-email", "/check-email-token", "/email-login"
//"/check-email-login", "/login-link", "/profile/*"
public class AccountController {

    @GetMapping("/sign-up")
    public ResponseEntity<?> sinUpForm(@RequestBody @Valid SignUpInDTO signUpInDTO){
//        AccountOutDTO.SignUpOutDTO joinOutDTO = userService.회원가입(signUpInDTO);
        ResponseDTO<?> responseDTO = new ResponseDTO<>(signUpInDTO);
        return ResponseEntity.ok(responseDTO);
    }
}
