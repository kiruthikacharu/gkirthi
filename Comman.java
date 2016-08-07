/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comman;

/**
 *
 * @author Student
 */
public class Comman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     public static String longestCommonPrefix(String[] strings) {
    if (strings.length == 0) {
        return "";   // Or maybe return null?
    }

    for (int prefixLen = 0; prefixLen < strings[0].length(); prefixLen++) {
        char c = strings[0].charAt(prefixLen);
        for (int i = 1; i < strings.length; i++) {
            if ( prefixLen >= strings[i].length() ||
                 strings[i].charAt(prefixLen) != c ) {
                // Mismatch found
                return strings[i].substring(0, prefixLen);
            }
        }
    }
    return strings[0];
}

}


