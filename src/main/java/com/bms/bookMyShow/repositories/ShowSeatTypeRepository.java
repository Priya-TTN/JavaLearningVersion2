package com.bms.bookMyShow.repositories;

import com.bms.bookMyShow.models.Show;
import com.bms.bookMyShow.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
 List<ShowSeatType> findAllByShow(Show show);
}
