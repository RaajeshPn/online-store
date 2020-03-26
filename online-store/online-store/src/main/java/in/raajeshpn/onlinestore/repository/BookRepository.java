package in.raajeshpn.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raajeshpn.onlinestore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	

}
