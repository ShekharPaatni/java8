package archive.array;

/**
 * @author Chandra Shekhar Paatni on 22/6/19
 */class Majority
{
    public static void main(String[] args) {

    }
    //Complete this function, Geeks
    public int majorityWins(int arr[],int n,int x,int y)
    {
        int count_x=0;//counter to count Frequency of x
        int count_y=0;//counter to count Frequency of y
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                ++count_x;
            if (arr[i] == y)
                ++count_y;
        }
         if (count_x > count_y)
            return x;
         else if (count_y > count_x)
            return y;
         else
             return x;
    }
}
