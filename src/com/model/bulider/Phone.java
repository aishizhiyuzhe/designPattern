package com.model.bulider;

public class Phone {
    private int size;
    private int internal;
    private String color;
    private String type;

    private Phone(Bulid bulid){
        this.size=bulid.size;
        this.internal=bulid.internal;
        this.color=bulid.color;
        this.type=bulid.type;
    }

    public int getSize() {
        return size;
    }

    public int getInternal() {
        return internal;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public static class Bulid{
        private int size=7;
        private int internal=64;
        private String color="蓝色";
        private String type;
        public Bulid(String type){
            this.type=type;
        }

        public Bulid size(int size){
            this.size=size;
            return this;
        }
        public Bulid internal(int internal){
            this.internal=internal;
            return this;
        }
        public Bulid color(String color){
            this.color=color;
            return this;
        }
        public Phone builder(){
            return new Phone(this);
        }
    }
}
