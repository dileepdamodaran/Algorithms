package java8;

/**
 * Default method in the interface
 */
public interface Interface {

    default boolean defaultInit() {
        System.out.println("default init");
        return false;
    }

}
