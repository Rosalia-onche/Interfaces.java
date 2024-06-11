public class Computer implements Electronics {
    Ram ram ;
    Processor cpu;
    Storage storage;
    public Computer(Ram ram ,Processor cpu , Storage storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }
    @Override
    public String toString(){
return"Computer{" +
"ram="+ram +
",cpu="+ cpu +
",storage="+ storage +
'}';

}
    
    
    
}
