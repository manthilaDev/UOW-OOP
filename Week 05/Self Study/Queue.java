import java.util.ArrayList;

public class Queue<T>
{
    private int mazSize;
    private ArrayList<T> queue = new ArrayList<>();
    
    public Queue(int size)
    {
        this.mazSize=size;
    }

    public void enQueue(T value)
    {
        queue.add(value);
    }

    public T deQueue()
    {
        if(queue.size()>0)
        {
            return queue.remove(0);
        }
        else
        {
            
            return null;
        }
        
    }
    @Override
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        for(T i:queue)
        {
            s.append(i);
        }

        return s.toString();
    }


}