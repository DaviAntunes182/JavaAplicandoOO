package br.com.davi.spotifree;

import br.com.davi.spotifree.models.Band;
import br.com.davi.spotifree.models.Music;
import br.com.davi.spotifree.models.Podcast;
import br.com.davi.spotifree.models.Podcaster;

public class Principal {
    public static void main(String[] args) {
        Band kiss = new Band();
        kiss.setName("Kiss");
        kiss.setCreation(1973);
        kiss.setDescription("Uma banda de rock!");

        Music m1 = new Music();
        m1.setTitle("Forever");
        m1.setYear(1989);
        m1.setDuration(232);
        m1.setAutor(kiss);

        for (int i = 0; i < 300; i++) {
            m1.view();
        }
        for (int i = 0; i < 5; i++) {
            m1.like();
        }

        Podcaster pc1 = new Podcaster();
        pc1.setName("Igor 3K");
        pc1.setChannel("Flowpodcast");
        pc1.setAge(37);
        pc1.setBio("Um carioca que jogava video game e resolveu fazer podcast");

        Podcast p1 = new Podcast();
        p1.setTitle("400 - ACORDAAAAAAAAAAA");
        p1.setYear(2023);
        p1.setDuration(165);
        p1.setAutor(pc1);
        p1.setDuration(240);
        p1.setDescription("Monark surtou no bagulho");

        for (int i = 0; i < 500; i++) {
            p1.view();
        }
        for (int i = 0; i < 50; i++) {
            p1.like();
        }

        System.out.println(m1);
        System.out.println(p1);
    }
}
