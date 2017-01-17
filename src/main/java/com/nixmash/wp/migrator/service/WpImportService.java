package com.nixmash.wp.migrator.service;

import org.kamranzafar.spring.wpapi.Category;
import org.kamranzafar.spring.wpapi.Post;
import org.kamranzafar.spring.wpapi.Tag;

/**
 * Created by daveburke on 1/13/17.
 */
public interface WpImportService {
    Post[] getPosts(int count);

    Tag[] getTags(int count);

    Category[] getCategories(int count);
}
