package org.example.labwork3final.controller;

import org.example.labwork3final.model.*;
import org.example.labwork3final.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @Autowired
    private ArmyService armyService;

    @GetMapping("/create")
    public String getCreatePage(Model model) {
        model.addAttribute("album", new Album());
        List<Long> armyIds = armyService.getAll().stream().map(Army::getId).collect(Collectors.toList());
        model.addAttribute("armyIds", armyIds);
        return "create_album";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Album album, @RequestParam Long armyId) {
        albumService.create(album, armyId);
        return "redirect:/albums";
    }

    @GetMapping
    public String getAll(Model model) {
        List<Album> albums = albumService.getAll();
        model.addAttribute("albums", albums);
        return "show_albums";
    }

    @GetMapping("/{id}/update")
    public String getUpdatePage(@PathVariable("id") Long albumId, Model model) {
        Album album = albumService.get(albumId);
        model.addAttribute("album", album);
        List<Long> armyIds = armyService.getAll().stream().map(Army::getId).collect(Collectors.toList());
        model.addAttribute("armyIds", armyIds);
        return "update_album";
    }

    @PatchMapping("/{id}/update")
    public String update(@PathVariable("id") Long albumId, @ModelAttribute Album album, @RequestParam Long armyId) {
        albumService.update(albumId, album, armyId);
        return "redirect:/albums";
    }

    @DeleteMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        albumService.delete(id);
        return "redirect:/albums";
    }
}
