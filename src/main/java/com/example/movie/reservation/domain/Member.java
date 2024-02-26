package com.example.movie.reservation.domain;

import com.example.movie.util.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @OneToMany(mappedBy = "member")
    private List<Reservation> reservations;

    private String email;
    private String password;
    private String name;
    private String phoneNum;

    @Enumerated(EnumType.STRING)
    private Role role;

}
