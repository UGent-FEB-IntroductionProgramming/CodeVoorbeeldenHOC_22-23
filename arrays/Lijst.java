/**
 *
 * @author fgailly
 */
public class Lijst {

    public static int DEFAULT_SIZE = 50; // 50 plaatsen voorzien op de lijst
    private int aantalElementen;
    private String[] elementen;


    /**
     * Creates an empty list with a given capacity.
     */

    public Lijst(int max) // hier gebruik je de default size niet.
    {
        elementen = new String[max];
        aantalElementen = 0;
    }

    /**
     * Creates an empty list with a capacity of DEFAULT_SIZE.
     */
    public Lijst() // deze constructor gebruikt wel de default size.
    //no need for parameters, because it's default
    {
        elementen = new String[DEFAULT_SIZE];
        aantalElementen = 0;
    }

    public boolean isFull()
    {
        return aantalElementen == elementen.length;

    }

    public boolean isEmpty()
    {
        return aantalElementen == 0;
    }


    public void addItem(String item)
    {
        elementen[aantalElementen] = item;
        aantalElementen++;
    }



    public String getItemAt(int position) // We halen van ons lijst een bepaald element op.
    {
        return elementen[position];
    }


    public boolean isOnLijst(String item)
    {
        for(int i = 0; i < aantalElementen; i++){
            if(elementen[i].equals(item))
                return true;
        }
        return false;
    }

    public int getMaximumNumberOfEntries()
    {
        return elementen.length;
    }

    public int getNumberOfEntries()
    {
        return aantalElementen;
    }

    public void eraseList() // Deze methode maakt de lijst leeg.
    {
        aantalElementen = 0;
    }
}
