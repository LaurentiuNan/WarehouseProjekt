package ro.itschool.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.itschool.warehouse.entitys.DepositModel;
import ro.itschool.warehouse.repository.DepositRepository;

import java.util.List;
import java.util.Map;

@Component
public class Depositservice {

    @Autowired
    private DepositRepository depositRepository;

    public List<DepositModel> getDeposits() {

        List<DepositModel> depositModels = depositRepository.findAll();
        return depositModels;
    }


    public void addDeposit(DepositModel depositModel) {
        depositRepository.save(depositModel);
    }

    public void deleteDeposit(int id) {depositRepository.deleteById(id);
    }


    }

