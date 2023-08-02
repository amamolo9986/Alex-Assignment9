package com.coderscampus.assignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment9.domain.Recipe;

@Service
public class FileService {
	public List<Recipe> readFile() throws IOException {
		List<Recipe> recipes = new ArrayList<>();

		Reader in = new FileReader("recipes.txt");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withDelimiter(',')
													   .withEscape('\\')
													   .withFirstRecordAsHeader()
													   .withIgnoreSurroundingSpaces()
													   .parse(in);
		
		for (CSVRecord record : records) {
			Integer cookingMinutes = Integer.parseInt(record.get("Cooking Minutes"));
			Boolean dairyFree = Boolean.parseBoolean(record.get("Dairy Free"));
			Boolean glutenFree = Boolean.parseBoolean(record.get("Gluten Free"));
			String instructions = record.get("Instructions");
			Double preparationMinutes = Double.parseDouble(record.get("Preparation Minutes"));
			Double pricePerServing = Double.parseDouble(record.get("Price Per Serving"));
			Integer readyInMinutes = Integer.parseInt(record.get("Ready In Minutes"));
			Integer servings = Integer.parseInt(record.get("Servings"));
			Double spoonacularScore = Double.parseDouble(record.get("Spoonacular Score"));
			String title = record.get("Title");
			Boolean vegan = Boolean.parseBoolean(record.get("Vegan"));
			Boolean vegetarian = Boolean.parseBoolean(record.get("Vegetarian"));

			Recipe recipe = new Recipe(cookingMinutes, dairyFree, glutenFree, instructions, preparationMinutes,
					pricePerServing, readyInMinutes, servings, spoonacularScore, title, vegan, vegetarian);

			recipes.add(recipe);

		}
		
		return recipes;
	}
	
}
