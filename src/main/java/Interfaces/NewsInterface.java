package Interfaces;

import Classes.News;

import java.util.ArrayList;
import java.util.Hashtable;

public interface NewsInterface {
    ArrayList<News> AllNews = new ArrayList<>();
    Hashtable<String, News> NameNews = new Hashtable<>();
    Hashtable<String, News> ContentNews = new Hashtable<>();
    Hashtable<String, News> CategoryNews = new Hashtable<>();
    Hashtable<String, News> DateNews = new Hashtable<>();
}
