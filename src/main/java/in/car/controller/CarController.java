package in.car.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.car.entity.carEntity;
import in.car.service.CarServiceImpl;

@RestController
public class CarController {

	@Autowired
	CarServiceImpl carServiceImpl;
	@PostMapping("/save")
	public ResponseEntity<carEntity> saveCar(@RequestBody carEntity cc){
		return new ResponseEntity<carEntity>(carServiceImpl.saveCar(cc), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<carEntity>> getCarById(@PathVariable Integer id){
		return new ResponseEntity<Optional<carEntity>>(carServiceImpl.getCarById(id), HttpStatus.OK);
	}

	
	@GetMapping("/getAll")
	public ResponseEntity<List<carEntity>> getAllCar(){
		return new ResponseEntity<List<carEntity>>(carServiceImpl.getAllCarList(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		return new ResponseEntity<String>(carServiceImpl.deleteCarById(id), HttpStatus.OK);
	}
			
}
