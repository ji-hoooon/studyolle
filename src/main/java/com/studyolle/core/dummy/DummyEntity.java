//package com.studyolle.core.dummy;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import shop.mtcoding.restend.model.user.User;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//public class DummyEntity {
//    public User newUser(String username){
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String email="";
//        if(username.equals("사르")){
//            email="ssar";
//        }else if(username.equals("러브")){
//            email="love";
//        }else if(username.equals("코스"))
//            email="cos";
//        return User.builder()
//                .username(username)
//                .password(passwordEncoder.encode("1234"))
//                .email(email+"@nate.com")
//                .role("USER")
//                .status(false)
//                .build();
//    }
//
//    public User newMockUser(Long id, String username){
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String email="";
//        if(username.equals("사르")){
//            email="ssar";
//        }else if(username.equals("러브")){
//            email="love";
//        }else if(username.equals("코스")) {
//            email = "cos";
//        }else if(username.equals("코코")){
//            email ="coco";
//        }
//        return User.builder()
//                .id(id)
//                .username(username)
//                .password(passwordEncoder.encode("1234"))
//                .email(email+"@nate.com")
//                .role("ADMIN")
//                .status(true)
//                .createdAt(LocalDateTime.now())
//                .build();
//    }
//}
