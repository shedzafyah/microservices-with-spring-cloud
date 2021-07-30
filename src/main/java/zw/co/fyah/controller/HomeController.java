package zw.co.fyah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import zw.co.fyah.domain.Player;
import zw.co.fyah.domain.Team;
import zw.co.fyah.repository.PlayerRepository;
import zw.co.fyah.repository.TeamRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private PlayerRepository playerRepository;

    @PostConstruct
    public void init(){
       List<Player>players = new ArrayList<>();
        Team team = new Team("Mashwede","HIT");
        players.add(new Player("shedza",team));
        players.add(new Player("dadza",team));
        players.add(new Player("odza",team));
        playerRepository.saveAll(players);

    }

    @GetMapping("/")
    public String home(){
        return "hello";
    }
}
