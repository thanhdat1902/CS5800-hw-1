package org.example.folder;

import java.util.ArrayList;

public class Folder {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private ArrayList<Folder> folders;
    private ArrayList<File> files;

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public Folder(String name) {
        this.name = name;
        this.folders = new ArrayList<Folder>();
        this.files = new ArrayList<File>();
    }

    public void addFile(ArrayList<File> files) {
        this.files.addAll(files);
    }

    public void addFolder(ArrayList<Folder> folders) {
        this.folders.addAll(folders);
    }

    private void printTab(int level) {
        for (int i = 0; i < level; i++)
            System.out.print("\t");
    }
    public void print(Folder folder, int level)
    {
        Folder currentFolder = folder;
        if(currentFolder == null) {
            currentFolder = this;
        }
        // for-each loop for main directory files
        for (File f: currentFolder.getFiles()) {
            printTab(level);
            System.out.println(f.getName());
        }
        for (Folder f : currentFolder.getFolders()) {
                printTab(level);
                System.out.println("[" + f.getName() + "]");
                // recursion for sub-directories
                print(f, level + 1);
        }
    }

    public void deleteFolder(Folder folder) {
        this.folders.remove(folder);
    }
    public void deleteFile(File file) {
        this.files.remove(file);
    }
}
