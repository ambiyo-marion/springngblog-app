package com.ambiyo.springbootreddit.exceptions;

import com.ambiyo.springbootreddit.model.Subreddit;

public class SubredditNotFoundException extends RuntimeException {
    public SubredditNotFoundException(String message){
    super(message);
  }
}
