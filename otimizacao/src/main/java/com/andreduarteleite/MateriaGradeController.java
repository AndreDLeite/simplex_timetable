package com.andreduarteleite;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import org.gnu.glpk.GLPK;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.ManagedBean;

@ManagedBean(value = "materiaGrade")
@Scope(value = "session")
@Component(value = "materiaGrade")
@ELBeanName(value = "materiaGrade")
@Join(path = "/grade", to = "/grade.jsf")
public class MateriaGradeController {

	private String versionGLPK = GLPK.glp_version();

	@RequestMapping(value = "/grade", method = RequestMethod.GET)
	public String printVersionGLPK() {
		return versionGLPK;
	}

	public void setVer(String versionGLPK) {
		this.versionGLPK = versionGLPK;
	}

	public String getVer() {
		return versionGLPK;
	}
}
