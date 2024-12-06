package in.car.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.car.entity.carEntity;
import in.car.repo.CarRepo;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	CarRepo carRepo;
	
	@Override
	public carEntity saveCar(carEntity cc) {
		return carRepo.save(cc);
	}

	@Override
	public List<carEntity> getAllCarList() {
		return carRepo.findAll();
	}

	@Override
	public Optional<carEntity> getCarById(Integer id) {
		Optional<carEntity> byId = carRepo.findById(id);
		if(byId.isPresent()) {
			return byId;
		}
		else {
			return null;
		}
		
	}

	@Override
	public String deleteCarById(Integer id) {
		if(carRepo.existsById(id)) {
			carRepo.deleteById(id);
			return "Car deleted";
		}
			return "Not found ";
	}
	
}
