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

        //Music music = context.getBean("rockMusic", Music.class);
        //MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        //MusicPlayer musicPlayer=new MusicPlayer(music);
        //musicPlayer.playMusic();

        Computer computer=context.getBean("computer",Computer.class);
        System.out.println(computer);

        context.close();
    }
}
