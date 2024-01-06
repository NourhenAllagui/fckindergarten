package com.esprit.fckindergarten.control;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.esprit.fckindergarten.entity.Parents;
import com.esprit.fckindergarten.entity.Reclamation;
//import com.esprit.fckindergarten.service.ParentServiceImp;
import com.esprit.fckindergarten.service.ReclamationServiceImp;

@RestController
@RequestMapping("/reclamation")
public class ReclamationController {

	@Autowired
	private ReclamationServiceImp reclamationServiceImp;
	//@Autowired
	//private ParentServiceImp parentserviceimp;
	

	@PostMapping("/addrec/{parents_id}/{kindergarten_id}")
	@ResponseBody
	public String addRec(@RequestBody Reclamation Rec,@PathVariable("parents_id")Long parents_id,@PathVariable("kindergarten_id")Long kindergarten_id) {
		Rec.setAnswer(null);
		List<Reclamation>re=reclamationServiceImp.retrieveAllReclamation();
		/*
		List<Reclamation>r=new ArrayList<>();
	
		for (Reclamation reclamation : re) {
		  
			if((reclamation.getAnswer()==null)&&(reclamation.getParents().getId()==id))
				r.add(reclamation);
		}
		*/
	List<Reclamation>r=re.stream().filter(x->x.getAnswer()==null&&x.getParents().getId()==parents_id).collect(Collectors.toList());

		
				if(r.isEmpty())
				{
						reclamationServiceImp.addReclamation(Rec,parents_id,kindergarten_id);	
						return "succs";
				}
				//return "Looool";
		
		return "non";
	}

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteRec(@PathVariable("id") Long id) {
		List<Reclamation>reclamations=reclamationServiceImp.retrieveAllReclamation();
		for(Reclamation r:reclamations)
			if(r.getId()==id){
		reclamationServiceImp.deleteReclamation(id);
		return "Record deleted succesfully";}
		
		return "not existe";
	}



	@GetMapping("/{id}")
	@ResponseBody
	public Optional<Reclamation> retrieveRec(@PathVariable Long id) {
		return reclamationServiceImp.retrieveReclamation(id);
	}

	@GetMapping("/all")
	@ResponseBody
	public List<Reclamation> retrieveRec() {
		return reclamationServiceImp.retrieveAllReclamation();
	}

	
}