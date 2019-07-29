import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String[] name = {"Art", "Dan", "Jen","Riya","Sakshi","Ayush"};
		Arrays.parallelSort(name);
		for(int i=0; i< name.length; i++){
			   System.out.print(name[i] +", ");
			}
	}

}
