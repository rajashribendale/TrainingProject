package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.District;
import com.example.demo.model.city;
import com.example.demo.model.state;
import com.example.demo.model.villege;

@RestController
public class weatherProducer {

	@GetMapping(value = "/temp/{districtNew}/{cityNew}/{villegeNew}")
	public ResponseEntity<Integer> getTemp(@PathVariable String districtNew,@PathVariable String cityNew,
			@PathVariable String villegeNew) {
		int temp =  0;
		
		Map<String, state>map=new HashMap<String, state>();
		
		List<villege>vlist=new ArrayList<villege>();
		villege villege=new villege();
		villege.setTemp(24); villege.setVname("wagholi");
		
		villege villege2=new villege();
		villege2.setTemp(23); villege2.setVname("khed");
		
		vlist.add(villege); vlist.add(villege2);
		
		city city=new city();
		city.setCname("haveli");
		city.setVilleges(vlist);
		
		List<city>clist=new ArrayList<city>();
		clist.add(city);
		
		List<District>d1=new ArrayList<District>();
		District district=new District();
		district.setDname("pune"); district.setCities(clist);
		
		d1.add(district);
		
		state state=new state();
		state.setSname("MH");
		state.setDistricts(d1);
		
		map.put("MH", state);
		
		state newstate=map.get("MH");
		
		for(District d : state.getDistricts()) {
			
			if(districtNew.equals(d.getDname())) {
				
				for(city c : d.getCities()) {
					
					if(cityNew.equals(c.getCname())) {
						
						for(villege v : c.getVilleges()) {
							
							if(villegeNew.equals(v.getVname())) {
								
								temp= v.getTemp();
							}
						}
					}
				}
			}
		}
		
		return ResponseEntity.ok(temp);
	}
		
				
		
		
		
		
}

