package day14_arrays;

import day13_arrays.c03_arrayinElemanlariniToplama;
import day13_arrays.c05_ArraydekiEnBuyukSayiyiBulma;
import day13_arrays.C07_tumElemanlariArtir;

import java.util.Arrays;

public class C08_MethodlariKullanma {
    public static void main(String[] args) {
        int[] sayiArray = {2, 2, 7, 4, 2, 4, 5, 7, 3};
        // Bir arrayin bütün elemanlarina 2 ekleyin
        System.out.println(Arrays.toString(sayiArray)); // [2, 2, 7, 4, 2, 4, 5, 7, 3]
        sayiArray = C07_tumElemanlariArtir.tumElemanlariArtir(sayiArray, 2);
        System.out.println(Arrays.toString(sayiArray)); // [4, 4, 9, 6, 4, 6, 7, 9, 5]
        c03_arrayinElemanlariniToplama.elemanlarinToplaminiYazdir(sayiArray); // Array'deki elementlerin toplami : 54
        int enBuyukSayi = c05_ArraydekiEnBuyukSayiyiBulma.enBuyukSayi(sayiArray);
        System.out.println(enBuyukSayi); // System.out.println(Arrays.toString(sayiArray));
        sayiArray = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(sayiArray);
        System.out.println(Arrays.toString(sayiArray)); // [4, 4, 9, 6, 4, 6, 7, 9, 5, 99]
    }
}