package com.vendorMachine.domain.Users.Machine;

import java.util.List;

/**
 * Created by omkulk on 7/26/2017.
 */
public abstract class Machine {

    private String id;
    private List<Integer> acceptableCurrency;
    private List<?> availableItems;

    public boolean isEmpty() {
        return false;
    }
    public abstract void details();

    public void printName(){
        System.out.println(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getAcceptableCurrency() {
        return acceptableCurrency;
    }

    public void setAcceptableCurrency(List<Integer> acceptableCurrency) {
        this.acceptableCurrency = acceptableCurrency;
    }

    public List<?> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(List<?> availableItems) {
        this.availableItems = availableItems;
    }

}
