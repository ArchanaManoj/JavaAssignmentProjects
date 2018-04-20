package comm.assnmnt.day3;

import java.io.*;

public class FileOps {

	public static long CharCount() {
		BufferedReader br = null;
		long count=0;;
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:\\Personal\\Projects\\testFile.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
            	count = sCurrentLine.chars().filter(ch -> ch == 'a').count();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return count;
	}

	public static void main(String[] args) {

		long charCount = CharCount();
		System.out.println(charCount);
	}

}
