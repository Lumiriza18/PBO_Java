
package com.pbo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CrudMahasiswaController {

    @Autowired
    private CrudMahasiswaRepository crudMahasiswaRepository;

    // Menampilkan form dan tabel mahasiswa
    @GetMapping("/crud-mahasiswa")
    public String tampilkanHalamanCrud(Model model) {
        model.addAttribute("listMahasiswa",
                crudMahasiswaRepository.findAll());

        model.addAttribute("CrudMahasiswa", new CrudMahasiswa());

        return "crudMahasiswa";
    }

    // Menyimpan data mahasiswa
    @PostMapping("/crud-mahasiswa/simpan")
    public String simpanData(
            @ModelAttribute("CrudMahasiswa") CrudMahasiswa mahasiswa) {

        crudMahasiswaRepository.save(mahasiswa);

        return "redirect:/crud-mahasiswa";
    }
}
