package com.algorithms;

public class Correction {
    public static void main(String[] args) {
        String dna ="ATTGGC";
        String J = dna.replace('T', 'X').replace('A', 'T').replace('X','A').replace('C','X').replace('G', 'C').replace('X', 'G');

    }

}
