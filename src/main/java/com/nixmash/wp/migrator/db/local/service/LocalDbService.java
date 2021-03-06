package com.nixmash.wp.migrator.db.local.service;


import com.nixmash.wp.migrator.db.local.dto.LocalUserDTO;
import com.nixmash.wp.migrator.db.local.model.*;
import com.nixmash.wp.migrator.db.wp.model.WpPostCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by daveburke on 1/13/17.
 */
public interface LocalDbService {

    List<LocalPost> getLocalPosts();

    @Transactional(readOnly = true)
    List<LocalPost> getLocalPostsByWpPostId();

    @Transactional
    LocalPost addLocalPost(LocalPost post);

    @Transactional
    void addLocalPosts(List<LocalPost> posts);

    @Transactional
    LocalPost getLocalPostByPostId(Long postId);

    @Transactional
    LocalPost getLocalPostByWpPostId(Long wpPostId);

    @Transactional(readOnly = true)
    Collection<LocalUser> getLocalUsers();

    @Transactional(readOnly = true)
    LocalUser getLocalUserById(Long userId);

    @Transactional
    LocalUser updateLocalUserPassword(LocalUser localUser);

    @Transactional
    LocalUser updateLocalUser(LocalUserDTO localUserDTO);

    @Transactional(readOnly = true)
    List<LocalTag> getLocalTags();

    @Transactional
    LocalTag addLocalTag(LocalTag localTag);

    @Transactional(readOnly = true)
    List<LocalCategory> getLocalCategories();

    @Transactional
    LocalCategory addLocalCategory(LocalCategory localCategory);

    @Transactional
    void addLocalCategories(List<LocalCategory> localCategories);

    Long getLocalPostCategoryId(WpPostCategory wpPostCategory);

    LocalPostCategory addLocalPostCategory(LocalPostCategory localPostCategory);

    void addLocalPostCategories(List<LocalPostCategory> localPostCategories);

    @Transactional(readOnly = true)
    List<LocalPostCategory> getLocalPostCategories();

    @Transactional(readOnly = true)
    List<LocalPostTag> getLocalPostTags();

    @Transactional
    void addLocalPostTags(List<LocalPostTag> localPostTags);
}
