package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @GetMapping("/toplama")
    public String toplama(@RequestParam int sayi1, @RequestParam int sayi2) {
        int sonuc = sayi1 + sayi2;
        return "Toplam Sonucu : " + sonuc;
    }

    @PostMapping("/carpma")
    public String carpma(@RequestBody Sayilar sayilar) {
        int sonuc = sayilar.getSayi1() * sayilar.getSayi2();
        return "Çarpım Sonucu : " + sonuc;
    }
}

class Sayilar {

    private int sayi1;
    private int sayi2;

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }
}
