package com.devsuperior.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.dto.CityDTO;
import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.repositories.CityRepository;

@Service
public class CityService {
	
	@Autowired
	private CityRepository repository;
	
	
	public List<CityDTO> findAllCities(){
		List<City> result = repository.findAll(Sort.by("name"));
		return result.stream().map(x -> new CityDTO(x)).toList();
	}
	
	
	public CityDTO newCity(CityDTO dto) {
		City city = new City();
		city.setId(dto.getId());
		city.setName(dto.getName());
		
		city = repository.save(city);
		
		return new CityDTO(city);
	}


}
