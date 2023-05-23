package com.studyolle.account;

import com.studyolle.account.dto.AccountInDTO.SignUpInDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class AccountControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @DisplayName("회원 가입 화면 보이는지 테스트")
    @Test
    void signUpForm() throws Exception {
        // Create a SignUpInDTO object with sample data
        SignUpInDTO signUpInDTO = new SignUpInDTO();
        signUpInDTO.setEmail("example@example.com");
        signUpInDTO.setNickname("exampleNickname");
        signUpInDTO.setPassword("examplePassword");
        // ... Set other required fields

        // Perform the GET request with the signUpInDTO as a request parameter
        mockMvc.perform(get("/api/sign-up")
                                .param("email", signUpInDTO.getEmail())
                                .param("nickname", signUpInDTO.getNickname())
                                .param("password", signUpInDTO.getPassword())
                        // ... Set other request parameters
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value(signUpInDTO.getEmail()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.nickname").value(signUpInDTO.getNickname()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.password").value(signUpInDTO.getPassword()))
                // ... Add assertions for other response fields
                .andReturn();
    }
}
