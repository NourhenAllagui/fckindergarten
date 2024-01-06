package com.esprit.fckindergarten.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.fckindergarten.entity.Admin;
import com.esprit.fckindergarten.entity.Reclamation;
import com.esprit.fckindergarten.service.AdminServiceImp;
import com.esprit.fckindergarten.service.ReclamationServiceImp;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	private ReclamationServiceImp reclamationServiceImp;
	@Autowired
	private AdminServiceImp AdServImp;
	
	@PostMapping("/addAdmin")
	@ResponseBody
	public Admin addAdmin(@RequestBody Admin Ad) {
		Admin AD = AdServImp.addAdmin(Ad);
		return AD;
	}
	@GetMapping("/all")
	@ResponseBody
	public List<Admin> retrieveAdmin() {
		return AdServImp.retrieveAllAdmin();
	}
	@PutMapping("/updateRec/{id}/{admin_id}")
	@ResponseBody
	public Reclamation updateRec(@RequestBody Reclamation Rec ,@PathVariable("id")Long id,@PathVariable("admin_id")Long admin_id) {
		List<Reclamation> reclamation =reclamationServiceImp.retrieveAllReclamation();
		String answer=Rec.getAnswer();
		for(Reclamation rc:reclamation)
			if(rc.getId()== id && rc.getAnswer()==null ){
				rc.setAnswer(answer);
		reclamationServiceImp.updateReclamation(rc,id,admin_id);
		return rc;}
		
		return null;
		
	}

}
