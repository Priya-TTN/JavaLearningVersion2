package com.bms.bookMyShow.repositories;
import com.bms.bookMyShow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
//    @Override
//    List<ShowSeat> findAllById(Iterable<Long> longs);
}