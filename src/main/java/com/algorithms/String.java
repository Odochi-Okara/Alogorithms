package com.algorithms;

class Strings {
    public static void main(String[] args) {
        String dna ="ATTGC";
        String u = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i)=='T') u +=dna.replace(dna.charAt(i),'X');
            if (dna.charAt(i)=='A') u += dna.replace(dna.charAt(i),'T');
            if (dna.charAt(i)=='T') u += dna.replace(dna.charAt(i),'A');
        }
        System.out.println(u);
    }
}

