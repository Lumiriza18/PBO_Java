
package com.pbo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @GetMapping("/mahasiswa")
    public String tampilkanDataMahasiswa(Model model) {
        model.addAttribute("listMahasiswa", mahasiswaRepository.findAll());
        return "mahasiswa";
    }
}
