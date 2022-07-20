package co.grandcircus.HotelSearch;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {

	List<Hotel> findAll();
	List<Hotel> findByCity(String city);

	Optional<Hotel> findByHotelName(String name);
	Optional<Hotel> findByPricePerNight(int pricePerNight);
}
