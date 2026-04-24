package com.example.l4_20213686.controller;

import com.example.l4_20213686.entity.Api;
import com.example.l4_20213686.entity.Endpoint;
import com.example.l4_20213686.repository.ApiRepository;
import com.example.l4_20213686.repository.EndpointRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/endpoints")
public class EndpointController {
    final EndpointRepository endpointRepository;
    public EndpointController(EndpointRepository endpointRepository){
        this.endpointRepository = endpointRepository;
    }

    @GetMapping("/")
    public String lista(Model model) {

        List<Endpoint> lista = endpointRepository.findAll();
        model.addAttribute("endpointList", lista);
        return "Api/details";
    }

}