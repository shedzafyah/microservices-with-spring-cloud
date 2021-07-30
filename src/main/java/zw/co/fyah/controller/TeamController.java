package zw.co.fyah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zw.co.fyah.domain.Team;
import zw.co.fyah.repository.TeamRepository;

import java.util.List;

//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public List<Team> getTeam(){
        return teamRepository.findAll();
    }

    @GetMapping("/teams/{id}")
    public Team find(@PathVariable Long id){
        return teamRepository.findById(id).get();
    }
}
