package protalento.class2.generics;

import protalento.basics.heritance.example1.Animal;

public class GenericExample <T, M> {
    private final T genericAttribute;
    private final M anotherGenericAttribute;

    public GenericExample(T genericAttribute, M anotherGenericAttribute) {
        this.genericAttribute = genericAttribute;
        this.anotherGenericAttribute = anotherGenericAttribute;
    }

    public T getGenericAttribute() {
        return this.genericAttribute;
    }

    public M getAnotherGenericAttribute() {
        return this.anotherGenericAttribute;
    }

}
