//package com.joselabs.bookmarkerapi;
//
//import com.joselabs.bookmarkerapi.domain.Bookmark;
//import com.joselabs.bookmarkerapi.domain.BookmarkRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.Instant;
//
//@Component
//@RequiredArgsConstructor
//public class DataInitializer implements CommandLineRunner {
//
//    private final BookmarkRepository repository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.save(new Bookmark(null, "joselabs", "https://joselabs.com", Instant.now()));
//        repository.save(new Bookmark(null, "joselabs2", "https://joselabs.com", Instant.now()));
//        repository.save(new Bookmark(null, "joselabs3", "https://joselabs.com", Instant.now()));
//        repository.save(new Bookmark(null, "joselabs4", "https://joselabs.com", Instant.now()));
//        repository.save(new Bookmark(null, "joselabs5", "https://joselabs.com", Instant.now()));
//        repository.save(new Bookmark(null, "joselabs6", "https://joselabs.com", Instant.now()));
//    }
//}
