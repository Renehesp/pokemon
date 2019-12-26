package bro.games.pokemon.api;

import bro.games.pokemon.domain.model.PlayerState;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Menu {

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public ModelAndView players() {
        return new ModelAndView("players", "command", new PlayerState());
    }

    @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
    public String load(
            @ModelAttribute("SpringWeb") PlayerState playerState, ModelMap model, HttpServletRequest request) {

        model.addAttribute("name", playerState.getName());
        model.addAttribute("map", playerState.getMap());
        model.addAttribute("money", playerState.getMoney());
        model.addAttribute("pokeball", playerState.getPokeball());
        model.addAttribute("greatball", playerState.getGreatball());
        model.addAttribute("ultraball", playerState.getUltraball());
        model.addAttribute("masterball", playerState.getMasterball());
        model.addAttribute("max_revive", playerState.getMaxRevive());
        model.addAttribute("bicicleta", playerState.getBike());


        List<PlayerState> players = (List<PlayerState>) request.getSession().getAttribute("players");
        if (players == null) {
            players = new ArrayList<PlayerState>();
        }
        players.add(playerState);
        request.getSession().setAttribute("players", players);

        return "exibePlayers";
    }

    @RequestMapping(value = "/listaPlayers", method = RequestMethod.GET)
    public String listarClientes(
            @ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {

        List<PlayerState> clientes = (List<PlayerState>) request.getAttribute("players");

        model.addAttribute("players", clientes);


        return "listaplayers";
    }

}