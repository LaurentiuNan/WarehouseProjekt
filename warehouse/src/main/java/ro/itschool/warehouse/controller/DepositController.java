package ro.itschool.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ro.itschool.warehouse.entitys.DepositModel;
import ro.itschool.warehouse.service.Depositservice;

import java.util.List;

@Controller
public class DepositController {

    @Autowired
    private Depositservice depositservice;

    @GetMapping("view-deposit")
    public String viewDeposit(Model model) {
        List<DepositModel> depositModelList = depositservice.getDeposits();
        model.addAttribute("deposits", depositModelList);
        return "index";
    }

    @GetMapping("addDeposit")
    public String addDepozitPage(Model model){
        model.addAttribute("deposits", new DepositModel());
        return "addDepozit";
    }

    @PostMapping("add-new-deposit")
    public String addNewDepozit(DepositModel depositModel){
        depositservice.addDeposit(depositModel);
        return  "redirect:/view-deposits";
    }

    @GetMapping("delete-deposit/{id}")
    public String deleteDeposit(@PathVariable("id") int id){
        depositservice.deleteDeposit(id);
        return "redirect:/view-deposits";
    }


    @GetMapping("edit-deposit-page/{id}")
    public String editDepositPage(@PathVariable("id") int id, Model model){
        DepositModel depositModel = depositservice.getDeposits().get(id);
        model.addAttribute("deposit",depositModel);
        return "edit-deposits";
    }

//    @GetMapping("edit-deposit")
//    public String editDeposit(DepositModel depositModel){
//        depositservice.updateDeposit(depositModel);
//        return "redirect:/view-deposits"
//    }

}
