package app;

import app.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public String writeFile(String text, String fileName) {

        try (FileOutputStream fout =
                     new FileOutputStream(Constants.BASE_PATH_IN +
                fileName + ".txt")) {
            byte[] byteArr = text.getBytes();
            fout.write(byteArr, 0, byteArr.length);

        } catch (IOException ex){
        return ex.getMessage();
        }
        return "OK";
    }
}
