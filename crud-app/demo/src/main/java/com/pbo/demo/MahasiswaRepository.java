
package com.pbo.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
    // Spring Data JPA sudah menyediakan method findAll(), save(), findById(), delete() secara bawaan.
}