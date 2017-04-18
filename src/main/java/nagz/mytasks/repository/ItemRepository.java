package nagz.mytasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nagz.mytasks.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
