package ru.nsu.ccfit.databases.g20202.tsarev.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.ccfit.databases.g20202.tsarev.libraryproject.entities.people.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

    Student save(Student student);

    //TODO delete once specifications truly work
    //@Query("select distinct s from Student s join s.lendHistories h join h.book b where b.bookPlaceId in :bookPlaceIds")
    //List<Student> findAllByBookPlace(List<Long> bookPlaceIds);

}
