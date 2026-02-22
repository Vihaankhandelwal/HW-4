import java.util.Arrays;

public class Assignment3TrappedRainwater {

    static int trapRainwater(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else water += (leftMax - height[left]);
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else water += (rightMax - height[right]);
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] elevationMap = {1, 2, 1, 4, 1, 2, 1, 5, 0, 0, 2, 1, 5};
        System.out.println("Elevation map: " + Arrays.toString(elevationMap));
        System.out.println("Trapped water: " + trapRainwater(elevationMap) + " units");
    }
}
