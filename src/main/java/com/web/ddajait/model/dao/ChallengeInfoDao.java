package com.web.ddajait.model.dao;

import java.util.List;
import java.util.Optional;

import com.web.ddajait.model.entity.ChallengeInfoEntity;

public interface ChallengeInfoDao {

    public List<ChallengeInfoEntity> getAllChallengeInfo();

    public Optional<ChallengeInfoEntity> findById(Long id);
}
