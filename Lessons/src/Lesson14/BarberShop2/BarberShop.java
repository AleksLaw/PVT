package Lesson14.BarberShop2;


import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BarberShop {

    private boolean isOpen;
    private Boolean isBusy;

    private List<Integer> cash;
    private List<Parfume> parfumes;

    private String clientName;

    public synchronized boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        System.out.println("BarberShop2: " + (open ? "Open" : "Closed"));
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void addMoneyToCash(Integer integer) {
        if (cash == null) cash = new ArrayList<>();
        cash.add(integer);
    }

    public void addParfumes(List<Parfume> parfumeList) {
        if (parfumes == null) parfumes = new ArrayList<>();
        parfumes.addAll(parfumeList);
    }

    public Parfume takeParfume() {
        return parfumes.remove(0);
    }

    public boolean isParfumeEmpty() {
        return parfumes.isEmpty();
    }

    public void newClient() {
        try {
            String clientName = Thread.currentThread().getName();
            System.out.println("BarberShop2: new client: " + clientName);
            while (list.size() != 0&& list.equals(this.clientName)) {
                list.add(clientName);
                Thread.sleep(1000);
                System.out.println("BarberShop2: client " + clientName + " is waiting");
            }
            this.clientName = clientName;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    List list = new ArrayList();


    public void makeHairDress() {
        try {
            String barberName = Thread.currentThread().getName();



                Parfume parfume = takeParfume();

                //setBusy(true);
               // System.out.println("BarberShop2: " + barberName + " takes " + parfume);


                if (list.size() != 0) {

//                    System.out.println("BarberShop2: " + barberName + " is serving " + list.get(0));
//                    Thread.sleep(2000);
getClient(barberName);
                    //   setBusy(false);
//                    System.out.println("BarberShop2: " + barberName + " finished " + clientName);
//                    list.remove(0);
                }
                //this.clientName = null;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void   getClient(String barber) throws InterruptedException {
        String barberName = Thread.currentThread().getName();

        System.out.println("BarberShop2: " + barberName + " is serving " + list.get(0));
        Thread.sleep(2000);
        System.out.println("BarberShop2: " + barberName + " finished " + list.get(0));
        list.remove(0);

    }



}