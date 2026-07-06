//You should be able to add new features without changing existing code.

interface Adaptable{
    void adapt();
}

class IndianAdapter implements Adaptable{
    public void adapt(){
        System.out.println("Indian Adapter having 3 holes");
    }
}

class USAdapter implements Adaptable{
    public void adapt(){
        System.out.println("US Adapter having 2 holes");
    }
}

public class OCP {
    public static void main(String[] args) {
        IndianAdapter indianAdapter=new IndianAdapter();
        USAdapter usAdapter=new USAdapter();
        indianAdapter.adapt();
        usAdapter.adapt();
    }
}
