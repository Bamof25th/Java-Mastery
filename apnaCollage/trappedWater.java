package apnaCollage;

public class trappedWater {
    public static int tarappedWater(int[] height) {
        int l = height.length;
        // Claculate left max boundary
        int leftMax[] = new int[l];
        leftMax[0] = height[0];
        for (int i = 1; i < l; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Claculate right max boundary
        int rightMax[] = new int[l];
        rightMax[l - 1] = height[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int tw = 0;
        // loop
        for (int i = 0; i < l; i++) {
            // ..waterLEvel = min(lexftmax , rightmax)
            int wl = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i]

            tw += wl - height[i];
        }
        return tw;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped Water in the Collage is : " + tarappedWater(arr));
    }
}
