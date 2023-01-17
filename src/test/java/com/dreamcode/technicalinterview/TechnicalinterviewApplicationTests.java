package com.dreamcode.technicalinterview;

import com.dreamcode.technicalinterview.model.Category;
import com.dreamcode.technicalinterview.model.KeywordCategory;
import com.dreamcode.technicalinterview.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class TechnicalinterviewApplicationTests {
	@InjectMocks
	private CategoryService categoryService;
	@Test
	void getCategoryKeyword_thenReturnOK() {
		KeywordCategory sampleKeywordCategory = new KeywordCategory();
		Category sampleCategory = new Category();
		sampleCategory.setName("Appliances");
		sampleCustomer.setLevel(LevelConstants.CATEGORY_LEVEL);

		Mockito
				.when(restTemplate.getForEntity(
						"http://localhost:8080/categories/keywords/1L", Category.class))
          .thenReturn(new ResponseEntity(key, HttpStatus.OK));

		KeywordCategory keywordCategory = categoryService.getKeywordsByCategoryId(1L);
		Assertions.assertEquals(key, keywordCategory);
	}

	@Test
	void getCategoryKeyword_thenReturnBadRequest(){
		KeywordCategory sampleKeywordCategory = new KeywordCategory();
		Category sampleCategory = new Category();
		Mockito
				.when(restTemplate.getForEntity(
						"http://localhost:8080/categories/keywords/1L", Category.class))
				.thenReturn(new ResponseEntity(key, HttpStatus.BAD_REQUEST));

		KeywordCategory keywordCategory = categoryService.getKeywordsByCategoryId(1L);
		Assertions.assertEquals(key, keywordCategory);
	}

	@Test
	void getAllCategories_thenReturnOK() {
		Category sampleCategory = new Category();
		sampleCategory.setName("Appliances");
		sampleCustomer.setLevel(LevelConstants.CATEGORY_LEVEL);
		Category sampleCategory2 = new Category();
		sampleCategory.setName("Garden");
		sampleCustomer.setLevel(LevelConstants.CATEGORY_LEVEL);
		Mockito
				.when(restTemplate.getForEntity(
						"http://localhost:8080/categories/all", Category.class))
				.thenReturn(new ResponseEntity(key, HttpStatus.OK));

		Collection<Category> category = categoryService.getByCategoryId();
		Assertions.assertEquals(key, keywordCategory);
	}

}
