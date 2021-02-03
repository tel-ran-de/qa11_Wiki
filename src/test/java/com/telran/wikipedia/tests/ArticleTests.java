package com.telran.wikipedia.tests;

import org.testng.annotations.Test;

public class ArticleTests extends TestBase{

    @Test
    public void testAddArticleToFavoritesAndRemove() {
        System.out.println("app opened");
        app.article().search();
    }
}
