package usa.mintic.retos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Category;
import usa.mintic.retos.entity.Reservation;
import usa.mintic.retos.entity.dto.StatusAccount;
import usa.mintic.retos.entity.dto.TopClients;
import usa.mintic.retos.services.ResevationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Reservation")
public class ReservationController {

    @Autowired
    private ResevationService resevationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return resevationService.getAll();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation c){
        return resevationService.save(c);
    }

    @GetMapping("/report-dates/{dateA}/{dateB}")
    public List<Reservation> getByDates(@PathVariable("dateA")String da,@PathVariable("dateB")String db ){
        return resevationService.getReservationsByPeriod(da,db);
    }
    @GetMapping("/report-status")
    public StatusAccount getByStatus(){
        return resevationService.getReportByStatus();
    }
    @GetMapping("/report-clients")
    public List<TopClients> getTopClients(){
        return resevationService.getTopclients();
    }





}
