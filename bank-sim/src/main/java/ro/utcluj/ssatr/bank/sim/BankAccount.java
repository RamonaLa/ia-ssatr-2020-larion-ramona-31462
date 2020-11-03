/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.bank.sim;

/**
 *
 * @author Ramol
 */
public class BankAccount {
    private String owner;
    private int balance;
    
    public BankAccount(String owner, int balance){
        this.owner=owner;
        this.balance=balance;
    }

    public String getOwner(){
        return owner;
    }
    
    public void setOwner(String owner){
        this.owner=owner;
    }

    public int getBalance(){
        return balance;
    }
    
    public void setBalance(int balance){
        this.balance=balance;
    }

}

