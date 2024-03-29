package cohorte16.homeservice.repositories;

import cohorte16.homeservice.enums.Orderstatus;
import cohorte16.homeservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

   // @Query("select o from Order o where o.ESTADO =  ': Status' ")

    @Query("select u from Order u where u.orderstatus = :Status ")
    List<Order> findByOrderstatus( @Param("Status") Orderstatus orderStatus);
}
