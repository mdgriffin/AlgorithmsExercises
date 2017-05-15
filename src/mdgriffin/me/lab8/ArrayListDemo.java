package mdgriffin.me.lab8;

/**

 This program demonstrates the array list implementation.
 */
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> staff = new ArrayList();
        staff.addLast("Tom");
        staff.addLast("Jerry");

        staff.remove(1);
        for (int i = 0; i < staff.size(); i++)
        {
            System.out.println(staff.get(i));
        }
    }
}
