/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;
import java.util.Scanner;


/**
 *
 * @author tiago
 */
 
public class GerenciaBanco {

    public static void main(String[] args) {
        
            System.out.println("Digite um nome");
                Scanner nome=new Scanner(System.in);
                    String Nome=nome.nextLine();
            System.out.println("Digite um cpf");
                Scanner cpf=new Scanner(System.in);
                    long CPF=cpf.nextLong();  
            
              int saldo=0;
                for (int i=0;i<1;){
                    System.out.println("Oque deseja fazer?\n1=Verificar Saldo\n2=Fazer deposito\n3=Fazer saque\n4=Verificar dados\n5=Sair");
                Scanner op=new Scanner(System.in);
                    int OP=op.nextInt();
                        if(OP==1){
                            System.out.println("Seu saldo é de R$ "+saldo);
                        }
                        else if(OP==2){System.out.println("Quanto deseja depositar?");
                            Scanner deposito=new Scanner(System.in);
                                int Deposito=deposito.nextInt();
                                if(Deposito>0){
                                   saldo=saldo+Deposito;
                                   System.out.println("Seu saldo atual é de R$ "+saldo);}
                                else{System.out.println("Operação Ilegal");}
                        }
                        else if(OP==3){System.out.println("Quanto deseja Sacar?");
                            Scanner saque=new Scanner(System.in);
                                int Saque=saque.nextInt();                                
                                 if (Saque<=saldo&&Saque>0 ){saldo=saldo-Saque;System.out.println("Saque realizado\nSeu saldo atual é de R$ "+saldo);                                 
                                 }
                                 else if(Saque<0){
                                 System.out.println("Operação Ilegal");
                                 }
                                 else if(Saque==0){
                                 System.out.println("Impossivel Sacar 0");
                                 }
                                 else{                                   
                                   System.out.println("Seu saldo atual é insuficiente");
                                 }
                        }
                        else if(OP==4){
                            System.out.println("Seus dados são:\nNome: "+Nome+"\nCPF: "+CPF+"\nSaldo: "+saldo);
                            }
                        else if(OP==5){
                            System.out.println("Encerrando Operação...");
                            i++;
                        }
                        else{System.out.println("Operação invalida");}
            }
        }        
    }

 
