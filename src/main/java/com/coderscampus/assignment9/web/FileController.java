package com.coderscampus.assignment9.web;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment9.domain.Recipe;
import com.coderscampus.assignment9.service.FileService;

@RestController
public class FileController {

	@Autowired
	private FileService fileService;

	@GetMapping("/all-recipes")
	public List<Recipe> allrecipes() throws IOException {
		return fileService.readFile();
	}

	@GetMapping("/gluten-free")
	public List<Recipe> getGlutenFreeFilter() throws IOException {
		return fileService.glutenFreeFilter();
	}

	@GetMapping("/vegan")
	public List<Recipe> getVeganFilter() throws IOException {
		return fileService.veganFilter();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> veganAndGlutenFree() throws IOException {
		return fileService.veganAndGlutenFreeFilter();
	}

	@GetMapping("/vegetarian")
	public List<Recipe> vegetarian() throws IOException {
		return fileService.vegetarianFilter();
	}

}
