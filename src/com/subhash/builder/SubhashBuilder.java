package com.subhash.builder;

import java.util.HashSet;
import java.util.Set;

public class SubhashBuilder {

    private Bun1 bun;
    private Patty1 patty;

    private SubhashBuilder (Builder1 builder1){
        this.bun = builder1.bun;
        this.patty = builder1.patty;
    }

    static class Builder1{

        private final Bun1 bun;
        private final Patty1 patty;

        public Builder1(Bun1 bun, Patty1 patty){
            this.bun =bun;
            this.patty = patty;
        }

        public SubhashBuilder build(){
            return new SubhashBuilder(this);
        }

    }

}

class Bun1{

}
class Patty1{

}


class Demo{

    public static void main(String[] args) {

        SubhashBuilder.Builder1 subhashBuilder = new SubhashBuilder.Builder1(new Bun1(), new Patty1());
        SubhashBuilder build = subhashBuilder.build();
        Set<?> set = new HashSet<>();

    }
}