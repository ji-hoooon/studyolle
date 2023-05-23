package com.studyolle.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@Entity
@Getter
//@Setter
@EqualsAndHashCode(of="id") //순환참조 방지
//@Builder
//@AllArgsConstructor
@NoArgsConstructor
public class Account{
    @Id
    @GeneratedValue
    private Long id;

    //이메일 혹은 닉네임 로그인 허용
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    //이메일 인증을 수행하기 위한 필드
    private boolean emailVerified;

    private String emailCheckToken;

    private LocalDateTime joinedAt;

    private String bio;

    private String url;

    private String occupation;

    private String location;

    //텍스트 타입 매핑을 위함 -> 기본이 LAZY이고, 명시적으로 줘야한다.
    //함께 가져오기 위해서
    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    private boolean studyCreatedByEmail;
    private boolean studyCreatedByWeb;
    private boolean studyEnrollmentResultByEmail;
    private boolean studyEnrollmentResultByWeb;
    private boolean studyUpdatedByEmail;
    private boolean studyUpdatedByWeb;


    @Builder
    public Account(Long id, String email, String nickname, String password, boolean emailVerified, String emailCheckToken, LocalDateTime joinedAt, String bio, String url, String occupation, String location, String profileImage, boolean studyCreatedByEmail, boolean studyCreatedByWeb, boolean studyEnrollmentResultByEmail, boolean studyEnrollmentResultByWeb, boolean studyUpdatedByEmail, boolean studyUpdatedByWeb) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.emailVerified = emailVerified;
        this.emailCheckToken = emailCheckToken;
        this.joinedAt = joinedAt;
        this.bio = bio;
        this.url = url;
        this.occupation = occupation;
        this.location = location;
        this.profileImage = profileImage;
        this.studyCreatedByEmail = studyCreatedByEmail;
        this.studyCreatedByWeb = studyCreatedByWeb;
        this.studyEnrollmentResultByEmail = studyEnrollmentResultByEmail;
        this.studyEnrollmentResultByWeb = studyEnrollmentResultByWeb;
        this.studyUpdatedByEmail = studyUpdatedByEmail;
        this.studyUpdatedByWeb = studyUpdatedByWeb;
    }
}
