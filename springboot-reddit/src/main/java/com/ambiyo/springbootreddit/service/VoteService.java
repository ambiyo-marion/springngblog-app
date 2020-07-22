package com.ambiyo.springbootreddit.service;

import com.ambiyo.springbootreddit.dto.VoteDto;
import com.ambiyo.springbootreddit.exceptions.PostNotFoundException;
import com.ambiyo.springbootreddit.exceptions.SpringRedditException;
import com.ambiyo.springbootreddit.model.Post;
import com.ambiyo.springbootreddit.model.Vote;
import com.ambiyo.springbootreddit.repository.PostRepository;
import com.ambiyo.springbootreddit.repository.VoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VoteService {

   private final VoteRepository voteRepository;
   private final PostRepository postRepository;
   private final AuthService authService;

   @Transactional
   public void vote(VoteDto voteDto) {
       Post post = postRepository.findById(voteDto.getPostId())
               .orElseThrow(() -> new PostNotFoundException("Post Not Found with ID - " + voteDto.getPostId()));
       Optional<Vote> voteByPostAndUser = voteRepository.findTopByPostAndUserOrderByVoteIdDesc(post, authService.getCurrentUser());
       if (voteByPostAndUser.isPresent() &&
               voteByPostAndUser.get().getVoteType()
                       .equals(voteDto.getVoteType())) {
           throw new SpringRedditException("You have already "
                   + voteDto.getVoteType() + "'d for this post");
       }
       if (UPVOTE.equals(voteDto.getVoteType())) {
           post.setVoteCount(post.getVoteCount() + 1);
       } else {
           post.setVoteCount(post.getVoteCount() - 1);
       }
       voteRepository.save(mapToVote(voteDto, post));
       postRepository.save(post);
   }

    private Vote mapToVote(VoteDto voteDto, Post post) {
        return Vote.builder()
                .voteType(voteDto.getVoteType())
                .post(post)
                .user(authService.getCurrentUser())
                .build();
    }
}
