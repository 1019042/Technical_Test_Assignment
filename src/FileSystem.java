import java.io.File;


public class FileSystem {

	static long x=173498249218L;
	public static void main(String[] args) {
		File file=new File("C:");
		long totalSpace = file.getTotalSpace();
		System.out.println("Total space on " + file + " = " + totalSpace + " bytes");

		// Check the free space in C:
		long freeSpace = file.getFreeSpace();
		System.out.println("Free space on " + file + " = " + freeSpace + " bytes");
			
		//check if we can write x bytes on file system
			
		if(x<=freeSpace){
			System.out.println("You have enough space to write " + x + " bytes on file system.");
		}
		else{
			System.out.println("There's no space to write "+ x +" bytes on file system.");
		} 

	}

}
