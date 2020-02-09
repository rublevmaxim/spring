package ru.alishev.springcourse;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
    //Делаем приватный конструктор,чтобы ограничить создание ClassicalMusic
    //с помощью оператора new
    private ClassicalMusic(){}

    //Создаём фабричный метод. Он должен быть статическим,
    //т.е. вызываться на классе, а не наобъекте
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }


    public int cnt;

    @PostConstruct
    public void doMyInit(){
        setCnt(getCnt()+1);
        System.out.println("Doing my initialization"+getCnt());
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
