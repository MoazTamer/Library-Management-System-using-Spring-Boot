package com.moaz.Library.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moaz.Library.untity.BorrowingRecord;

public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
    Optional<BorrowingRecord> findByBookIdAndPatronId(Long bookId, Long patronId);
}
