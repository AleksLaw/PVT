package Lesson14;


import java.util.ArrayList;
import java.util.List;

public class BarberShop {
    private boolean isOpen;
    private boolean isBusy;
    private List<Integer> cash;
    private List <Parfume> parfumes;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        System.out.println("Barbershop"+(open ? "Open" : "Close"));
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
    public void addMoneyToCash(int integer){
        if (cash==null) cash= new ArrayList<>();
        cash.add(integer);
    }
    public void addParfumes (List <Parfume> parfumeList){
        if (parfumes==null) parfumes= new ArrayList<>();
        parfumes.addAll(parfumes);
    }

    public Parfume takeParfume(){
        return parfumes.remove(0);
    }

    public void newClient(){
       String clientName= Thread.currentThread().getName();
        System.out.println("BarberShop^ New client  " +clientName);
    }
}
