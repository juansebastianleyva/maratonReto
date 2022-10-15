package usa.mintic.retos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.retos.entity.Message;
import usa.mintic.retos.entity.Reservation;
import usa.mintic.retos.repository.crud.ReservationCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationRepository.findAll();
    }
    public Optional<Reservation> getById(int id){
        return reservationRepository.findById(id);
    }
    public Reservation save(Reservation c){
        return reservationRepository.save(c);
    }
    public void delete(Reservation c){
        reservationRepository.delete(c);
    }

}
