package model;

public class AdditionalClass {
    
    public static String getAuthor1(String authors[], int id){
        return authors[id];
    }
    
    public static String getAuthor2(String authors[], int id){
        String author= null;
        for(int i=0; i<5;i++){
            if(i==id){
                author=authors[i];
            }
        }
        return author;
    }
    
    public static boolean AuthorCompare(String authors[],String author){
        boolean ret=false;
        for(int i=0; i<5;i++){
            if(authors[i].equals(author)){
                return true;
            }
        }
        return ret;
    }
    
}
