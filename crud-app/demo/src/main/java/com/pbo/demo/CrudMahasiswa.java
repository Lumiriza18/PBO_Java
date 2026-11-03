package com.pbo.demo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mahasiswa")
public class CrudMahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nim;
    
    @Column(name = "nama_lengkap")
    private String namaLengkap;
    
    private String email;
    
    @Column(name = "tanggal_lahir")
    private LocalDate tanggalLahir;
    
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    
    private String jurusan;
    private Integer semester;
    private Double ipk;
    private String hobi;
    
    @Column(name = "status_aktif")
    private Boolean statusAktif;

    // --- Getter dan Setter ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(LocalDate tanggalLahir) { this.tanggalLahir = tanggalLahir; }

    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }

    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    public Integer getSemester() { return semester; }
    public void setSemester(Integer semester) { this.semester = semester; }

    public Double getIpk() { return ipk; }
    public void setIpk(Double ipk) { this.ipk = ipk; }

    public String getHobi() { return hobi; }
    public void setHobi(String hobi) { this.hobi = hobi; }

    public Boolean getStatusAktif() { return statusAktif; }
    public void setStatusAktif(Boolean statusAktif) { this.statusAktif = statusAktif; }
}