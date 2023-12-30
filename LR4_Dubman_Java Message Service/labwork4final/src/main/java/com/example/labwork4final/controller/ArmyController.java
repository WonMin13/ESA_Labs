package com.example.labwork4final.controller;

import com.example.labwork4final.model.*;
import com.example.labwork4final.service.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/armys")
public class ArmyController {

    @Autowired
    private ArmyService armyService;

    @GetMapping("/create")
    public String getCreatePage(Model model) {
        model.addAttribute(new Army());
        return "create_army";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Army army) {
        armyService.create(army);
        return "redirect:/armys";
    }

    @GetMapping
    public String getAll(Model model) {
        List<Army> armys = armyService.getAll();
        model.addAttribute("armys", armys);
        return "show_armys";
    }

    @GetMapping("/{id}/update")
    public String getUpdatePage(@PathVariable("id") Long armyId, Model model) {
        model.addAttribute("army", armyService.get(armyId));
        return "update_army";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable("id") Long armyId, @ModelAttribute Army army) {
        armyService.update(armyId, army);
        return "redirect:/armys";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        armyService.delete(id);
        return "redirect:/armys";
    }

    @GetMapping("/{id}/albums")
    public String getAlbums(@PathVariable Long id, Model model) {
        List<Album> albums = armyService.getAlbums(id);
        model.addAttribute("albums", albums);
        model.addAttribute("id", id);
        return "show_group_albums";
    }
}
