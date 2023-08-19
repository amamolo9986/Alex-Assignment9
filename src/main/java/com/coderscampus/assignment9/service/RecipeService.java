package com.coderscampus.assignment9.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.coderscampus.assignment9.domain.Recipe;

@Service
public class RecipeService {
	
	@Autowired
	public FileService fileService;
	
	private List<Recipe> recipes = new ArrayList<>();
	
	public List<Recipe> allRecipes(){
		if(CollectionUtils.isEmpty(recipes)) {
			try {
				recipes = fileService.readFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return recipes;
	} //this block ensures that the even if this allRecipes 
	  //method gets called multiple times, we arent re processing
	  //the readFile method as well. It only gets called once.
	
	
	public List<Recipe> glutenFreeFilter() {
		return allRecipes().stream()
						   .filter(r -> r.getGlutenFree())
						   .collect(Collectors.toList());
	}
	
	public List<Recipe> veganFilter() throws IOException{
		return allRecipes().stream()
						   .filter(r -> r.getVegan())
						   .collect(Collectors.toList());
	}
	
	public List<Recipe> veganAndGlutenFreeFilter() throws IOException{
		return allRecipes().stream()
						   .filter(r -> r.getVegan() && r.getGlutenFree())
						   .collect(Collectors.toList()); 
	}
	
	public List<Recipe> vegetarianFilter() throws IOException{
		return allRecipes().stream()
				   		   .filter(r -> r.getVegetarian())
				   		   .collect(Collectors.toList());
	}

}
