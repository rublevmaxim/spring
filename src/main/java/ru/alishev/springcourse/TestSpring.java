package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("ClassicalMusic", Music.class);
       // Music music1 = context.getBean("FolkMusic", Music.class);


        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        //scope singletone
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer1", MusicPlayer.class);//Внедрение через setter
        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());

        MusicPlayer secondMusicPlayer1= context.getBean("musicPlayer1", MusicPlayer.class);//Внедрение через setter
        secondMusicPlayer1.setName("Valenki");
        secondMusicPlayer1.setVolume(-50);
        secondMusicPlayer1.playMusic();
        System.out.println(secondMusicPlayer1.getName());
        System.out.println(secondMusicPlayer1.getVolume());

        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());

        boolean comparison = musicPlayer1 == secondMusicPlayer1;
        System.out.println(comparison);
        System.out.println(musicPlayer1);
        System.out.println(secondMusicPlayer1);

        //end scope singletone

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);//Внедрение через constructor
        musicPlayer2.playMusic();


        context.close();
    }
}
