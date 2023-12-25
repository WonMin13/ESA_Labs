package org.example.labwork3final.controller.rest_api.json;

import org.example.labwork3final.model.Album;
import org.example.labwork3final.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/json/albums", produces = MediaType.APPLICATION_JSON_VALUE)
public class AlbumJsonRestController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/create")
    public void create(@RequestBody Album album, @RequestAttribute Long editorId) {
        albumService.create(album, editorId);
    }

    @GetMapping
    public List<Album> getAll() {
        return albumService.getAll();
    }

    @GetMapping("/{id}")
    public Album get(@PathVariable Long id) {
        return albumService.get(id);
    }

    @PatchMapping("/{id}/update")
    public void update(@PathVariable("id") Long albumId, @RequestBody Album album, @RequestAttribute Long editorId) {
        albumService.update(albumId, album, editorId);
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id) {
        albumService.delete(id);
    }
}
