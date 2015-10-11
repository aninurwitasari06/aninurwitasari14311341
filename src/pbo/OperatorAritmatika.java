/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author my acer
 */
public class OperatorAritmatika {
    public int nilaiHasil;
    
    int penjumlahan(int a, int b){
        nilaiHasil= a + b;
        return nilaiHasil;
    }
    int pengurangan(int a, int b){
        nilaiHasil= a - b;
        return nilaiHasil;
    }
    double pembagian(double A, double B){
        nilaiHasil= (int) (A / B);
        return nilaiHasil;
    }
    int perkalian(int A, int B){
        nilaiHasil= A * B;
        return nilaiHasil;
    }
}
