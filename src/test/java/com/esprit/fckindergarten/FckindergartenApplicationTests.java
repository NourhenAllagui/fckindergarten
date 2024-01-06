package com.esprit.fckindergarten;


//import java.text.SimpleDateFormat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.fckindergarten.entity.Admin;
import com.esprit.fckindergarten.entity.Kindergarten;
import com.esprit.fckindergarten.entity.Parents;
import com.esprit.fckindergarten.entity.Reclamation;
import com.esprit.fckindergarten.entity.Satisfaction;
import com.esprit.fckindergarten.service.AdminServiceImp;
import com.esprit.fckindergarten.service.KindergartenServiceImp;
import com.esprit.fckindergarten.service.ParentServiceImp;
import com.esprit.fckindergarten.service.ReclamationServiceImp;
import com.esprit.fckindergarten.service.SatisfactionServiceImp;



@RunWith(SpringRunner.class)
@SpringBootTest
public class FckindergartenApplicationTests {

	@Autowired
	AdminServiceImp AdServ;
	@Autowired
	ParentServiceImp ParSerImp;
	@Autowired
	ReclamationServiceImp reclamserv;
	@Autowired
	SatisfactionServiceImp satisServImp;
	@Autowired
	KindergartenServiceImp KgServImp;
	//test reclamation 
	@Test
	public void testretRieveAllReclamation() {
		reclamserv.retrieveAllReclamation();
	}
	@Test
	public void testAddReclamation(Reclamation Rec,Long kindergarten_id,Long parents_id){
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		reclamserv.addReclamation(Rec, kindergarten_id,parents_id);
	}
	@Test
	public void testDeleteReclamation(Long id){
		reclamserv.deleteReclamation(id);
	}
	@Test
	public void testUpdateReclamation(Reclamation Rec,Long id,Long admin_id){
		reclamserv.updateReclamation(Rec, id,admin_id);
	}
	@Test
	public void testRetrieveReclamation(Long id) {
		reclamserv.retrieveReclamation(id);
	}

	//test satisfaction
	@Test
	public void testretRieveAllSatisfaction() {
		satisServImp.retrieveAllSatisfactions();
	}
	@Test
	public void testAddSatisfaction(Satisfaction Satis,Long parents_id){
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		satisServImp.addSatisfaction(Satis,parents_id);
	}
	//@Test
	//public void testDeleteSatisfaction(Long id){
		//satisServImp.deleteSatisfaction(id);;
	//}
	/*@Test
	public void testUpdateSAtisfaction(Satisfaction Satis){
		satisServImp.updateSatisfaction(Satis);
	}*/
	@Test
	public void testRetrieveSatisfaction(Long id) {
		satisServImp.retrieveSatisfaction(id);
	}
	//test Admin
	@Test
	public void testAddAdmin(Admin Ad){
		AdServ.addAdmin(Ad);
	}
	@Test
	public void testretRieveAllAdmin(){
		AdServ.retrieveAllAdmin();
	}
	@Test
	public void testretrieveAdminById(Long id){
		AdServ.retrieveAdminById(id);
	}
	//test Parents
	@Test
	public void testAddParent(Parents PR){
		ParSerImp.addParent(PR);
	}
	@Test
	public void testretRieveAllParents(){
		ParSerImp.retrieveAllParent();
	}
	@Test
	public void testretriveParentById(Long id){
		ParSerImp.retrieveParent(id);
	}
	//test Kindergarten
	@Test
	public void testAddKg(Kindergarten Kg){
		KgServImp.AddKg(Kg);
	}
	@Test
	public void testretrieveAllKg(){
		KgServImp.RetrieveAllKg();
	}
	@Test
	public void testretrieveKgById(Long id){
		KgServImp.RetrieveKgById(id);
	}
}
