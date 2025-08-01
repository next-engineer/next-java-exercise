package org.example.basic.sangyoonlee.unitfourteen.sangyoonannotation;

public class UserInput {

    @AllowedWords({"사과", "바나나", "오렌지"})
    private String fruit;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}