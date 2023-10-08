package com.yun.template.security.jwt.util;

import com.yun.template.domain.member.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class MemberAuditorAware implements AuditorAware<Long> {

    @Override
    public Optional<Long> getCurrentAuditor() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return Optional.empty();
        }
//        String auth = (String)authentication.getPrincipal();
//        log.info("auth = {}", auth);

        return Optional.of(((LoginInfoDto)authentication.getPrincipal()).getMemberId());
    }
}
