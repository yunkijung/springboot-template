package com.yun.template.domain.house.repository;

import com.yun.template.domain.house.entity.House;
import com.yun.template.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
