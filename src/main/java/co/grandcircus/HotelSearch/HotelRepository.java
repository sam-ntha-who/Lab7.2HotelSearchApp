package co.grandcircus.HotelSearch;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {

	List<Hotel> findAll();
	List<Hotel> findByCity(String city, Sort sort);

	Optional<Hotel> findByHotelName(String name);
	Optional<Hotel> findByPricePerNight(int pricePerNight);
}
