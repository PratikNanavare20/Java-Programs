package ClassFiles;

interface Printable
{
	void square();
}
interface Calculate
{
	void cube();
}

class AreaSquare implements Printable
{
	public void square()
	{
		int no = 10, squ;
		squ = no * no;
		System.out.println("The area of square is :- "+squ);
	}
}
class AreaCube implements Calculate
{
	public void cube()
	{
		int no = 20, cub;
		cub = no * no * no;
		System.out.println("The area of cube is :- "+cub);
	}
}

public class Area {

	public static void main(String[] args) {
		AreaSquare sq = new AreaSquare();
		sq.square();
		
		AreaCube cu = new AreaCube();
		cu.cube();

	}

}
