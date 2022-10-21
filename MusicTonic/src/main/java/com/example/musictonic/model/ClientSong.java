package com.example.musictonic.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "client_song")
public class ClientSong implements Serializable {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "songId")
    private Song song;

    protected ClientSong() {
    }

    public ClientSong(Long id, Client client, Song song) {
        this.id = id;
        this.client = client;
        this.song = song;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "ClientSong{" +
                "id=" + id +
                ", client=" + client +
                ", song=" + song +
                '}';
    }
}