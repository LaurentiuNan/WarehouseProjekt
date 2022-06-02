package ro.itschool.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.warehouse.entitys.DepositModel;

@Repository
public interface DepositRepository extends JpaRepository<DepositModel,Integer> {

}
