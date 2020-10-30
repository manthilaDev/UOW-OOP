public class Test 
{
    public static <T> void main(String[] args) {
        Queue<String> newQueue = new Queue<>(5);
        newQueue.enQueue("a");
        newQueue.enQueue("b");
        newQueue.enQueue("c");
        newQueue.enQueue("e");
        newQueue.enQueue("f");
       
        System.out.println(newQueue.toString());
        System.out.println(newQueue.deQueue().toString());
        System.out.println(newQueue.deQueue().toString());
        System.out.println(newQueue.toString());
        }
    
}
