package com.pbo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudMahasiswaRepository extends JpaRepository<CrudMahasiswa, Long> {
    // Menyediakan method findAll(), save(), findById(), dll secara otomatis
}
