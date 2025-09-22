/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.model;

/**
 *
 * @author Muhammad Romadhoni
 */
public class OnlineMovie extends Film {
    private String platform;

    public OnlineMovie(String id, String judul, String genre, String platform) {
        super(id, judul, genre);
        this.platform = platform;
    }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Online] ID: " + getId() + ", Judul: " + getJudul() +
                ", Genre: " + getGenre() + ", Status: " + getStatus() +
                ", Platform: " + platform);
    }
}

