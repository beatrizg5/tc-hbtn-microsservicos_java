package com.example.SongApi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();


    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        for (Song songToFind : list) {
            if (songToFind.getId().equals(id))
                return songToFind;
        }
        return null;
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        int index;

        if (getSongById(s.getId()) != null) {
            index = list.indexOf(s);

            list.set(index, s);
        }
    }

    public void removeSong(Song s) {
        if (getSongById(s.getId()) != null)
            list.remove(s);
    }
}