package com.example.l4_20213686.controller;

import com.example.l4_20213686.entity.Api;
import com.example.l4_20213686.entity.Endpoint;
import com.example.l4_20213686.repository.ApiRepository;
import com.example.l4_20213686.repository.EndpointRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class ApiController {
    final ApiRepository apiRepository;
    final EndpointRepository endpointRepository;
    public ApiController(ApiRepository apiRepository, EndpointRepository endpointRepository){
        this.apiRepository =apiRepository;
        this.endpointRepository = endpointRepository;
    }

    @GetMapping("")
    public String lista(Model model) {

        List<Api> lista = apiRepository.findAll();
        model.addAttribute("apiList", lista);
        return "Api/list";
    }

}
