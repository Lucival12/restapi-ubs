package com.desafio.apirest.repository;

import com.desafio.apirest.models.Unidade;
import java.awt.print.Pageable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UnidadeRepository extends JpaRepository<Unidade, Long>{
    
  @Query(value= "select * from unidade u where haversine(:latitude, :longitude, u.vlr_latitude, u.vlr_longitude ) < 5", nativeQuery = true)
  List<Unidade> findByPosi(@Param("latitude") double latitude,
                           @Param("longitude") double longitude);
}


