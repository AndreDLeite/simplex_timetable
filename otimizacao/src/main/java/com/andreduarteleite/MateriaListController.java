package com.andreduarteleite;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope (value = "session")
@Component (value = "materiaList")
@ELBeanName(value = "materiaList")
@Join(path = "/", to = "/materia-list.jsf")
public class MateriaListController {
	@Autowired
	private MateriaRepository materiaRepository;

	private List<Materia> materias;

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		materias = materiaRepository.findAll();
	}

	public List<Materia> getMaterias() {
		return materias;
	}
}
