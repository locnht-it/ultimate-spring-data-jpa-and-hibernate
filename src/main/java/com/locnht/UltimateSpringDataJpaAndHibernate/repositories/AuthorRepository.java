package com.locnht.UltimateSpringDataJpaAndHibernate.repositories;

import com.locnht.UltimateSpringDataJpaAndHibernate.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {

    @Modifying
    @Transactional
    List<Author> findByNamedQuery(@Param("age") int age);

    @Modifying
    @Transactional
    void updateByNamedQuery(@Param("age") int age);

    // UPDATE author a SET a.age = 22 WHERE a.id = 1
    @Modifying
    @Transactional
    @Query("UPDATE Author a SET a.age = :age WHERE a.id = :id")
    int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("UPDATE Author a SET a.age = :age")
    void updateAllAuthorAges(int age);

    //SELECT * FROM author WHERE first_name = 'loc'
    List<Author> findAllByFirstName(String firstName);

    //SELECT * FROM author WHERE first_name = 'Loc'
    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    // SELECT * FROM author WHERE first_name LIKE '%loc%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    // SELECT * FROM author WHERE first_name LIKE 'loc%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    // SELECT * FROM author WHERE first_name LIKE '%loc'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    // SELECT * FROM author WHERE first_name in ('loc', 'ngo', 'tan')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
