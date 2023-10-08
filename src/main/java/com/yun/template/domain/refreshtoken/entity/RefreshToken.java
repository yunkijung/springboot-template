package com.yun.template.domain.refreshtoken.entity;

import com.yun.template.domain.common.auditor.AuditorEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="refresh_token")
@NoArgsConstructor
@Setter
@Getter
public class RefreshToken extends AuditorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long memberId;
    private String value;
}
