package com.studyolle.account.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class AccountInDTO {
    @Getter
    @Setter
    public static class SignUpInDTO {
        //이메일 혹은 닉네임 로그인 허용
        @Email
        @Pattern(regexp = "\\S+", message = "이메일에는 공백을 포함할 수 없습니다.")
        @NotEmpty(message = "이메일을 입력하세요.")
        private String email;

        @Size(min = 3, max = 20)
        @Pattern(regexp = "\\S+", message = "닉네임에는 공백을 포함할 수 없습니다.")
        @NotEmpty(message = "닉네임을 입력하세요.")
        private String nickname;

        @NotEmpty(message = "패스워드를 입력하세요.")
        @Size(min = 8, max = 50)
        @Pattern(regexp = "\\S+", message = "패스워드에는 공백을 포함할 수 없습니다.")
        @Pattern(regexp = "^[a-zA-Z0-9!@#$%^&*(),.?\":{}|<>]*$", message = "8자 이상 50자 이내로 입력하세요. 영문자, 숫자, 특수기호를 사용할 수 있으며 공백은 사용할 수 없습니다.")
        private String password;
    }
}
