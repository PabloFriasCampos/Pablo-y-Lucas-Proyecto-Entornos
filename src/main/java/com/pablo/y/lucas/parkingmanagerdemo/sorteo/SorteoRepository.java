package com.pablo.y.lucas.parkingmanagerdemo.sorteo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorteoRepository extends CrudRepository<Sorteo,Long>{



}