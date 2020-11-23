import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        try
//        {
//            File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\khalil.txt");
//            Scanner scanner = new Scanner(file);
//        //            FileWriter fileWriter = new FileWriter("C:\\Users\\KURAPIKA.dll\\Desktop\\khalil.txt");
////            fileWriter.write("khalil el maghraoui");
////            fileWriter.close();
//        while (scanner.hasNextLine()) {
//            String data = scanner.nextLine();
//            System.out.println(data);
//
//
//        }
//            scanner.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//
//        }


        File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\khalil.txt");
            if(file.exists()){
                System.out.println("File Name " + file.getName());
                System.out.println("File absolute path " + file.getAbsolutePath());
                System.out.println("File canonical path " + file.getCanonicalPath());
                System.out.println("File  path " + file.getPath());
                System.out.println("File  pathffff " + file.getAbsoluteFile());
                System.out.println("File Writeable " + file.canWrite());
                System.out.println("File readable " + file.canRead());
                System.out.println("File size in bytes  " + file.length());
                
            }
            else {
                System.out.println("the file doesn't exist");
            }




    }
}

