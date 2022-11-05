package pl.primary.numbers.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.primary.numbers.demo.data.Rectangle;

@Repository
public interface RectangleRepo  extends CrudRepository<Rectangle, Long> {

}
