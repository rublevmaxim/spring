package ru.alishev.springcourse;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //Чтобы в applicationContext создать bean MusicPlayer1,
    //который создаётся через setter необходимо завести пустой конструктор:
    public MusicPlayer() {}

    //Когда в applicationContext в теле bean пишем property name="music", spring ищет соотвесвующий setter.
    //setMusic ->set отбрасывается; Music преобразуется в music

    public void setMusic(Music music) {
        this.music=music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
