package com.coderscampus.assignment9.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment9.domain.Recipe;
import com.coderscampus.assignment9.service.RecipeService;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@GetMapping("/all-recipes")
	public List<Recipe> getAllrecipes() throws IOException {
		return recipeService.allRecipes();
	}

	@GetMapping("/gluten-free")
	public List<Recipe> getGlutenFreeFilter() throws IOException {
		return recipeService.glutenFreeFilter();
	}

	@GetMapping("/vegan")
	public List<Recipe> getVeganFilter() throws IOException {
		return recipeService.veganFilter();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> veganAndGlutenFree() throws IOException {
		return recipeService.veganAndGlutenFreeFilter();
	}

	@GetMapping("/vegetarian")
	public List<Recipe> vegetarian() throws IOException {
		return recipeService.vegetarianFilter();
	}

}

/*
 * Notes after code Review Original class name was FileController - Not a good
 * name because the focus isnt about the file, it is about the recipes.
 * Typically whatever is in your parameters (your end points) should hint at
 * what your class name should be, as well as the returned values. 
 * Now, our RecipeController is directly accessing the FileService. The 
 * FileService is the data connector (the connector to our data source) because
 * normally we dont want the Data directly interacting with the Controller.
 * 
 * And in saying that, Notice that within our FileService we have methods 
 * for our recipes. They should be in a RecipeService.
 * 
 * She also mentioned that within each of my methods, i'm reading the same file
 * over and over again. SO if i have a lot of foot traffic, even if the file is 
 * small, it could clog the server. We only need to read the file once.
 * 			
 * So the way we are achieving this is similar to how i was calling the readFile 
 * method, only i'm creating a gerAllRecipes method that will read the file ONCE.
 * Then, we are going to use that method to stream out filter rather than reading 
 * the file for every filter. See note on Try/Catch block added in RecipeService
 * 
 * 
 */
