package in.car.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.car.entity.carEntity;

@Service
public interface CarService {
	
	
	carEntity saveCar(carEntity cc);
	
	List<carEntity> getAllCarList();
	
	Optional<carEntity> getCarById(Integer id);
	
	String deleteCarById(Integer id);
	
	

	
	
	
}
