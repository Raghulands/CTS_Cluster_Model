import java.util.*;

public class RailwayRoute
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of routes: ");
        int n= scanner.nextInt();
        String[] routeIpt = new String[n];
        System.out.println("Enter routes :");
        for (int i = 0; i < n; i++) {
            routeIpt[i] = scanner.next();
        }
        System.out.print("Enter travel path: ");
        String travelPath = scanner.next();

        Map<String, Integer> Map = new HashMap<>();

        for (String rData : routeIpt) {
            String route = rData.substring(0, 2);   
            int distance = Integer.parseInt(rData.substring(2)); 
            Map.put(route, distance);
        }
        int totalDistance = 0;
        boolean isValidRoute = true;

        for (int i = 0; i < travelPath.length() - 1; i++) {
            String currentRoute =
                    "" + travelPath.charAt(i) + travelPath.charAt(i + 1);

            if (Map.containsKey(currentRoute)) {
                totalDistance += Map.get(currentRoute);
            } else {
                isValidRoute = false;
                break;
            }
        }
        if (isValidRoute) {
            System.out.println("Total distance: " + totalDistance);
        } else {
            System.out.println("Route does not exist");
        }

        scanner.close();
    }
}
