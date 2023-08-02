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
	public List<Recipe> glutenFree() throws IOException {
		List<Recipe> glutenFreeFilter = fileService.readFile()
												   .stream()
												   .filter(r -> r.getGlutenFree())
												   .collect(Collectors.toList());
		return glutenFreeFilter;
	}

	@GetMapping("/vegan")
	public List<Recipe> vegan() throws IOException {
		List<Recipe> veganFilter = fileService.readFile()
											   .stream()
											   .filter(r -> r.getVegan())
											   .collect(Collectors.toList());
		return veganFilter;
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> veganAndGlutenFree() throws IOException {
		List<Recipe> veganAndGlutenFreeFilter = fileService.readFile()
														   .stream()
														   .filter(r -> r.getVegan() && r.getGlutenFree())
														   .collect(Collectors.toList());
		return veganAndGlutenFreeFilter;
	}

	@GetMapping("/vegetarian")
	public List<Recipe> vegetarian() throws IOException {
		List<Recipe> vegetarianFilter = fileService.readFile()
												   .stream()
												   .filter(r -> r.getVegetarian())
												   .collect(Collectors.toList());
		return vegetarianFilter;
	}

}
