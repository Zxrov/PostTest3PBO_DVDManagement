/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.model;

/**
 *
 * @author Muhammad Romadhoni
 */
public class DVD extends Film {
    private String format;

    public DVD(String id, String judul, String genre, String format) {
        super(id, judul, genre);
        this.format = format;
    }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    @Override
    public void tampilkanInfo() {
        System.out.println("[DVD] ID: " + getId() + ", Judul: " + getJudul() +
                ", Genre: " + getGenre() + ", Status: " + getStatus() +
                ", Format: " + format);
    }
}