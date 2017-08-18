/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mits.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author mila
 */
@XmlRootElement(name = "option")
@XmlType(propOrder = {"command", "order", "callback", "display"})
public class MenuOption {

    private String command;
    private String order;
    private String callback;
    private String display;
    private String menuLabel;

    @XmlAttribute
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @XmlAttribute
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @XmlAttribute
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    @XmlAttribute
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @XmlValue
    public String getMenuLabel() {
        return menuLabel;
    }

    public void setMenuLabel(String menuLabel) {
        this.menuLabel = menuLabel;
    }

    @Override
    public String toString() {
        return callback + " " + menuLabel + " " + display + " " + command + " " + order;
    }
}
