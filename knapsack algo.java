public class Knapsack_Problem01 {
    double m=100; //Maximum backpack capacity
    int n=5;  //Number of items
    int[] w = {10,20,30,40,50}; //The weight of the ith item
    int[] v = {20,30,65,40,60};  //The value of the i-th item
    
    int[] a = new  int[n]; //The movement path recorded in the tree. When it is 1, it means to select this group of data, and when it is 0, it means not to select this group of data.
    int maxvalue = 0;   //Maximum weight of the backpack
    public static void main(String[] args)
    {
        Knapsack_Problem01 p = new Knapsack_Problem01();
        p.Search(0);
    }
    public void Search(int i)   //i represents the recursion depth
    {
        if(i>=n)
        {
            CheckMax();
        }
        else {
            a[i] = 0;
            Search(i+1);
            a[i] = 1;
            Search(i+1);
        }
    }
    public void CheckMax()
    {
        int weight = 0;
        int value = 0;
        for(int i=0;i<n;i++)  //Determine whether the upper limit is reached
        {
            if(a[i] == 1)
            {
                weight = weight + w[i];
                value = value + v[i];
            }
        }
        if(weight <= m)
        {
            if(value >= maxvalue)
            {
                maxvalue = value;
                System.out.print("The maximum value is:" + maxvalue +" ");
                System.out.print("The selected item is (1 means selected, 0 means unselected): ");
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[j]);
                    System.out.print(' ');
                }
                System.out.print('\n');
            }

        }
    }
}
