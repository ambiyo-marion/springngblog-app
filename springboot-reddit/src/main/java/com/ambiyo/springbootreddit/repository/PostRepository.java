package com.ambiyo.springbootreddit.repository;

import com.ambiyo.springbootreddit.model.Post;
import com.ambiyo.springbootreddit.model.Subreddit;
import com.ambiyo.springbootreddit.model.User;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);

}
