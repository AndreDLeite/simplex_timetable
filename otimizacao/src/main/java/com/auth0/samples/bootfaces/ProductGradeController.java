package com.auth0.samples.bootfaces;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "productGradeController")
@ELBeanName(value = "productGradeController")
@Join(path = "/grade", to = "/grade.jsf")
public class ProductGradeController {

}
