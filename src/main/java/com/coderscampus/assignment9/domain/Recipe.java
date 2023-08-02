package com.coderscampus.assignment9.domain;

public class Recipe {
	private Integer cookingMinutes;
	private Boolean dairyFree;
	private Boolean glutenFree;
	private String instructions;
	private Double preparationMinutes;
	private Double pricePerServing;
	private Integer readyInMunutes;
	private Integer servings;
	private Double spoonacularScore;
	private String title;
	private Boolean vegan;
	private Boolean Vegetarian;


	public Recipe(Integer cookingMinutes, Boolean dairyFree, Boolean glutenFree, String instructions,
			Double preparationMinutes, Double pricePerServing, Integer readyInMunutes, Integer servings,
			Double spoonacularScore, String title, Boolean vegan, Boolean vegetarian) {
		super();
		this.cookingMinutes = cookingMinutes;
		this.dairyFree = dairyFree;
		this.glutenFree = glutenFree;
		this.instructions = instructions;
		this.preparationMinutes = preparationMinutes;
		this.pricePerServing = pricePerServing;
		this.readyInMunutes = readyInMunutes;
		this.servings = servings;
		this.spoonacularScore = spoonacularScore;
		this.title = title;
		this.vegan = vegan;
		Vegetarian = vegetarian;
	}

	public Integer getCookingMinutes() {
		return cookingMinutes;
	}

	public void setCookingMinutes(Integer cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}

	public Boolean getDairyFree() {
		return dairyFree;
	}

	public void setDairyFree(Boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	public Boolean getGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(Boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Double getPreparationMinutes() {
		return preparationMinutes;
	}

	public void setPreparationMinutes(Double preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}

	public Double getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(Double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public Integer getReadyInMunutes() {
		return readyInMunutes;
	}

	public void setReadyInMunutes(Integer readyInMunutes) {
		this.readyInMunutes = readyInMunutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Double getspoonacularScore() {
		return spoonacularScore;
	}

	public void setspoonacularScore(Double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVegan() {
		return vegan;
	}

	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}

	public Boolean getVegetarian() {
		return Vegetarian;
	}

	public void setVegetarian(Boolean vegetarian) {
		Vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "Recipe [cookingMinutes=" + cookingMinutes + ", dairyFree=" + dairyFree + ", glutenFree=" + glutenFree
				+ ", instructions=" + instructions + ", preparationMinutes=" + preparationMinutes + ", pricePerServing="
				+ pricePerServing + ", readyInMunutes=" + readyInMunutes + ", servings=" + servings
				+ ", spoonacularScore=" + spoonacularScore + ", title=" + title + ", vegan=" + vegan + ", Vegetarian="
				+ Vegetarian + "]";
	}

}
