/* 29. Implement a Java program to check a number is a cube or not. */


public class CheckCube {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int cube_root = (int) Math.round(Math.cbrt(n));
		
		if(cube_root * cube_root * cube_root == n)
			System.out.println(n +" is a perfect cube");
		else
			System.out.println(n +" is not a cube number");
	}

}
