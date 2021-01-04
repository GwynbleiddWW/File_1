package Files1;

import java.io.*;

class FileHome {

    public static void main(String[] args) throws IOException {

        StringBuilder tB = new StringBuilder();

        tB.append("Созданы папки:\n");

        File src = new File("C:/Games/src");
        src.mkdir();
        tB.append(src.getName() + "\n");

        File main = new File("C:/Games/src/main");
        main.mkdir();
        tB.append(main.getName() + "\n");

        File test = new File("C:/Games/src/test");
        test.mkdir();
        tB.append(test.getName() + "\n");

        File res = new File("C:/Games/res");
        res.mkdir();
        tB.append(res.getName() + "\n");

        File drawables = new File("C:/Games/res/drawables");
        drawables.mkdir();
        tB.append(drawables.getName() + "\n");

        File vectors = new File("C:/Games/res/vectors");
        vectors.mkdir();
        tB.append(vectors.getName() + "\n");

        File icons = new File("C:/Games/res/icons");
        icons.mkdir();
        tB.append(icons.getName() + "\n");

        File savegames = new File("C:/Games/savegames");
        savegames.mkdir();
        tB.append(savegames.getName() + "\n");

        File temp = new File("C:/Games/temp");
        temp.mkdir();
        tB.append(temp.getName() + "\n");

        tB.append("Созданы файлы:\n");

        File mainJava = new File("C:/Games/src/main/Main.java");
        try {
            mainJava.createNewFile();
        } catch (IOException m) {
            System.out.println(m.getMessage());
        }
        tB.append(mainJava.getName() + "\n");

        File utilsJava = new File("C:/Games/src/main/Utils.java");
        try {
            utilsJava.createNewFile();
        } catch (IOException u) {
            System.out.println(u.getMessage());
        }
        tB.append(utilsJava.getName() + "\n");

        File tempTxt = new File("C:/Games/temp/temp.txt");
        try {
            tempTxt.createNewFile();
        } catch (IOException t) {
            System.out.println(t.getMessage());
        }
        tB.append(tempTxt.getName() + "\n");
        tB.append("Все действия записаны в temp.txt");

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


