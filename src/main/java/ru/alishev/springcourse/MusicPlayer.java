package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

/**
 * @author Neil Alishev
 */

public class MusicPlayer {
    //@Autowired -Рефлексия. Внедрение зависимости в приватное поле
    //@Autowired
    //@Qualifier("classicalMusic")
    //private Music music;

    private Music music1;
    private Music music2;

    //private ClassicalMusic classicalMusic;
    //private RockMusic rockMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


      public MusicPlayer(@Qualifier("classicalMusic") Music music1,@Qualifier("rockMusic") Music music2)
      {
          this.music1 = music1;
          this.music2 = music2;

      }



  //  @Autowired
  //  public MusicPlayer(ClassicalMusic classicalMusic,RockMusic rockMusic)
  //  {
  //      this.classicalMusic = classicalMusic;
  //      this.rockMusic = rockMusic;

   // }
    // IoC
   // @Autowired
   // public MusicPlayer(@Qualifier("classicalMusic") Music music) {
   //     this.music = music;
   // }

    //Чтобы в applicationContext создать bean MusicPlayer1,
    //который создаётся через setter необходимо завести пустой конструктор:
    public MusicPlayer() {}

    //Когда в applicationContext в теле bean пишем property name="music", spring ищет соотвесвующий setter.
    //setMusic ->set отбрасывается; Music преобразуется в music
    //@Autowired
    //public void setMusic(Music music) {
    //    this.music=music;
    //}

    public String playMusic() {
        //System.out.println("Playing: " + music.getSong());
       // System.out.println("Playing: " + classicalMusic.getSong());
       // System.out.println("Playing: " + rockMusic.getSong());
       //return "Playing: "+classicalMusic.getSong();
       return "Playing: " + music1.getSong()+" "+"Playing: " + music2.getSong();

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
