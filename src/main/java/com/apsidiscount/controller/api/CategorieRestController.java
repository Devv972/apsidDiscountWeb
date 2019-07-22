package com.apsidiscount.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.apsidiscount.entity.Article;
import com.apsidiscount.entity.Categorie;
import com.apsidiscount.service.CategorieService;

@RestController
public class CategorieRestController {
	
	@Autowired
	private CategorieService categorieService;
	
	@GetMapping(produces = "application/json", path="/api/categorie")
	public List<Categorie> getAllCategorie()  {
		return categorieService.getAllCategorie();
	}
	

}
