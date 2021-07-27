package com.company.Day1;

class Game {
    private String title;
    private char rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public void printInfo() {
        System.out.println("Game: " + title + ", Rating: " + rating + ", Price: $" + price);
    }
}

public class Example15 {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.setTitle("Guilty Gear Strive");
        game1.setRating('T');
        game1.setPrice(60);

        Game game2 = new Game();
        game2.setTitle("Death's Door");
        game2.setRating('E');
        game2.setPrice(20);

        game1.printInfo();
        game2.printInfo();
    }
}
