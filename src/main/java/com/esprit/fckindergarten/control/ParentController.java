package com.esprit.fckindergarten.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.fckindergarten.entity.Parents;
import com.esprit.fckindergarten.service.ParentServiceImp;

@RestController
@RequestMapping("/Parent")
public class ParentController {

	@Autowired
	ParentServiceImp ParServImp;
	
	@PostMapping("/addParent")
	@ResponseBody
	public Parents addParent(@RequestBody Parents PR){
		Parents Par = ParServImp.addParent(PR);
		return Par;
	}
	
	@GetMapping("/allPar")
	@ResponseBody
	public List<Parents> retrieveParent() {
		return ParServImp.retrieveAllParent();
	}

}
