package org.eclipse.jakarta.hello;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("helloJsfBean")
@RequestScoped
public class HelloJsfBean implements Serializable {
    //@Inject
    //@ManagedProperty("#{helloSpringBean}")
    transient private HelloSpringBean springBean;
    public HelloSpringBean getSpringBean() { return springBean; }
    public void setSpringBean(HelloSpringBean springBean) { this.springBean = springBean; }

    public String getFancyGreeting() {
        return "this one works";
        //return springBean.getFancyGreeting();
    }
}
