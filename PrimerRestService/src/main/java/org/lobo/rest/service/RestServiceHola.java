package org.lobo.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.lobo.rest.domain.Hola;
import org.lobo.rest.domain.Persona;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController("/hola")
public class RestServiceHola {
	//http://localhost:8080/hola?usuario=Pepe
	@RequestMapping(value="/diHola", method=RequestMethod.GET)
	public @ResponseBody Hola diHola(@RequestParam(value="usuario", required=false, defaultValue="Lobo") String usuario){
		Hola hola = new Hola();
		hola.setMensaje(String.format("Hola %s", usuario));
		return hola;
	}
	
	@RequestMapping(value="/getPersonas",method=RequestMethod.GET)
	public @ResponseBody List<Persona> getPersonas(@RequestParam(value="usuario", required=false) String usuario){
		List<Persona> personas = new ArrayList<>();
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		persona1.setNombre("lobo");
		persona1.setApellido1("comete");
		persona1.setApellido2("un bollo");
		persona2.setNombre("lili");
		persona2.setApellido1("gato");
		persona2.setApellido2("miau");
		
		personas.add(persona1);
		personas.add(persona2);
		return personas;
	}

}
