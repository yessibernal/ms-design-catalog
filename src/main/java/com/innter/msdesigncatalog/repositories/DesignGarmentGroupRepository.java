package com.innter.msdesigncatalog.repositories;

import com.innter.msdesigncatalog.entities.DesignGarmentGroupEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignGarmentGroupRepository extends JpaRepository<DesignGarmentGroupEntity, Long> {

    @Query("SELECT g FROM DesignGarmentGroupEntity g WHERE g.status = 1")
    List<DesignGarmentGroupEntity> findDesignGarmentGroup (Pageable pageable);

    @Query("SELECT g FROM DesignGarmentGroupEntity g WHERE g.id = :id AND g.status = 1")
    DesignGarmentGroupEntity findDesignGarmentGroupStatusById (Long id);
}
