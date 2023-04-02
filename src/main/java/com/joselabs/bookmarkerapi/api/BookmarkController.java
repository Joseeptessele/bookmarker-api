package com.joselabs.bookmarkerapi.api;

import com.joselabs.bookmarkerapi.domain.Bookmark;
import com.joselabs.bookmarkerapi.domain.BookmarkDTO;
import com.joselabs.bookmarkerapi.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService service;

    @GetMapping
    public Page<BookmarkDTO> getBookmarks(@SortDefault(sort = "createdAt",
            direction = Sort.Direction.DESC) Pageable pageable) {
        return service.getBookmarks(pageable);
    }
}
