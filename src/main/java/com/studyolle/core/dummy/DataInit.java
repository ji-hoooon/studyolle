//package com.studyolle.core.dummy;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//import shop.mtcoding.restend.model.user.UserRepository;
//
//@Component
//public class DataInit extends DummyEntity{
//
//    @Profile("dev")
//    @Bean
//    CommandLineRunner init(UserRepository userRepository){
//        return args -> {
//            userRepository.save(newUser("사르"));
//            userRepository.save(newUser("코스"));
//            userRepository.save(newUser("러브"));
//            userRepository.save(newMockUser(2L,"코스"));
//            userRepository.save(newMockUser(3L,"코코"));
//        };
//    }
//}
