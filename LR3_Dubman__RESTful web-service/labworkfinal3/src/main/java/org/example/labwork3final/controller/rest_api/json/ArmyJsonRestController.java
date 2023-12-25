package org.example.labwork3final.controller.rest_api.json;

import org.example.labwork3final.model.*;
import org.example.labwork3final.service.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/json/armys", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArmyJsonRestController {
    @Autowired
    private ArmyService armyService;

    @PostMapping("/create")
    public void create(@RequestBody Army army) {
        armyService.create(army);
    }

    @GetMapping
    public List<Army> getAll() {
        return armyService.getAll();
    }

    @GetMapping("/{id}")
    public Army get(@PathVariable Long id) {
        return armyService.get(id);
    }

    @PatchMapping("/{id}/update")
    public void update(@PathVariable("id") Long armyId, @RequestBody Army army) {
        armyService.update(armyId, army);
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id) {
        armyService.delete(id);
    }

    @GetMapping("/{id}/albums")
    public ResponseEntity<List<Album>> getAlbums(@PathVariable Long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("armyId", String.valueOf(id));
        return new ResponseEntity<>(armyService.getAlbums(id), httpHeaders, HttpStatus.OK);
    }
}
