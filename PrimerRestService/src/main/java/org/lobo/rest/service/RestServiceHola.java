package org.lobo.rest.service;

import org.lobo.rest.domain.Hola;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hola")
public class RestServiceHola {
	//http://localhost:8080/hola?usuario=Pepe
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Hola diHola(@RequestParam(value="usuario", required=false, defaultValue="Lobo") String usuario){
		Hola hola = new Hola();
		hola.setMensaje(String.format("Hola %s", usuario));
		return hola;
	}
}
