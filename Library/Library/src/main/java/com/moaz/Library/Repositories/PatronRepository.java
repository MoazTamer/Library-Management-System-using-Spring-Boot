package com.moaz.Library.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moaz.Library.untity.Patron;

public interface PatronRepository extends JpaRepository<Patron, Long> {
}
