package com.dreamcode.technicalinterview.controllers;


import com.dreamcode.technicalinterview.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/keywords/{categoryId}")
    @ApiOperation("Get keywords by Category id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Keyword Not Found")
    })
    public ResponseEntity<Category> getKeywordByCategoryId(@ApiParam(value = "The category id", required = true, example = "7") @PathVariable("id") int categoryId) {
        return categoryService.getKeywordsByCategoryId(categoryId)
                .map(keyword -> new ResponseEntity<>(keyword, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    @ApiOperation("Get all categories")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Category>> getAll() {
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);
    }

}
