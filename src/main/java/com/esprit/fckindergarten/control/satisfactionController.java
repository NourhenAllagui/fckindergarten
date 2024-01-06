package com.esprit.fckindergarten.control;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.esprit.fckindergarten.entity.Satisfaction;
import com.esprit.fckindergarten.service.SatisfactionServiceImp;

@RestController
@RequestMapping("/satisfaction")
public class satisfactionController {

	@Autowired
	SatisfactionServiceImp satisServImp;
	
	
	
	@PostMapping("/addsatis/{parents_id}")
	@ResponseBody
	public String addSatis(@RequestBody Satisfaction Satis,@PathVariable("parents_id")Long parents_id) throws ParseException {
		List<Satisfaction>s=satisServImp.retrieveAllSatisfactions();
		Date d= new Date();    
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 List<Satisfaction> o=new ArrayList<>();
	    Date p;
	    Date f;
	
		int m=d.getMonth();
		int m1=d.getMonth()+1;
		
		String start= "2021-"+Integer.toString(m)+"-31";
		String end= "2021-"+Integer.toString(m1)+"-31";

		p=sdf.parse(start);
		f=sdf.parse(end);
		
		 o=s.stream().filter(x -> (x.getDate().after(p)) && ( x.getDate().before(f))&& x.getParentSatis().getId()==parents_id) .collect(Collectors.toList());
		 if(o.isEmpty()){
			 satisServImp.addSatisfaction(Satis,parents_id);


	   return "succs";
		 }
		   return "deja ajouter cette mois";

	}
	
	@GetMapping("/ret/{id}")
	@ResponseBody
	public Satisfaction retrieveSatis(@RequestBody @PathVariable("id") Long id) {
		return satisServImp.retrieveSatisfaction(id);
	}
	
	@GetMapping("/allSatis")
	@ResponseBody
	public List<Satisfaction> retrieveAllSatis() {
		return satisServImp.retrieveAllSatisfactions();
		
	}
	
	/*@DeleteMapping("/del/{id}")
	@ResponseBody
	public String deleteSatis(@PathVariable("id") Long id) {
		List<Satisfaction> satisfactios=satisServImp.retrieveAllSatisfactions();
		for(Satisfaction s:satisfactios)
			if(s.getId()==id){
		satisServImp.deleteSatisfaction(id);
		return "Record deleted succesfully";}
		
		return "not existe";
	}*/
	/*@PutMapping("/updateSatis")
	@ResponseBody
	public Satisfaction updateSatis(@RequestBody Satisfaction Satis) {
		satisServImp.updateSatisfaction(Satis);
		return Satis;
	}*/
	
}
