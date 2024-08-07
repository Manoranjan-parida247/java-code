


//Given a route containing four direction(E, W, N, S) find the shortest path to reach destination
//input string
public class Q2 {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        
        System.out.println(shortestPath(str));

    }
    public static float shortestPath(String path)
    {
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++)
        {
            char dir = path.charAt(i);
            if(dir == 'E')
            {
                x++;
            }else if(dir == 'W')
            {
                x--;
            }else if(dir == 'N')
            {
                y++;
            }else{
                y--;
            }
        }
        return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
