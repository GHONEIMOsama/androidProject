package com.example.ghoneimandroidproject.ui.main.anime;

import java.util.ArrayList;
import java.util.List;

public class AnimeViewModelGenerator {

    public static List<AnimeViewModel> generateData() {
        List<AnimeViewModel> animeViewModelList = new ArrayList<>();
        animeViewModelList.add(new AnimeViewModel("Attack of Titans", "1998-04-03", "desctiption Attack on Titans", "https://thathashtagshow.com/wp-content/uploads/2020/09/attack-on-titan.jpg", 99.9));
        animeViewModelList.add(new AnimeViewModel("Death Note", "2004-04-03", "desctiption Death Note", "https://cdn.radiofrance.fr/s3/cruiser-production/2019/04/504348d4-e43d-40d3-8c03-772df64b2595/1200x680_death_note.jpg", 80.9));
        animeViewModelList.add(new AnimeViewModel("Black clover", "2014-04-03", "desctiption Black clover", "https://www.blow-ent.com/wp-content/uploads/2020/09/91r1YEvHAkL._RI_.jpg", 95.9));
        animeViewModelList.add(new AnimeViewModel("One punch Man", "2010-04-03", "desctiption One punch man", "https://fr.web.img2.acsta.net/newsv7/20/04/22/10/51/0228077.jpg", 90.9));
        return animeViewModelList;
    }
}
