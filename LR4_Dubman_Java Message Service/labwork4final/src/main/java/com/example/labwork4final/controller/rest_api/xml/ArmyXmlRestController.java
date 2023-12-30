package com.example.labwork4final.controller.rest_api.xml;

import com.example.labwork4final.model.Army;
import com.example.labwork4final.model.Album;
import com.example.labwork4final.service.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/xml/armys", produces = MediaType.APPLICATION_XML_VALUE)
public class ArmyXmlRestController {
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

    @PatchMapping("/{armyId}/update")
    public void update(@PathVariable Long armyId, @RequestBody Army army) {
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
