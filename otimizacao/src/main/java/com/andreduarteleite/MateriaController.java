package com.andreduarteleite;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "materiaController")
@ELBeanName(value = "materiaController")
@Join(path = "/materias", to = "/materia-form.jsf")
public class MateriaController {
	@Autowired
	private MateriaRepository materiaRepository;

	private Materia materia = new Materia();

	public String save() {
		materiaRepository.save(materia);
		materia = new Materia();
		return "/materia-list.xhtml?faces-redirect=true";
	}

	public Materia getMateria() {
		return materia;
	}
}
