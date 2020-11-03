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
public class AccountsManager {
    BankAccount[] list = new BankAccount[10];
    
    void addBankAccount(BankAccount a){
        for(int i=0; i<list.length;i++){
            if(list[i]==null){
                list[i]=a;
                System.out.println("New bank account added.");
                return;
            }
        }
        System.out.println("No empty position found.");
    }
    
    int getTotalBalance(){
        int b=0;
        for(BankAccount a: list){
            if(a!=null)
                b+=a.getBalance();
        }
        return b;
    }
    
    String getDetailsOfAccounts(){
        String details ="";
        for(BankAccount a:list){
            if(a!=null){
                String line="Account owner: " + a.getOwner()+ "\n Balance: "+a.getBalance()+"\n\n";
                details=details+line;
            }
        }
        return details;
    }
    
    int getBalanceByOwner( String accountOwner){
        for(BankAccount a:list){
            if(a!=null && a.getOwner().equals(accountOwner))
                return a.getBalance();
        }
        return -1;
    }
    
    boolean transfer(String fromOwnerName, String toOwnerName, int amount){
        int x=getBalanceByOwner(fromOwnerName);
        int y=getBalanceByOwner(toOwnerName);
        if(getBalanceByOwner(fromOwnerName)<amount)
        {
            return false;
        }
        else{
            x=x-amount;
            y=y+amount;
            return true;
        }
        
    }
}
