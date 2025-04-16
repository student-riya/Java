import java.io.*;

public class FileStatistics {
    public static void main(String[] args) {
        BufferedReader reader = null;
        
        try {
            // Taking file input from user
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file path: ");
            String filePath = inputReader.readLine();
            inputReader.close();
            
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }
            
            reader = new BufferedReader(new FileReader(file));
            int lineCount = 0, wordCount = 0, charCount = 0;
            String line;
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }
            
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
