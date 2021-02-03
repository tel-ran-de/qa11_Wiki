package com.telran.wikipedia.tests;

import org.testng.annotations.Test;

public class ArticleTests extends TestBase{

    @Test
    public void testAddArticleToFavoritesAndRemove() {
        System.out.println("app opened");
        app.article().search();
        app.article().addToFavorites();
        app.article().createReadingList();
        app.article().close();
        app.navigation().favorites();
        app.article().removeFromFavorites();
    }
}
