package com.esprit.fckindergarten.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.fckindergarten.entity.Kindergarten;
import com.esprit.fckindergarten.service.KindergartenServiceImp;

@RestController
@RequestMapping("/Kindergarten")
public class kindergartenController {

	@Autowired
	KindergartenServiceImp KgServImp;
	
	@PostMapping("/addKg")
	@ResponseBody
	public Kindergarten AddKg(@RequestBody Kindergarten Kg){
		Kindergarten Kgn = KgServImp.AddKg(Kg);
		return Kgn;
	}
	@GetMapping("/allKg")
	@ResponseBody
	public List<Kindergarten> retrieveAllKg(){
		return KgServImp.RetrieveAllKg();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Kindergarten retrieveKgByid(Long id){
		return KgServImp.RetrieveKgById(id);


	}
}
