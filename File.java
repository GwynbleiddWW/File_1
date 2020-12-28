package Files1;

import java.io.*;

class FileHome {

    public static void main(String[] args) throws IOException {

        File src = new File("C:/Games/src");
        src.mkdir();
        File main = new File("C:/Games/src/main");
        main.mkdir();
        File test = new File("C:/Games/src/test");
        test.mkdir();
        File res = new File("C:/Games/res");
        res.mkdir();
        File drawables = new File("C:/Games/res/drawables");
        drawables.mkdir();
        File vectors = new File("C:/Games/res/vectors");
        vectors.mkdir();
        File icons = new File("C:/Games/res/icons");
        icons.mkdir();
        File savegames = new File("C:/Games/savegames");
        savegames.mkdir();
        File temp = new File("C:/Games/temp");
        temp.mkdir();

        File mainJava = new File("C:/Games/src/main/Main.java");
        try {
            mainJava.createNewFile();
        } catch (IOException m) {
            System.out.println(m.getMessage());
        }
        File utilsJava = new File("C:/Games/src/main/Utils.java");
        try {
            utilsJava.createNewFile();
        } catch (IOException u) {
            System.out.println(u.getMessage());
        }
        File tempTxt = new File("C:/Games/temp/temp.txt");
        try {
            tempTxt.createNewFile();
        } catch (IOException t) {
            System.out.println(t.getMessage());
        }

        StringBuilder tB = new StringBuilder();
        tB.append("Созданы следующие каталоги и файлы: \n");
        tB.append(src + "\n" + main + "\n" + mainJava + "\n" + utilsJava + "\n" +
                test + "\n\n" + res + "\n" + drawables + "\n" + vectors + "\n" +
                icons + "\n\n" + savegames + "\n\n" + temp + "\n" + tempTxt);

        try (BufferedWriter txt = new BufferedWriter(new FileWriter(tempTxt))) {
            txt.write(String.valueOf(tB));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Все файлы и папки созданы и записаны в temp.txt
        try (FileReader reader = new FileReader(tempTxt)) {
            int a;
            while ((a = reader.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


