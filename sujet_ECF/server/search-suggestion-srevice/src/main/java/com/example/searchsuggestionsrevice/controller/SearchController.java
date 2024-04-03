package com.example.searchsuggestionsrevice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SearchController {

    @GetMapping(value="/search-suggestion", params = "q")
    public ResponseEntity<?> search(@RequestParam String q) {
    return null;
    }
}
