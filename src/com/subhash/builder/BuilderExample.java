package com.subhash.builder;

public class BuilderExample {

    public static void main(String[] args) {

        BuilderExample.BuilderEx builder = new BuilderExample.BuilderEx(new BunEx(), new PattyEx());
       builder.makeBurger();


    }
    private static BunEx bun;
    private static PattyEx patty;
    public BuilderExample(BuilderEx builderEx){
        this.bun = builderEx.bun;
        this.patty = builderEx.patty;
    }

    static class BuilderEx{
        private static BunEx bun;
        private static PattyEx patty;

        public BuilderEx (BunEx bun, PattyEx patty){
                    this.bun = bun;
                    this.patty = patty;
            }

        public void makeBurger(){
            System.out.println("Burger Made");

        }

        public BuilderExample builder(){
            return new BuilderExample(this);
        }
    }
}

class BunEx{

}
class PattyEx{

}
