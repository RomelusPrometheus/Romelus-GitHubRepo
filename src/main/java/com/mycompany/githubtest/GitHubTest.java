/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.githubtest;

/**
 *
 * @author RC_Student_lab
 */
public class GitHubTest {
    
    static GITPRINT Gitty = new GITPRINT();
    public static void main(String[] args) {
        
        
        String name = "Romello";
        String Surname = "Molokomme";
        
        
        Gitty.setName(name);
        Gitty.setSname(Surname);
        
        System.out.println(" Your name is " + Gitty.getName());
        System.out.println(" Your Surname is " + Gitty.getSname());
        
    }
}
