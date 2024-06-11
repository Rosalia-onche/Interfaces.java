public interface Electronics {

    public boolean on(){
        return true;
    }
    boolean onOrOff = false;
    boolean on();
    boolean off();
    default void Electronics(){
        if (onOrOff){
            System.out.println("Default");
        }
    }
}